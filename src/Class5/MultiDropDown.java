package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        // get the dropdown
       WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

       // use the select class
        Select sel = new Select(DD);

        // Select by value
        sel.selectByValue("New Jersey");

        // select by visible text
        sel.selectByVisibleText("Ohio");

        // to slow
        Thread.sleep(2000);

        // when it come MultiSelect Drop Down we can also deselect
        sel.deselectByValue("New Jersey");

        sel.selectByVisibleText("Ohio");

        //System.out.println("The drop down is multiple "+);


    }
}
