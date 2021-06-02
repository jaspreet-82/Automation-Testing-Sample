import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class populationmeterclass {

	public static void main(String[] args) {
		// setting the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");

		// driver declaration
		WebDriver driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// launches cosmocode automation practice website
		driver.get("https://www.worldometers.info/world-population/");

		while (true) {
			List<WebElement> popuList = driver.findElements(By.xpath("//*[@id=\"maincounter-wrap\"]/div"));

			for (WebElement e : popuList) {

				System.out.println(e.getText());
			}
		}
	}

}
