package hw3;

import org.openqa.selenium.By;

public class LocatorsFirstPage {

//---------------FIRST PAGE----------------------

    private final By LOGO = By.id("logo-cell");
    .//div[@class = 'logo-cell']
    browser.findElement(By.className("logo-cell"));

    private final By EURO = By.id("currentCurrency");
    .//a[@id = 'currentCurrency']

    private final By LOG_IN = By.id("Navigation");
    .//a[@data-label = 'Navigation']

    private final By HEADER_TEXT = By.id("home-caption")
    .//div[@class = 'home-caption']

    private final By RESERVATION_DATE = By.id("fake-field clearfix");
    .//div[@class = 'fake-field clearfix']

    private final By TEXT_LATVIA = By.linkText("sb-residence-text"); //---- здесь можно написать Latvia?
    .//span[@class = 'sb-residence-text']

    private final By SEARCH_BTN = By.id("sb-button");
    .//div[@class = 'sb-button']

    private final By SCROLL_BTN = By.id("svg-slider-arrow");  //---Могу ошибаться!
    .//div[@class = 'svg-slider-arrow']

    private final By RECOMMENDATIONS = By.xpath("tp-widget-review");
    .//div[@class = 'tp-widget-review']

    private final By FOOTER_TEXT = By.linkText("col-12"); //---или "We compare car rental prices, you save!"
    .//div[@class = 'col-12']


//---------------------SECOND PAGE------------------

    private final By CAR_FILTER = By.id("car-groups-small'"); //--Он находит по этому значению
    .//div[@data-id = 'car-groups-small']

    private final By LEFT_SCROLL_BTN = By.id("car-top-filter-control next");
    .//div[@class = 'car-top-filter-control next']

    private final By CAR_QUANTITY = By.linkText("showing-cars"); //---Выбрал linkText, тк искать нужно текст!
    .//span[@class = 'showing-cars']

    private final By FILTER_PRICE = By.xpath("dc-ui dropdown-toggle text-blue-500");
    .//a[@class = 'dc-ui dropdown-toggle text-blue-500']

    private final By ONE_BAG_TEXT = By.xpath("//*[text()='1 bag']"); //---Мучался, но YouTube видео дали о себе знать!
    //*[text()='1 bag']

    private final By SPECIAL_OFFERS = By.xpath("flt-type");
    .//div[@class = 'flt-type']

    private final By RENTAL_CONDITIONS_BTN = By.id("rc-link");
    .//div[@class = 'rc-link']

    private final By VIEW_BTN = By.id("ca-table-cell top");
    .//div[@class = 'ca-table-cell top']

    private final By CAR_SPECIFICATIONS_PRICE = By.linkText("min-price");
    .//span[@class ='min-price']

    private final By CAR_FUEL = By.xpath("//*[text()='Gasoline']");
    //*[text()='Gasoline']

    private final By FULL_PREPAYMENT = By.id("dc-ui badge badge-medium badge-blue");
    .//span[@class = 'dc-ui badge badge-medium badge-blue']

    private final By NUMBER_SEATS = By.id("number-of-seats-seats-4");
    .//label[@for = 'number-of-seats-seats-4']

    private final By RATING = By.id("supplier-rating");
    .//div[@class = 'supplier-rating']

    private final By RENTAL_COST = By.xpath("//*[text()='€ 105.16']");
    //*[text()='€ 105.16']

    //-------------THIRD PAGE-------

    private final By BUBBLE_SEARCH = By.id("Document");
    .//body[@id = 'document']



}
