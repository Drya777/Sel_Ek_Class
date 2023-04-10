package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IdAmazonLocator {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);

        //Maximize the Window
        Thread.sleep(1000);
        MyDriver.manage().window().maximize();

        //open Amazon page
        MyDriver.get("https://www.amazon.ca/");
        Thread.sleep(2000);

        //id locator to press the amazon button
        MyDriver.findElement(By.className("nav-cart-count")).click();
    }
}
