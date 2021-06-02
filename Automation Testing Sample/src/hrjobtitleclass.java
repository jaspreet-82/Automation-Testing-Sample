import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hrjobtitleclass {

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
		Thread.sleep(3000);

		// click on login button
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);

		// hover on admin tab
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(2000);

		// click on job tab
		driver.findElement(By.id("menu_admin_Job")).click();
		Thread.sleep(2000);

		// select job title from menu bar
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		Thread.sleep(2000);

		// click on add button
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(2000);

		// entering job title,description and note
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Testing Analyst");
		Thread.sleep(2000);

		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Design and develop series of tests");
		Thread.sleep(2000);

		driver.findElement(By.id("jobTitle_note")).sendKeys("Suggesting solutions and monitoring implementation");
		Thread.sleep(2000);

		// click on save button after entering information
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(2000);

		// quitting the driver
		driver.quit();

	}

}
