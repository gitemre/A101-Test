import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    By verifyBasket = By.cssSelector(".button.green.checkout-button.block.js-checkout-button");

    By withoutMemberGo = By.cssSelector("a[title='ÜYE OLMADAN DEVAM ET']");

    By setEmail = By.cssSelector("input[name='user_email']");

    By clickAndGoCheckoutPage = By.cssSelector("button[class='button block green']");

     CartPage(WebDriver driver) {
        super(driver);
    }

    public void checkAndBuy(){
        click(verifyBasket);
        click(withoutMemberGo);
        type(setEmail,"emre@mail.com");
        click(clickAndGoCheckoutPage);
    }
}
