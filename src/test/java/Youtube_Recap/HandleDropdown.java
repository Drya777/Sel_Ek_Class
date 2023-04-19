package Youtube_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdown {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=account/register");
       WebElement drpCountryEle= driver.findElement(By.id("input-country"));//this is dropdown element
        //We need to create an instance from Select class
        Select drpCountry = new Select(drpCountryEle);//Selecet class accept element
        /*
        We can use Select class and to handle dropdown we need to use one of 3 methods
        -SelectByVisibletext()
        -SelectByValue()
        SelectByIndex
         */
//        drpCountry.selectByVisibleText("Denmark");
//        drpCountry.selectByValue("10");//Html de value number var onu yaziyoruz
//        drpCountry.selectByIndex(13);//tirnak icinde yazmiyoruz optionla baslayandan itibaren sayiyoruz

//selecting option from dropdown without using methods
        List<WebElement>alloptions=drpCountry.getOptions();

        for (WebElement option:alloptions){
            if(option.getText().equals("Cuba")){
                option.click();
                break;//if don't put it goes all the options
            }


        }

    }
}
