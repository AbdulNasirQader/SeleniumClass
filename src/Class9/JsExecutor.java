package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {

    public static void main(String[] args) {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        // find the webElement username
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");

       // to highlight the username box

        // 1. declare isntance
        JavascriptExecutor js=(JavascriptExecutor) driver;
        // 2.execute script
       // js.executeScript("arguments[0].style.border='10px dotted pink'\",username");
        js.executeScript("arguments[0].style.border='5px dotted blue'",username);

        // find the WebElement
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        // click the login button
        js.executeScript("arguments[0].click();",loginBtn);
    }
}
