package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkTestLocator {
    public static void main(String[] args) throws InterruptedException {
        //create the driver instance
        WebDriverManager.chromedriver().setup();
        //WebDriver MyDriver= new ChromeDriver();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);

        //go to google.com and then press gmail
        MyDriver.get("https://www.google.com/");
        Thread.sleep(1000);

        //

        MyDriver.findElement(By.linkText("Images")).click();
        Thread.sleep(3000);

        MyDriver.findElement((By.linkText("Sign")));

        //find the link Text = gmail and click
        MyDriver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(1000);
        MyDriver.close();
    }
}
