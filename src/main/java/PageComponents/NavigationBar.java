package PageComponents;

import AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigationBar extends AbstractComponent {

    By flights = By.cssSelector("[title='Flights']");
    By links = By.cssSelector("a");

    public NavigationBar(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    public List<WebElement> getLinks(){
        return findElements(links);
    }

}
