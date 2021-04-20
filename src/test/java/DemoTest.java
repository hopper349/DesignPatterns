import PageObjects.TravelHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {


    @Test
    public void validateFlights() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();

        //System.out.println(travelHomePage.getFooterNav().getFlightAttribute());
        //travelHomePage.getFooterNav().selectFlights();

        System.out.println(travelHomePage.getNavigationBar().getLinks().size());
        System.out.println(travelHomePage.getFooterNav().getLinks().size());
        driver.quit();
        //Newly added comment
    }
}
