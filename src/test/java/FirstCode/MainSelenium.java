package FirstCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainSelenium {
    public static void main(String[] args) {
        //My Maven project still works like a normal Java code
        System.out.println("Hello World");
        //set up driver before we creating it
        WebDriverManager.chromedriver().setup();

        //Special object that can control my Web browser
        //driver.close();
        WebDriver MyDriver = new ChromeDriver();

        //Navigate to facebook on GoogleChrome
//         String facebookURL ="https://www.facebook.com/";
//        MyDriver.get(facebookURL);
        MyDriver.get("https://www.facebook.com/");
    }
}
