

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class LinkCount {
    
    public static void main(String[] args) {
        
        WebDriver driver =new ChromeDriver();
        // To open browser in a headless mode
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
  // To maximize the window
 //       driver.manage().window().setSize(new Dimension(1440,900));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("anusuyaparajulii@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("$@nu_Feb6");
        driver.findElement(By.name("login")).click();
        System.out.println(driver.findElements(By.tagName("a")).size());
    }
}
