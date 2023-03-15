package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class TablesSimple {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        //WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com/");


        //go to website
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //task 1
        // get the whole table accessed and print it on the console
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
        System.out.println(table_data);

        //task 2 : row level access
        // get the rows of the table and print them
        // modification : print the row that contains Company google
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        //print the rows
        for (WebElement row:Rows){
            // extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")){
            System.out.println(row_text);
        }
        }
        // task 3 : column level access
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns) {
            System.out.println(column.getText());
        }

        // task 4: just print the first column of every row
       List<WebElement> first_columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for (WebElement first_col:first_columns){
            System.out.println(first_col.getText());
        }




    }}

