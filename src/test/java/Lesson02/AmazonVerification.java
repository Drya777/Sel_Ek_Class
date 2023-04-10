package Lesson02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions MyOptions = new ChromeOptions();
        MyOptions.addArguments("--remote-allow-origins=*");
        WebDriver MyDriver = new ChromeDriver(MyOptions);

        //navigate  to google
        String googleURL = "https://www.google.com/";
        MyDriver.get(googleURL);

        //then go tp Amazon
        MyDriver.navigate().to("https://www.amazon.ca/");

        //Thread.sleep(1000);

        //make the window fullscreen

        MyDriver.manage().window().fullscreen();


        //navigate back to google using "back button"
        MyDriver.navigate().back();

        //minimize the full screen
       //MyDriver.manage().window().minimize();
//Maximize
        MyDriver.manage().window().maximize();

        //navigate forwards to amazon
        MyDriver.navigate().forward();

        //verification or the title
        String ExpectedWordTitle= "Smile";
        //String ExpectedWordTitle= "Don't Smile";
        String ActualTitle =MyDriver.getTitle();

        if (ActualTitle.contains(ExpectedWordTitle)){
            System.out.println("Amazon's title has the world Smile :Test Passed");
        }else{
            System.out.println("Amazon's title does not have the world Smile :Test Failed");
        }
        System.out.println("Amazon's title is : " + ActualTitle);

        //close the web driver
        MyDriver.quit();//sekmeyi kapatiyor
        //MyDriver.close();  tum sayfayi kapatiyor
    }
}
