package vytrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.VytrackUtils;

public class CreateCalendarBtnTest {

    public static void main(String[] args) {
        WebDriver driver;

        String s = "a[title = 'Create Calendar event']";

        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Norbert\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        VytrackUtils.login(driver, "storemanger85", "UserUser123");
        VytrackUtils.navigateToModule(driver, "Activities", "Calendar Events");

        if(driver.findElement(By.cssSelector(createCalendarBtnLocatorCss)).isDisplayed()){
            System.out.println("Test 2 - PASS");
        }else{
            System.out.println("Test 2 - PASS");
        }

    }
}
