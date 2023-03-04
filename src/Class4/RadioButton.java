package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {

        // tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        // create an instance of WebDriver
        WebDriver driver=new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        // go to syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        // click on the radio button
        WebElement malebtn = driver.findElement(By.cssSelector("input[value='Male']"));

        // check if the radio button is enabled
        boolean isEnabledMale = malebtn.isEnabled();
        System.out.println("the radio button male is enabled "+isEnabledMale);

        // check if the radio button is displayed
        boolean isDisplayedMale = malebtn.isDisplayed();
        System.out.println("the radio button male is displayed "+isDisplayedMale);

        // check if radio button is selected
        boolean isSelectedmale = malebtn.isSelected();
        System.out.println("the radio button is selected "+isSelectedmale);

        // if the radio button is not selected click on it
        if (!isSelectedmale){
            malebtn.click();
        }

        // check if the radio button is selected after the click
        isSelectedmale=malebtn.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);

    }
}
