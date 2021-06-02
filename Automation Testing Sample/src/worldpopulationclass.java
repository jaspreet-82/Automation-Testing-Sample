import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldpopulationclass {

	public static void main(String[] args) throws InterruptedException {

		// *********This script shows live world population meter*******
		// setting the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");

		// driver declaration
		ChromeDriver driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// launches world population meter website
		driver.get("https://www.worldometers.info/world-population/");

		// retrieve world population
		while (true) {

			List<WebElement> popuList = driver
					.findElements(By.xpath("//div[@class='maincounter-number']/span[@class='rts-counter']"));

			for (WebElement e : popuList) {

				System.out.println(e.getText());
				// Thread.sleep(1000);

				// quitting the driver
				driver.quit();
			}
		}

	}
}
