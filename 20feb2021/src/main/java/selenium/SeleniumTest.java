package selenium;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import comun.LeerProperties;

public class SeleniumTest {
	public static Logger log = Logger.getLogger(SeleniumTest.class);
	static LeerProperties prop = new LeerProperties();

	public static void main(String[] args) {
//guardar el .exe en la carpeta de chromedriver
		String rutaChrome = System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", rutaChrome);

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");
		option.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(option);

//driver.manage().window().maximize();

// un implicit wait sirve para demorar la ejecución
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

		prop.getSystemProperties();
		log.info("Se abrira una URL");

		driver.get(System.getProperty("URL"));
		
		WebElement txt_usernameById = driver.findElement(By.id("txtUsername"));
		WebElement txt_usernameByName = driver.findElement(By.name("txtUsername"));
		//WebElement txt_usernameByXpath = driver.findElement(By.xpath("txtUsername"));
		
		txt_usernameById.sendKeys("Admin");
		//txt_usernameByName.clear();
			
		WebElement txt_passwordById = driver.findElement(By.id("txtPassword"));
		WebElement txt_passwordByName = driver.findElement(By.name("txtPassword"));
	//	WebElement txt_passwordByXpath = driver.findElement(By.xpath("div[@id='divPassword']/input"));
		
		txt_passwordById.sendKeys("admin123");
		
		WebElement btn_Login = driver.findElement(By.id("btnLogin"));
		btn_Login.click();
	
		log.info("todo fue exitoso");
	}
//descargar edge y firefox
}