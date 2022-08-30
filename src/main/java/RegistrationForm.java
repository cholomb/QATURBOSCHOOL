import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationForm extends BaseActions{
    public RegistrationForm(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public void completePartofRegistration(){
        driver.findElement(Locators.TEXTFIELD_FIRSTNAME).sendKeys(Data.firstname);
        driver.findElement(Locators.TEXTFIELD_LASTNAME).sendKeys(Data.lastname);
        driver.findElement(Locators.TEXTFIELD_EMAIL).sendKeys(Data.email);
        driver.findElement(Locators.TEXTFIELD_PHONE).sendKeys(Data.phone);
        driver.findElement(Locators.TEXTFIELD_JOBTITLE).sendKeys(Data.jobtitle);
        driver.findElement(Locators.TEXTFIELD_ENGLISHLEVEL).sendKeys(Data.englishlevel);
        driver.findElement(Locators.TEXTFIELD_LEARNAUTOMATION).sendKeys(Data.learnautomation);
    }

}
