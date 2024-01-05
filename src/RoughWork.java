

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RoughWork{
     @Test
     
    //public static void main(String[] args) 
    public void Sample()
    {

         //System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\chromedriver-win64");

        System.out.println("Hello World!");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
        driver.close();
       
        
    }
     @Test
     
     //public static void main(String[] args) 
     public void Sample2()
     {

          //System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\chromedriver-win64");

         System.out.println("Hello World!");
         //WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();

         driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
         driver.close();
        
         
     }
  
    
}