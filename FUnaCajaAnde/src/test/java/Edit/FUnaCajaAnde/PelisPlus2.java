package Edit.FUnaCajaAnde;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PelisPlus2{
	WebDriver Driver;
	@Test
	public void lab1_E1(){
		
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver","..\\FUNA\\Drivers\\chromedriver.exe");
		//instanciar Driver de Chrome + importar libreria org.openqa.selenium.chrome.ChromeDriver
		Driver= new ChromeDriver();
		
	}
	//Ir a url
	@BeforeTest
	public void irURL() {
		Driver.get("https://www.pelisplus2.io");	
	}
	@BeforeClass
	public void MaxVentana() {
		Driver.manage().window().maximize();
		//Driver.close();

	}
}

