import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BaseActions{
    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickButton(){
        driver.findElements(Locators.COURSE_BUTTON).get(0).click();
    }
    public void clickButtonFirst(){
        driver.findElement(Locators.STARTCOURSE_BUTTON).click();
    }
    public void clickButtonSecond(){
        driver.findElement(Locators.SUBMIT_BUTTON).click();
    }

    public void clickpricelist(){
        driver.findElement(Locators.PRICING_BUTTON).click();
        wait.until(ExpectedConditions.elementToBeClickable(Locators.GETSUBMIT_BUTTON));
        driver.findElements(Locators.GETSUBMIT_BUTTON).get(1).click();
    }

}
