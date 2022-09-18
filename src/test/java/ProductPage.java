import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ProductPage extends BasePage {

    By clickSubCategoryLocator = By.cssSelector(".js-filter-link[href='/giyim-aksesuar/kadin-ic-giyim/']");
    By clickSub2CategoryLocator = By.cssSelector(".js-filter-link[href='/giyim-aksesuar/dizalti-corap/']");
    By clickBlackCheckbox = By.cssSelector("label[for='attributes_integration_colourSİYAH']");
    By clickProduct = By.cssSelector("a[title='Penti Kadın 50 Denye Pantolon Çorabı Siyah'] h3[class='name']");
    By selectedColor = By.xpath("//span[contains(text(),'SİYAH')]");
    By addtoBasket = By.cssSelector(".add-to-basket.button.green.block.with-icon.js-add-basket");


    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickProduct() throws InterruptedException {

        click(clickSubCategoryLocator);
        Thread.sleep(3000);
        click(clickSub2CategoryLocator);
        Thread.sleep(3000);
        click(clickBlackCheckbox);
        Thread.sleep(3000);
        click(clickProduct);
        click(addtoBasket);


    }
    public boolean isBlack(){
        return isDisplayed(selectedColor);

    }


}
