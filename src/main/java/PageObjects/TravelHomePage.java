package PageObjects;

import PageComponents.FooterNav;
import PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {

    /* This class has only one responsibility to return the object of the Page Components classes
       This is what is expected in the SRP Design Patterns
       Single class should have only single responsibility.
     */

    WebDriver driver;
    public By sectionElement = By.id("traveller-home");
    By navSectionElement = By.xpath("//*[@class='button-align-center']/ul");

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public NavigationBar getNavigationBar() {
        return new NavigationBar(driver,navSectionElement);
    }

    public FooterNav getFooterNav() {
        return new FooterNav(driver, sectionElement);
    }
}
