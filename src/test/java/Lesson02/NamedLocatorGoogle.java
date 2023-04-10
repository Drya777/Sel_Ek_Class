package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NamedLocatorGoogle {
    public static void main(String[] args) throws InterruptedException {
//My setup procedure for the chromedriver to use my browser with my code
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);

        //navigates to google
        String googleURL = "https://www.google.com/";
        MyDriver.get(googleURL);

        //Name locater
        WebElement GoogleSearchBox = MyDriver.findElement(By.name("q"));
        //this method is for typing into elements
        //GoogleSearchBox.sendKeys("I NEED BAKLAVA");
        GoogleSearchBox.sendKeys("Walmart cheapest Laptop");

        Thread.sleep(2500);

        //Now press search button(like mouse)
        WebElement GoogleSearchButton = MyDriver.findElement(By.name("btnK"));
        GoogleSearchButton.click();
        Thread.sleep(4000);
        MyDriver.close();
    }
}
