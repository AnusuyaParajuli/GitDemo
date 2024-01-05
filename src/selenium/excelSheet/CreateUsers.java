//package selenium.excelSheet;
//
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
//
//public class CreateUsers {
//	static String CSV_PATH = "C:\\Users\\anusuya.parajuli\\OneDrive - Digital Network Solution Pvt. Ltd\\Karyaflow\\Internal Process\\Employee.csv";
//	static WebDriver driver;
//	private static CSVReader csvReader;
//	static String[] csvCell;
//	
//	public static void setup() throws Exception {
//		
//		WebDriverManager.chromedriver();
//		CreateUsers.setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://kflow-auth.azurewebsites.net/identityadmin/Identity/Users");
//	}
//
//	public static void main(String[] args) throws IOException, CsvValidationException, InterruptedException {
//		csvReader = new CSVReader(new FileReader(CSV_PATH));
//		// TODO Auto-generated method stub
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver = new ChromeDriver(options);
//		//WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://kflow-auth.azurewebsites.net/identityadmin/Identity/Users");
//		driver.findElement(By.id("Username")).sendKeys("anusuya.parajuli");
//		driver.findElement(By.id("Password")).sendKeys("P@ssw0rd");
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
//		driver.findElement(By.cssSelector(".btn.btn-primary.mb-3.mt-3")).click();
//		while ((csvCell = csvReader.readNext()) != null) {
//			String branchId = csvCell[0];
//			String Username = csvCell[6];
//			String Email = csvCell[8];
//			String name = csvCell[9];
//		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(Username);
//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(Email);
//		driver.findElement(By.xpath("//div[3]//div[1]//label[1]//div[1]")).click();
//		Thread.sleep(3000);
//		Actions at = new Actions(driver);
//	    at.sendKeys(Keys.PAGE_DOWN).build().perform();
//	    Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		Thread.sleep(3000);
//		at.sendKeys(Keys.PAGE_UP).build().perform();
//		driver.findElement(By.xpath("//a[normalize-space()='Manage User Claims']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter 2 and more characters']")).sendKeys("branchId");
//		driver.findElement(By.xpath("//input[@value='branchId']")).click();
//		driver.findElement(By.xpath("//input[@id='ClaimValue']")).sendKeys(branchId);
//		driver.findElement(By.xpath("//button[@id='user-claims-button']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter 2 and more characters']")).sendKeys("name");
//		driver.findElement(By.xpath("//input[@value='name']")).click();
//		driver.findElement(By.xpath("//input[@id='ClaimValue']")).sendKeys(name);
//		driver.findElement(By.xpath("//button[@id='user-claims-button']")).click();
//		driver.findElement(By.xpath("//li[@class='breadcrumb-item']//a[normalize-space()='Users']")).click();
//		driver.findElement(By.cssSelector(".btn.btn-primary.mb-3.mt-3")).click();
//		
//		}
//
//	}
//	
//}	
