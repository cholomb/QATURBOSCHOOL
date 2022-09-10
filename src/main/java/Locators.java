import org.openqa.selenium.By;

public class Locators {

    //Registration

    public static final By COURSE_BUTTON = By.cssSelector("a[href='https://www.qaturbo.com/course-overview']");
    public static final By STARTCOURSE_BUTTON= By.cssSelector("a[href='https://www.qaturbo.com/start-the-course']");
    public static final By TEXTFIELD_FIRSTNAME = By.cssSelector("input[name='first-name']");
    public static final By TEXTFIELD_LASTNAME = By.cssSelector("input[name='last-name']");
    public static final By TEXTFIELD_EMAIL = By.cssSelector("input[name='email']");
    public static final By TEXTFIELD_PHONE = By.cssSelector("input[name='phone']");
    public static final By TEXTFIELD_JOBTITLE = By.cssSelector("input[name='your-job title ']");
    public static final By TEXTFIELD_ENGLISHLEVEL= By.cssSelector("input[name='english-level']");
    public static final By TEXTFIELD_LEARNAUTOMATION = By.cssSelector("input[name='why-do you want to learn automation?']");
    public static final By SUBMIT_BUTTON = By.cssSelector("button[data-testid='buttonElement']");

    public static By PRICING_BUTTON = By.xpath("//p[text()='Pricing']");
    public static By GETSUBMIT_BUTTON = By.xpath("//span[text()='Select']");
}
