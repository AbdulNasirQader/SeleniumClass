package Class1.Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.in/");

        String URL= driver.getCurrentUrl();

        System.out.println(URL);

        String title= driver.getTitle();

        System.out.println(title);

        driver.close();
    }
}
