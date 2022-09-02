import io.github.bonigarcia.wdm.WebDriverManager;
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

    MainPage mainPage;
    RegistrationForm registrationForm;

    @BeforeMethod
    public void setUp (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        mainPage = new MainPage(driver,wait);
        registrationForm = new RegistrationForm(driver,wait);
        driver.get(url);
        driver.manage().window().maximize();



    }
    @AfterMethod
    public void tearDown() {
        //driver.quit();

    }
}
