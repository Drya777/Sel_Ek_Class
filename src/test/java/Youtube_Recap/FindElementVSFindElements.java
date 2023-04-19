package Youtube_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementVSFindElements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");

        //Find element()--->Return to Single webElement so we define WebElement searchbox
        //1
       WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
       searchbox.sendKeys("XYZD");
       //2
       WebElement singleEle=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
       //It will return only first one not all the elements
        System.out.println(singleEle.getText());
        //3 //button[normalize-space()='Search']

        WebElement searchBox= driver.findElement(By.xpath("//button[normalize-space()='login']"));//if it doesn't find throws an exception -->NoSuchElementException*/

//findElements ()--->Returns Multiple web elements
        //1
     List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-upper']//a"));//link is variable which contains multiple element and findElements is always returns to List<WebElement>
        System.out.println("Number of elements captured:"+links.size());//22 I wanna know which element we can get text all elements

        for (WebElement ele:links){
            System.out.println(ele.getText());//we can iterate all elements for FindElements but in FindElement we dont nee need beacuse there in only one element no need catch the action
        }
        /*//2
        List<WebElement>logo= driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));//even though one single web element returns to List<WebElement>
        System.out.println("Number of logo = " + logo.size());*/

        //3
       List<WebElement> elements =driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));//there is no element has this xpath no matching element
//it will return zero(0) not NoSuchElementException exception
        System.out.println(elements.size());
    }
}
