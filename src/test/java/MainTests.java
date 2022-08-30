
import org.testng.annotations.Test;



public class MainTests extends BaseUI {



    @Test public void completeRegistrationTests(){
        mainPage.clickButton();
        mainPage.clickButtonFirst();
        registrationForm.completePartofRegistration();
        mainPage.clickButtonSecond();
    }

    @Test public void pricingTests(){
        mainPage.clickpricelist();
    }

}
