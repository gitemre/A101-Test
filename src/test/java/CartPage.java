import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CartPage extends BasePage {

    By verifyBasket = By.cssSelector(".button.green.checkout-button.block.js-checkout-button");

    By withoutMemberGo = By.cssSelector("a[title='ÜYE OLMADAN DEVAM ET']");

    By setEmail = By.cssSelector("input[name='user_email']");

    By clickAndGoCheckoutPage = By.cssSelector("button[class='button block green']");

    By newAddress = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a/em");

    By setAddressName = By.xpath("//input[@placeholder='Ev adresim, iş adresim vb.']");

    By setName = By.cssSelector("input[name='first_name']");

    By setSurname = By.cssSelector("input[name='last_name']");

    By setPhoneNumber = By.cssSelector("input[name='phone_number']");

    By setAdressArea = By.cssSelector("textarea[name='line']");

    By registerButton = By.xpath("//button[normalize-space()='KAYDET']");

    By registerAndGo = By.cssSelector(".button.block.green.js-proceed-button");




     CartPage(WebDriver driver) {
        super(driver);
    }

    public void checkAndBuy() throws InterruptedException {
        click(verifyBasket);
        click(withoutMemberGo);
        type(setEmail,"emre@mail.com");
        click(clickAndGoCheckoutPage);
        click(newAddress);
        type(setAddressName,"Ofis");
        type(setName,"Emre");
        type(setSurname,"Öztürk");
        type(setPhoneNumber,"5531807745");
        WebElement selectCity = driver.findElement((By.cssSelector("select[name='city']")));
        WebElement selectTown = driver.findElement((By.cssSelector("select[name='township']")));
        WebElement selectStreet = driver.findElement(By.cssSelector("select[name='district']"));
        Select selectObject = new Select(selectCity);
        Select selectObject2 = new Select(selectTown);
        Select selectObject3 = new Select(selectStreet);

        Thread.sleep(3000);
        selectObject.selectByVisibleText("ANKARA");
        Thread.sleep(3000);
        selectObject2.selectByVisibleText("ÇANKAYA");
        Thread.sleep(3000);
        selectObject3.selectByVisibleText("AHLATLIBEL MAH");
        type(setAdressArea,"Üniversiteler Mahallesi 1596. Cadde Hacettepe Teknokent"+Math.random()*5000);
        Thread.sleep(3000);
        click(registerButton);
        Thread.sleep(3000);
        click(registerAndGo);

    }
}
