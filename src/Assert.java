
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {
    
    public static void main(String[] args) {
        
        //System.setProperty("webdriver.chrome.driver", "A:\\Selenium\\chromedriver-win64");

        WebDriver driver =new ChromeDriver();

        driver.get("http://spicejet.com"); //URL in the browser

        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        //Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    }

    static void assertTrue(boolean selected) {
    }

    static void assertFalse(boolean selected) {
    }

    public static void assertEquals(String text, String string) {
    }
}
