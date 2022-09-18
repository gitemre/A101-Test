import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailPage extends BasePage{

    By addToCartButtonLocator = By.cssSelector("button.add-to-basket");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }



    public void addToCart(){
        click(addToCartButtonLocator);
    }

}
