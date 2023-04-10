package Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SetBrowser {
    public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
        String googleURL = "https://www.google.com/";
        //Safari
        WebDriverManager.safaridriver().setup();
        //ChromeOptions MyOptions = new ChromeOptions();
        //MyOptions.addArguments("--remote-allow-origins=*");
        //WebDriver MyDriver = new ChromeDriver(MyOptions);

        WebDriver MyDriverS = new SafariDriver();
        MyDriverS.get(googleURL);

        //FireFox
        WebDriverManager.firefoxdriver().setup();
        WebDriver MyDriverF = new FirefoxDriver();
        MyDriverF.get(googleURL);

        //Edge
        WebDriverManager.edgedriver().setup();
        WebDriver MyDriverE = new FirefoxDriver();
        MyDriverE.get(googleURL);

        //Chrome
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriverC = new ChromeDriver(MyOptions);
        MyDriverC.get(googleURL);

        MyDriverS.quit();
        MyDriverF.quit();
        MyDriverE.quit();
    }
}
