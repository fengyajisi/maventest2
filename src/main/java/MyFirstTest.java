import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by yaoyi on 2017/3/6.
 */
public class MyFirstTest {

    @Test
    public void startWebDriver(){
        System.setProperty("webdriver.gecko.driver","D:\\IDE\\Sources\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
    driver.navigate().to("http://www.google.com");
    Assert.assertTrue("title is:",driver.getTitle().startsWith("Google"));
    driver.close();
    driver.quit();
    }
}
