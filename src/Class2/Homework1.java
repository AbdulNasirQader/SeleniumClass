package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        //driver.manage().window().maximize();

        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Nasir");
        Thread.sleep(3000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Qader");

        driver.findElement(By.id("customer.address.street")).sendKeys("145 topLand");

        driver.findElement(By.id("customer.address.city")).sendKeys("longIsland");

        driver.findElement(By.id("customer.address.state")).sendKeys("NewYork");

        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11910");

        driver.findElement(By.id("customer.phoneNumber")).sendKeys("212-545-9844");

        driver.findElement(By.id("customer.ssn")).sendKeys("011-49-0221");

        driver.findElement(By.id("customer.username")).sendKeys("nasakanair");

        driver.findElement(By.id("customer.password")).sendKeys("king1234");

        driver.findElement(By.id("repeatedPassword")).sendKeys("king1234");

        Thread.sleep(3000);

        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();


    }
}



