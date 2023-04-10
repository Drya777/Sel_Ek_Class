package HW1_Mar13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task2_DC_Amazon {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);

        String googleURL ="https://www.amazon.ca/" ;
        MyDriver.get(googleURL);

        WebElement GoogleSearchBox = MyDriver.findElement(By.name("q"));
    }
}
