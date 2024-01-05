package Assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1 {
    
    public static void main(String[] args) throws InterruptedException {
        
        //System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\chromedriver-win64");

        WebDriver driver =new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Thread.sleep(1000);

        //check the box
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        //check if the box is successfully checked
        while (driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()) {
            
            System.out.println("Box is successfully checked");
            break;
        }
        Thread.sleep(2000);
        //uncheck the box
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        //check if the box is successfully unchecked
        System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());

        //get the size of checkboxes in present in the page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

        driver.close();

    }
}
