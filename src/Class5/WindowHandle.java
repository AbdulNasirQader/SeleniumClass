package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S1409567013%3A1678243099833037&continue=https%3A%2F%2Fwww.google.com%2F&ec=GAZAmgQ&hl=en&passive=true&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AWnogHfBT01cQB8_eyv1NU6H53y32xh63kKWhruqgz5CWgch5fn2CIq2KdxfWKnXd2QghEvw7WAq3A");

        // click on the help button
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        // click on Privacy
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();

        // get the window handel of the parent window
       String parentWindowHandel = driver.getWindowHandle();
        System.out.println(parentWindowHandel);

        // get window handle of all the windows that have been opened up
        Set<String> windowHandles = driver.getWindowHandles();

        // print all the window handles
        for (String wh:windowHandles){
            System.out.println();
        }


    }
}
