package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
    
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        driver.findElement(By.id("autocomplete")).sendKeys("uni");

        Thread.sleep(3000);

        driver.findElement(By.id("autocomplete")).sendKeys("ind");

        Thread.sleep(2000);

         driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

        /* List<WebElement> options =driver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']"));

        for(WebElement option :options)

        {

        if(option.getText().equalsIgnoreCase("United States (USA)"))

        {

        option.click();

        break;


} */

        }
    }


