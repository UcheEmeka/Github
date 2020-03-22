package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class loginTest {
    private WebDriver driver;

    public void SetUp() throws InterruptedException{

        System.setProperty("webdriver.gecko.driver", "E:/test_automation/resources/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("https://github.com/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("login_field")).sendKeys("enter sample email address here");
        driver.findElement(By.id("password")).sendKeys("enter sample password here");
        driver.findElement(By.xpath("//input[@name='commit']")).click();

        driver.close();
    }

    public static void main(String args[]) throws InterruptedException
    {
        loginTest test = new loginTest();
        test.SetUp();
    }
}
