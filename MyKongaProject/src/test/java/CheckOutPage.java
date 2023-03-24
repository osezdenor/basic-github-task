import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {

    private WebDriver driver;
    private By payNowButton = By.xpath("//button[@data-payment-method='kpaygateway']");
    private By continueToPaymentButton = By.xpath("//button[@value='kpaygateway']");
    private By checkOut_iFrame = By.xpath("//*[@id='kpg-frame-component']");
    private By cardButton = By.cssSelector(".Card");
    private By cardNumberField = By.xpath("//*[@id='card-number']");
    private By dateField = By.id("expiry");
    private By cvvField = By.id("cvv");
    private By invalidMessage = By.xpath("//*[@id='card-number_unhappy']");
    private By cardPin = By.xpath("//input[@id='card-pin-new']");
    private By pin0 = By.xpath("//button[@value='0']");
    private By pin1 = By.xpath("//button[@value='1']");
    private By pin2 = By.xpath("//button[@value='2']");
    private By pin3 = By.xpath("//button[@value='3']");
    private By pin4 = By.xpath("//button[@value='4']");
    private By pin5 = By.xpath("//button[@value='5']");
    private By pin6 = By.xpath("//button[@value='6']");
    private By pin7 = By.xpath("//button[@value='7']");
    private By pin8 = By.xpath("//button[@value='8']");
    private By pin9 = By.xpath("//button[@value='9']");



    public CheckOutPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void clickOnPayNow()
    {
        driver.findElement(payNowButton).click();
    }

    public void clickContinueToPayment() throws InterruptedException
    {
        driver.findElements(continueToPaymentButton).get(1).click();
        Thread.sleep(10000);
    }

    //Select the Payment Type
    public void clickOnPaymentType() throws InterruptedException
    {
        WebElement checkOutFrame = driver.findElement(checkOut_iFrame);
        //Switch to iFrame
        driver.switchTo().frame(checkOutFrame);
        driver.findElement(cardButton).click();
        Thread.sleep(3000);
    }

    //Enter card details
    public void enterCardDetails(String cardNumber, String date, String cvv)
    {
        driver.findElement(cardNumberField).sendKeys(cardNumber);
        driver.findElement(dateField).sendKeys(date);
        driver.findElement(cvvField).sendKeys(cvv);
    }

    //Click  on the pin field
    public void clickOnPinField()
    {
        driver.findElement(cardPin).click();
    }

    //Click the entered pin
    public void clickOnPin(int pinEntered)
    {
        switch (pinEntered)
        {
            case 0: driver.findElement(pin0).click();
                break;
            case 1: driver.findElement(pin1).click();
                break;
            case 2: driver.findElement(pin2).click();
                break;
            case 3: driver.findElement(pin3).click();
                break;
            case 4: driver.findElement(pin4).click();
                break;
            case 5: driver.findElement(pin5).click();
                break;
            case 6: driver.findElement(pin6).click();
                break;
            case 7: driver.findElement(pin7).click();
                break;
            case 8: driver.findElement(pin8).click();
                break;
            case 9: driver.findElement(pin9).click();
                break;
            default: System.out.println("Value entered is invalid");
                break;
        }
    }

    //Return User invalid message
    public String invalid_message()
    {
        return driver.findElement(invalidMessage).getText();
    }



















}
