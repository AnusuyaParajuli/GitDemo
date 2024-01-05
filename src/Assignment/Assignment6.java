package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static void main(String[] args) {
        
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("(//input[@id='checkBoxOption2'])[1]")).click();
        //Assert.assertTrue(driver.findElement(By.xpath("(//input[@id='checkBoxOption2'])[1]"))).isSelected();
        String label = driver.findElement(By.xpath("//label[normalize-space()='Option2']")).getText();
        System.out.println(label);
        driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).sendKeys(label);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(label);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert alert = driver.switchTo().alert();
        alert.getText();
        /* while (alert.includes(label)) {
            
        }{

            System.out.println("Alert contains option2");
        } */
        //driver.switchTo().alert();


        

        
      


    }

}
