package Youtube_Recap;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleMultipleDropDowns {
    static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://hrm-test.renastechschool.com/symfony/web/index.php/pim/viewEmployeeList/reset/1");
        //approach2
        WebElement Nationality=driver.findElement(By.name("personal[cmbNation]"));
        selectOptionFromDropDown(Nationality,"271");
        WebElement MarStatus=driver.findElement(By.name("Married"));
        selectOptionFromDropDown(MarStatus,"Married");
        //WebElement EmpSubUnit=driver.findElement(By.name("empsearch[sub_unit]"));
    }
    public static void selectOptionFromDropDown(WebElement ele,String value){
        Select drp=new Select(ele);
        List<WebElement> allOptions=drp.getOptions();

        for (WebElement option:allOptions){

            if(option.getText().equals(value)){
                option.click();
                break;//if don't put it goes all the options
            }


        }
    }
}
