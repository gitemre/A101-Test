import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Test_Add_Product_To_Cart extends BaseTest {

    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;


    @Test
    @Order(1)
    public void click_a_category(){
        homePage = new HomePage(driver);
        homePage.clickCategory();
    }
    @Test
    @Order(2)
    public void click_a_product() throws InterruptedException {
        productPage = new ProductPage(driver);
        productPage.clickProduct();
        String getBlack = driver.findElement(By.xpath("//span[contains(text(),'SİYAH')]")).getText();
        Assertions.assertTrue(productPage.isBlack(), getBlack);
        System.out.println("Seçilen Renk : "+getBlack);

    }






}
