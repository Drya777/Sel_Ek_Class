package Youtube_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com");
        //driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");//navigate.to() same as get but
        // there is difference 

        driver.navigate().back();//snapdeal
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
