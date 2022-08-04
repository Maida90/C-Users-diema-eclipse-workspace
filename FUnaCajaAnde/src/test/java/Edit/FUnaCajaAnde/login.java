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

public class login{
	WebDriver Driver;
	@BeforeSuite
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
		Driver.get("http://localhost:4201/afiliado/login");	
	}
	@BeforeClass
	public void MaxVentana() {
		Driver.manage().window().maximize();
		Driver.close();

	}
	@Test
	public void Login() {
		 //login Caja Ande
		WebDriverWait myWait = new WebDriverWait(Driver, 10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cedula")));
		WebElement cedula =Driver.findElement(By.name("cedula"));
		cedula.sendKeys("2162871");
		WebElement password =Driver.findElement(By.name("password"));
		password.sendKeys("2162871");
		
		Driver.findElement(By.xpath("//paper-button[contains(text(),'Ingresar')]")).click();
		
		WebDriverWait myWa = new WebDriverWait(Driver, 20);
		myWa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Solicitud de préstamos MIPYMES')]")));
		Driver.findElement(By.xpath("//h2[contains(text(),'Solicitud de préstamos MIPYMES')]")).click();
		
		String resultadoEsperado = "http://localhost:4200/afiliado/mipymes";
		String resultadoObtenido = Driver.getCurrentUrl();
     	Assert.assertEquals(resultadoEsperado,resultadoObtenido);
     	
     	WebDriverWait myWey = new WebDriverWait(Driver, 10);
		myWey.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Nuevo prestamo MiPYMES')]")));
		Driver.findElement(By.xpath("//button[contains(text(),'Nuevo prestamo MiPYMES')]")).click();
		

		WebDriverWait myW = new WebDriverWait(Driver, 15);
		myW.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Datos Personales')]")));
		Driver.findElement(By.xpath("//button[contains(text(),'Datos Personales')]")).click();
		
		WebDriverWait time = new WebDriverWait(Driver, 15);
		time.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='nacimiento-date']")));
        WebElement dateBox = Driver.findElement(By.xpath("//input[@id='nacimiento-date']"));
        dateBox.sendKeys("09251985");
       
        WebDriverWait tim = new WebDriverWait(Driver, 15);
		tim.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='direccion']")));
        WebElement direccion = Driver.findElement(By.xpath("//input[@id='direccion']"));
        direccion.sendKeys("Ingavi 2348");
        
        WebElement Barrio = Driver.findElement(By.xpath("//input[@id='barrio']"));
        Barrio.sendKeys("San Vicente");
        
        WebElement TelefonoParticular = Driver.findElement(By.xpath("//input[@id='telefonoParticular']"));
        TelefonoParticular.sendKeys("0986456869");
       
        WebElement Email = Driver.findElement(By.xpath("//input[@id='email']"));
        Email.clear();
        Email.sendKeys("die90@gmail.com");
        
        WebDriverWait time01 = new WebDriverWait(Driver, 15);
      	time01.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='nombre_empresa']")));
        WebElement NombreEM = Driver.findElement(By.xpath("//input[@id='nombre_empresa']"));
        NombreEM.sendKeys("Óptica 6 Hermanos");
        
        WebElement RucEM = Driver.findElement(By.xpath("//input[@id='ruc_empresa']"));
        RucEM.sendKeys("20-2162871-0");
    }
	@Test 
	public void LLenarDatosLaborales(){
		WebDriverWait myWey = new WebDriverWait(Driver, 10);
		myWey.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Datos Laborales']")));
		Driver.findElement(By.xpath("//button[normalize-space()='Datos Laborales']")).click();
		
	}
	@AfterClass
	public void FinDePrueba() {
		System.out.println("Fin de la prueba");
	}
	@AfterTest
	public void CierreNav() {
		Driver.close();
	}
	@AfterSuite
	public void FinSuite() {
		System.out.println("Fin Suite");
	}
}


