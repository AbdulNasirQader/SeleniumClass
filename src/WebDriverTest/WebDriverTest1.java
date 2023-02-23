package WebDriverTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebDriverTest1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // for windows add extension .exe
        //  you can use \
        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.google.com/"); // navigate to the specified url
        driver.manage().window().maximize();
        driver.close();

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver(); //launch the browser
        driver2.get("https://www.google.com/"); // navigate to the specified url
        driver2.manage().window().maximize();
        driver2.close();
    }

}
