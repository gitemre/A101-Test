import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage {

    By acceptCookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By clickCategoryLocator = By.cssSelector("ul[class='desktop-menu'] a[title='GİYİM & AKSESUAR']");

    public HomePage(WebDriver driver) {
        super(driver);

    }

    public void clickCategory(){
        driver.navigate().refresh();
        click(acceptCookies);
        click(clickCategoryLocator);


    }








}
