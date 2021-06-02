import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fillformclass {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// ***************This script shows filling of personal information**********
		// setting the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");

		// driver declaration
		WebDriver driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// launches cosmocode automation practice website
		driver.get("https://cosmocode.io/automation-practice/");

		// reload the page

		WebElement lnk = driver.findElement(By.linkText("Click here to reload this page"));
		lnk.click();
		Thread.sleep(2000);

		// fill the form with personal details

		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("John");
		Thread.sleep(2000);

		WebElement lastname = driver.findElement(By.className("lastname"));
		lastname.sendKeys("smith");
		Thread.sleep(2000);

		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		gender.click();
		Thread.sleep(2000);

		WebElement language = driver.findElement(By.cssSelector("input[value='java']"));
		language.click();
		Thread.sleep(2000);

		// limit applied to age range
		WebElement age = driver.findElement(By.name("age"));
		Select select = new Select(age);
		select.selectByValue("20 to 29");
		Thread.sleep(3000);

		// submit the form
		driver.findElement(By.id("submit_htmlform")).click();
		Thread.sleep(2000);

		// quitting the driver
		driver.quit();

	}
}
