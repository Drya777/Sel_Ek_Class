package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserNavigationBasics {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
       MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);


        //navigate to Amazon
        //System.out.println("https://www.amazon.ca/");
        String amazonURL = "https://www.amazon.ca/";
        MyDriver.get(amazonURL);

        //make the browser larger(maximize)
        MyDriver.manage().window().maximize();
        //every time thread sleep is here,I can make webDriver wait
        //Thread.sleep(2500);

        //get the title of a website
        System.out.println("Current title of the page is " + MyDriver.getTitle());
        System.out.println("Current title of the page is " + MyDriver.getCurrentUrl());

        //Close the browser
        //MyDriver.close();
        System.out.println("*****************");
        String teslaURL = "https://www.tesla.com/en_ca";
        MyDriver.get(teslaURL);
        System.out.println("Current title of the page is " + MyDriver.getTitle());
        System.out.println("Current title of the page is " + MyDriver.getCurrentUrl());
        //MyDriver.close();
    }
}
