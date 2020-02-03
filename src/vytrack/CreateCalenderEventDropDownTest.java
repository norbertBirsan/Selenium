package vytrack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCalenderEventDropDownTest {
    public static void main(String[] args) {
        WebDriver driver;

        String createCalendarBtnLocatorCss = "a[title = 'Create Calendar event']";
        String saveAndCloseBtnLocatrXpath = "//div/button[contains(text(), 'Save and Close')]";
        String dorpDownBtnLocatorXpath = "//a[@class = 'btn-success btn dropdown-toggle']";
        //                                  //a/span[#class = 'care']
        String saveAndCloseOptionLocatorXpath = "//li/button[contains(text(),'Save and Close')]";
        String savAndNewOptionLocatorXpath = "(//li/button[contains(text(), 'Save')])[3]";
        String saveOptionLocatorXpath = "(//li/button[contains(text(), 'Save')])[3]";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Norbert\\Documents\\Selenium Dependencies\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa2.vytrack.com/user/login");
    }
}
