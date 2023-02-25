package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // open up facebook.com
        driver.get("https://www.facebook.com/");

        // send in the username
        driver.findElement(By.id("email")).sendKeys("Nasir");

        // send in the password
        driver.findElement(By.name("pass")).sendKeys("kingdkdke");

        // click on the button create Account
        //driver.findElement(By.linkText("Create new account")).click();

        //click on forgotten password
        driver.findElement(By.partialLinkText("password")).click();

        // close browser
        driver.quit();
    }
}
