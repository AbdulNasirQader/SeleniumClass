package Class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //  2)
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.click();
        textBox.clear();
        textBox.sendKeys("Hello World!");
        System.out.println(textBox.getText());
        driver.switchTo().defaultContent();
        driver.quit();

    }
}
