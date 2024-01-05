package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import at.maven.Assert;

public class Assignment2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Anusuya Parajuli");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anusuyaparajuli76@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("work@123");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        driver.findElement(By.xpath("(//div[@class='form-group'])[4] //select[@id='exampleFormControlSelect1']")).click();
        driver.findElement(By.xpath("//option[normalize-space()='Female']")).click();
        driver.findElement(By.xpath("(//input[@id='inlineRadio1'])[1]")).click();
        //System.out.println(driver.findElement(By.xpath("//input[@id='inlineRadio1'])[1]")).isSelected());
        System.out.println(driver.findElement(By.xpath("(//input[@id='inlineRadio1'])[1]")).isSelected());
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("02/06/1998");
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText(),"Success! The Form has been submitted successfully!.");
        driver.close();




    }
    
}
