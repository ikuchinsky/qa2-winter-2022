package hm4;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileDeTest {
    private final By ACCEPT_COOKIES = By.id("sp-cc-accept");
    private final By SHIPPING_COUNTRY_BTN = By.xpath("//input[@class = 'a-button-input']");
    private final By BEST_SELLERS_BTN = By.xpath("//*[text()='Best Sellers']");
    private final By BOOK_BTN = By.xpath("//a[@href = '/-/en/gp/bestsellers/books/ref=zg_bs_nav_0']");
    private WebDriver browser;
    private WebDriverWait wait;

    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.amazon.de/");

        browser.findElement(ACCEPT_COOKIES).click();
        //browser.findElement(SHIPPING_COUNTRY_BTN).click();
        browser.findElement(BEST_SELLERS_BTN).click();
        browser.findElement(BOOK_BTN).click();


    }
}

