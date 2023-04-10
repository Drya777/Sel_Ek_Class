package HW1_Mar13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1_DC_etsy {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);

        //Navigate to etsy

        String etsyURL ="https://www.etsy.com/";
        MyDriver.get(etsyURL);

        MyDriver.manage().window().maximize();
        MyDriver.quit();
    }
}
