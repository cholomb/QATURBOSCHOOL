import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MainTests extends BaseUI {

    By courseButton = By.cssSelector("a[href='https://www.qaturbo.com/course-overview']");
    By startcourseButton = By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    By textFieldFirstName = By.cssSelector("input[name='first-name']");
    By textFieldLastName = By.cssSelector("input[name='last-name']");
    By textFieldEmail = By.cssSelector("input[name='email']");
    By textFieldPhone = By.cssSelector("input[name='phone']");
    By textFieldJobTitle = By.cssSelector("input[name='your-job title ']");
    By textFieldEnglishLevel = By.cssSelector("input[name='english-level']");
    By textFieldLearnAutomation = By.cssSelector("input[name='why-do you want to learn automation?']");
    By submitButton = By.cssSelector("button[data-testid='buttonElement']");
    String firstname = "ooo";
    String lastname = "lll";
    String email = "777@gmail.com";
    String phone = "0808";
    String jobtitle = "junior";
    String englishlevel = "start level";
    String learnautomation = "i like it";
    By pricingButton = By.cssSelector("a[href='https://www.qaturbo.com/plans-pricing']");
    By getSubmitButton = By.cssSelector("button[data-hook='plan-cta']");

    @Test public void mainPageTests1() {
        driver.findElements(courseButton).get(0).click();
        driver.findElement(startcourseButton).click();
        driver.findElement(textFieldFirstName).sendKeys(firstname);
        driver.findElement(textFieldLastName).sendKeys(lastname);
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPhone).sendKeys(phone);
        driver.findElement(textFieldJobTitle).sendKeys(jobtitle);
        driver.findElement(textFieldEnglishLevel).sendKeys(englishlevel);
        driver.findElement(textFieldLearnAutomation).sendKeys(learnautomation);
        driver.findElement(submitButton).click();
    }

    @Test public void mainPageTests2() {
        driver.findElement(pricingButton).click();
        wait.until(ExpectedConditions.elementToBeClickable(getSubmitButton));
        driver.findElement(getSubmitButton).click();

    }


}
