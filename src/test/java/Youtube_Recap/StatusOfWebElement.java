package Youtube_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class StatusOfWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register");
        //isDisplayed() IsEnabled()

        WebElement searchStore=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        System.out.println("Displayed status = " + searchStore.isDisplayed());
        System.out.println("Enabled() status= " + searchStore.isEnabled());

        //isSelected
        WebElement Male = driver.findElement(By.xpath("//input[@id='gender-male']"));

        WebElement Female = driver.findElement(By.xpath("//input[@id='gender-female']"));
        System.out.println(Male.isSelected());
        System.out.println(Female.isSelected());

        Male.click();
        System.out.println(Male.isSelected());
        System.out.println(Female.isSelected());

        Female.click();
        System.out.println(Male.isSelected());
        System.out.println(Female.isSelected());
    }
}
