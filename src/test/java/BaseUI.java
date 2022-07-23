import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseUI {
    String url = "https://www.qaturbo.com/";
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp (){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));


    }
    @AfterMethod
    public void tearDown() {
        //driver.quit();

    }
}
