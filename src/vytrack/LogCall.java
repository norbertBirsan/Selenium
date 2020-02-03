package vytrack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LogCall {
    public static void main(String[] args) {

        String userNameLocator = "prependedInput";
        String passwordLocator = "prependedInput2";
        String moduleLocatorXpath = "//spam(contains(text(),'Activities')]";
        String tabLocator = "//span[.='Calls']";
        String logCallButtonLocator = "        String logCallButtonLocator = \"\"\n";



        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Norbert\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");

        driver.findElement(By.id(userNameLocator)).sendKeys("storemanager85");
        driver.findElement(By.id(passwordLocator)).sendKeys("UserUser123" + Keys.ENTER);

        SeleniumUtils.pause(5);

        driver.findElement(By.xpath(tabLocator)).click();

        SeleniumUtils.pause(2);

        driver.findElement(By.xpath(moduleLocatorXpath)).click();

        SeleniumUtils.pause(2);

        if(driver.findElement(By.cssSelector(logCallButtonLocator)).isDisplayed()){
            System.out.println("Test 1 Passed");
        }else{
            System.out.println("Test 1 FAILED");
        }
    }
}
