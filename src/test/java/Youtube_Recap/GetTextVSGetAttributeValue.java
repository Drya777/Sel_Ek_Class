package Youtube_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVSGetAttributeValue {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        WebElement emailinputbox = driver.findElement(By.id("Email"));
        //emailinputbox.clear();
//        emailinputbox.sendKeys("adm123@gmail.com");
        //how can we capture inside input box

        //capturing text from inputbox finding attribute
        System.out.println("Result from getAttribute()= " + emailinputbox.getAttribute("value"));
        System.out.println("Result from getText()= " + emailinputbox.getText());//it is not returning like that
        //it is returning to inner text if we don't have it doesn't return anything

        //Login button
        WebElement button = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        System.out.println(button.getAttribute("type"));
        System.out.println(button.getAttribute("class"));

        System.out.println(button.getText());

        String title=driver.findElement(By.xpath("//div[@class='page-title']//h1")).getText();
        System.out.println(title);
    }

}
