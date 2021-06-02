import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrnationalityaddclass {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// setting the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\chrome driver\\chromedriver.exe");

		// driver declaration
		ChromeDriver driver = new ChromeDriver();

		// maximizing the window
		driver.manage().window().maximize();

		// launching orange hrm live website
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);

		// open login page
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);

		// hover on admin tab
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(2000);

		// click on nationalities tab
		driver.findElement(By.id("menu_admin_nationality")).click();
		Thread.sleep(3000);

		// click on add button
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);

		// inputing nationality name
		driver.findElement(By.id("nationality_name")).sendKeys("CANADIAN.");
		Thread.sleep(2000);

		// save the information
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);

		// quitting the driver
		driver.quit();
	}

}
