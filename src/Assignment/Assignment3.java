package Assignment;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {



public static void main(String[] args) throws InterruptedException {

//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

WebDriver driver=new ChromeDriver();

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



String[] itemsNeeded= {"iphone","Samsung","Nokia","Blackberry"};

driver.get("https://rahulshettyacademy.com/loginpagePractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);

/* driver.findElement(By.cssSelector("img[alt='Cart']")).click();

driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click(); */

driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
Thread.sleep(3000);
//System.out.println(driver.switchTo().alert().getText());
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']")));
//driver.switchTo().alert().accept();
driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
driver.findElement(By.xpath("//select[@class='form-control']")).click();
driver.findElement(By.xpath("//option[@value='consult']")).click();
driver.findElement(By.xpath("//input[@id='terms']")).click();
driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

}

public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> mobile=driver.findElements(By.cssSelector("h4.card-title"));

for(int i=0;i<mobile.size();i++)

{


String name=mobile.get(i).getText().trim();

//String formattedName=name[0].trim();

List<String> itemsNeededList = Arrays.asList(itemsNeeded);

if(itemsNeededList.contains(name))

{

j++;

//click on Add to cart

driver.findElements(By.xpath("(//button[contains(text(),'Add')])[1]")).get(i).click();

if(j==itemsNeeded.length)

{

break;

}

}

}

}



}


