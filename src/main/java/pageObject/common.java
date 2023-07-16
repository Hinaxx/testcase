package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class common {

    public static WebDriver edriver;
    public static WebDriverWait ewait;
    @FindBy(how = How.XPATH, using = "//li/a[text()='Log in']")
    public WebElement login;
    @FindBy(how = How.XPATH, using = "//input[@id='loginusername']")
    public WebElement userName;
    @FindBy(how = How.XPATH, using = "//input[@id='loginpassword']")
    public WebElement passWord;
    @FindBy(how = How.XPATH, using = "//button[text()='Log in']")
    public WebElement submitLogin;
    @FindBy(how = How.XPATH, using = "//a[@id='nameofuser']")
    public WebElement afterLogin;
    @FindBy(how = How.XPATH, using = "//a[text()='Samsung galaxy s6']")
    public WebElement samsungLink;
    @FindBy(how = How.XPATH, using = "//h2[@class='name']")
    public WebElement samsung;
    @FindBy(how = How.XPATH, using = "//h3[@class='price-container']")
    public WebElement price;
    @FindBy(how = How.XPATH, using = "//div[@class='tab-pane fade active in']")
    public WebElement desc;
    @FindBy(how = How.XPATH, using = "//a[text()='Add to cart']")
    public WebElement addCart;
    @FindBy(how = How.XPATH, using = "//li/a[text()='Cart']")
    public WebElement cart;
    @FindBy(how = How.XPATH, using = "//td[text()='Samsung galaxy s6']")
    public WebElement infosamsung;
    @FindBy(how = How.XPATH, using = "//td[text()='360']")
    public WebElement pricesamsung;
    @FindBy(how = How.XPATH, using = "//td/a[text()='Delete']")
    public WebElement delete;
    @FindBy(how = How.XPATH, using = "//li/a[text()='Home ']")
    public WebElement home;
    @FindBy(how = How.XPATH, using = "//a[text()='Nokia lumia 1520']")
    public WebElement nokia;
    @FindBy(how = How.XPATH, using = "//button[text()='Place Order']")
    public WebElement placeorder;
    @FindBy(how = How.XPATH, using = "//input[@id='name']")
    public WebElement placeName;
    @FindBy(how = How.XPATH, using = "//input[@id='country']")
    public WebElement country;
    @FindBy(how = How.XPATH, using = "//div[@id='orderModal']//button[text()='Close']")
    public WebElement close;
    @FindBy(how = How.XPATH, using = "//li/a[text()='Log out']")
    public WebElement logout;

    @FindBy(how = How.XPATH, using = "//a[@id='cartur']")
    public WebElement placeOrderHeader;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-item active']//a[@class='nav-link']")
    public WebElement homeHeader;

    @FindBy(how = How.XPATH, using = "//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']")
    public WebElement closeForm;
    @FindBy(how = How.XPATH, using = "//button[normalize-space()='Place Order']")
    public WebElement buttonPlaceOrder;

    @FindBy(how = How.ID, using = "name")
    public WebElement nameInput;

    @FindBy(how = How.ID, using = "country")
    public WebElement countryInput;

    @FindBy(how = How.ID, using = "city")
    public WebElement cityInput;

    @FindBy(how = How.ID, using = "card")
    public WebElement cardInput;

    @FindBy(how = How.ID, using = "month")
    public WebElement monthInput;

    @FindBy(how = How.ID, using = "year")
    public WebElement yearInput;

    public common(WebDriver driver) throws Exception {
        edriver = new EdgeDriver();
        PageFactory.initElements(edriver, this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(5));
        edriver.get("https://demoblaze.com/");
    }

    public void waitUntil(WebElement element) {
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }
    public void waitUntilPath(String path) throws Exception{
        int tryTimes = 0;
        while (tryTimes < 2){
            try {
                WebElement element = edriver.findElement(By.xpath(path));
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            }
            catch (StaleElementReferenceException se){
                tryTimes ++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }

    public void text (WebElement element) throws Exception {
        waitUntil(element);
        System.out.println(element.getText());
    }
}
