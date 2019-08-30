import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class webapplicationTest {

    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "https://www.thegreatcourses.com/";
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Inteliji\\CVP\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.xpath("//button[@class='bx-button'][contains(text(),\"I'm Not Interested\")][1]")).click();
        //driver.findElement(By.cssSelector("#raleigh-field-submit")).click();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0,400)");
       // Thread.sleep(10000);

        /*driver.findElement(By.cssSelector("[alt='Science']:nth-of-type(1)")).click();
        WebElement dropDownElement = driver.findElement(By.cssSelector("select#sort_option_selector"));
        Select select = new Select(dropDownElement);
        select.deselectByVisibleText("Price low to high");
         */

        driver.findElement(By.cssSelector(".priority-code-empty")).click();
        //branch change
    }
}
