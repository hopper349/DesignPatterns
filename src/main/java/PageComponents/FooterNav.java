package PageComponents;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FooterNav extends AbstractComponent {

    WebDriver driver;

    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public FooterNav(WebDriver driver, By sectionElement){
        super(driver,sectionElement);
    }
    public void selectFlights(){
        findElement(flights).click();
    }

    public String getFlightAttribute(){
        return findElement(flights).getAttribute("class");
    }
    public List<WebElement> getLinks(){
        return findElements(links);
    }
}
