import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KongaCode {
    private WebDriver driver;


    @Test
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web-driver.gecko.driver", "geckodriver.exe");
        //1. open the firefox browser
        WebDriver driver = new FirefoxDriver();

        //2. maximize firefox browser
        driver.manage().window().maximize();

        //3. Visit the URL konga.com
        driver.get("https://www.konga.com/");

        //4. click on login/sign on button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/nav/div[2]/div[1]/div/div/div[4]/a")).click();
        Thread.sleep(10000);

        //5.input email in the email address or phone number field
        driver.findElement(By.id("username")).sendKeys("anozod@gmail.com");

        //6. Input password in the password field
        driver.findElement(By.id("password")).sendKeys("iamSUCCESS");

        //7. click on login
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/div/div/div[1]/form/div[3]/button")).click();
        Thread.sleep(10000);

        //8. click on computer and accessories button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[2]/div/a[2]")).click();
        Thread.sleep(10000);

        //9. click on the Laptops button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li[3]/a/label/span")).click();
        Thread.sleep(10000);

        //10. click on the Apple MacBook button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/div/section/div[2]/div[2]/ul/li/a/ul/li[1]/a/label/span")).click();
        Thread.sleep(10000);

        //11. click on add to cart for the first Apple MacBook to appear on the page
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[3]/section/section/section/section/ul/li[8]/div/div/div[2]/form/div[3]/button")).click();
        Thread.sleep(10000);

        //12. click on the My Cart button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div[1]/div/div/a[2]/span[1]")).click();
        Thread.sleep(10000);

        //13. click on checkout button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[3]/section/section/aside/div[3]/div/div[2]/button")).click();
        Thread.sleep(10000);

        //14. on the checkout page, under payment options click on the pay now button
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[1]/div[1]/span/input")).click();
        Thread.sleep(10000);

        //15. then click on continue to payment
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div[2]/section/main/div/form/div/div[1]/section[2]/div/div[2]/div[3]/div[2]/div/button")).click();
        Thread.sleep(10000);
    }
}


        //16. click on card button
        ///WebElement acceptBtn = driver.findElement(By.cssSelector(".Card"));
        //acceptBtn.click();
        //var modalButton = driver.findElement(By.xpath("//button[@value='kpaygateway']"));
        //modalButton.click();
        //Thread.sleep(10000);
        //WebElement modalContainer =
        //modalContainer = driver.findElement(By.xpath("//div[@class='data-card__content']']"));
        //WebElement modalContentBody = modalContainer.findElement(By.xpath(".//div[@class='data-card__content']']"));

        //WebElement modalAcceptButton = modalContainer.findElement(By.xpath(".//button[@class='dashboard-card__button Card']"));
        //modalAcceptButton.click();

















































