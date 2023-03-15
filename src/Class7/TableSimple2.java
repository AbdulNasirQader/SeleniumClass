package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.List;

public class TableSimple2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        //WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");

                // Table Level Access
                driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
                        WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data=table.getText();
        System.out.println(table_data);

        System.out.println("**");
        // Row Level Access
        List<WebElement>Rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row : Rows) {
            String row_text= row.getText();
            if(row_text.contains("Google")){
                System.out.println(row_text);
            }
            System.out.println(row_text);

        }

        System.out.println("**");
        // Column Level Access
        List<WebElement>columns=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement column : columns) {
            System.out.println(column.getText());
        }
        System.out.println("**");
        // Task 4 :
        List<WebElement> columns1=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        for (WebElement column1 : columns1) {
            System.out.println(column1.getText());
        }

    }}
