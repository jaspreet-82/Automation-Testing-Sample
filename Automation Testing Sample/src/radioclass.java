import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioclass {

	public static void main(String[] args) throws InterruptedException {

		// ********This script demonstrates using of Radio button*********//

		// setting the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");

		// driver declaration
		WebDriver driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// launches website homepage of leafground
		driver.get("http://leafground.com");
		Thread.sleep(2000);

		// click the radio button
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a/h5")).click();

		// default selection
		WebElement unchecked = driver
				.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[2]/input"));

		WebElement checked = driver
				.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/label[3]/input"));

		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();

		// limit applied to age range
		System.out.println(status1);
		System.out.println(status2);
		WebElement below20 = driver.findElement(By.name("age"));
		Thread.sleep(2000);
		below20.click();
		Thread.sleep(2000);
		// quitting the driver
		driver.quit();

	}

}
