
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlemapclass {

	public static void main(String[] args) throws InterruptedException {
		// ***********This script launches city "Mississauga" in google maps*********//

		// setting the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");

		// driver declaration
		ChromeDriver driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// launching google maps
		driver.get("https://www.google.com/maps");

		// search any place,address or city
		// entering city's name in google maps
		Thread.sleep(2000);
		driver.findElement(By.className("tactile-searchbox-input")).sendKeys("Mississauga");

		Thread.sleep(2000);
		driver.findElementByXPath("//*[@id=\"searchbox-searchbutton\"]").click();

		Thread.sleep(2000);

		// quitting the driver
		driver.quit();

	}

}
