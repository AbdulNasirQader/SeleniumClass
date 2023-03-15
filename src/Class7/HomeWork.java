package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        //WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");


                driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
                        driver.findElement(By.xpath("//button[@id='alert']")).click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h2[text()='Selenium Webdriver']")));
        WebElement text=driver.findElement(By.xpath("//h2[text()='Selenium Webdriver']"));
        String tgttxt=text.getText();
        System.out.println(tgttxt);

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Enabled']")));
        WebElement button=driver.findElement(By.xpath("//button[text()='Enabled']"));
        Boolean but=button.isDisplayed()&& button.isEnabled();
        System.out.println(but);

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Button']")));
        WebElement button1=driver.findElement(By.xpath("//button[text()='Button']"));
        Boolean but1=button.isDisplayed()&& button.isEnabled();
        System.out.println(but1);

        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@type='checkbox']")));
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        wait.until(ExpectedConditions.elementToBeSelected(checkBox));
        Boolean check=checkBox.isSelected();
        System.out.println(check);
    }


}
