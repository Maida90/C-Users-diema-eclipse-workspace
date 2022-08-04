package Edit.FUNA;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class LoginExitoso {
	@Test 
	
	public void lab1_E1(){
		
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver","..\\FUNA\\Drivers\\chromedriver.exe");
		//instanciar Driver de Chrome + importar libreria org.openqa.selenium.chrome.ChromeDriver
		WebDriver Driver= new ChromeDriver();
		
		//Ir a url
		Driver.get("http://localhost:4201/afiliado/login");
		//Cerrar navegador
		//d.quit();
		Driver.manage().window().maximize();
		//login Caja Ande
		WebDriverWait myWait = new WebDriverWait(Driver, 10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cedula")));
		WebElement cedula =Driver.findElement(By.name("cedula"));
		cedula.sendKeys("2162871");
		WebElement password =Driver.findElement(By.name("password"));
		password.sendKeys("2162871");
		
		Driver.findElement(By.xpath("//paper-button[contains(text(),'Ingresar')]")).click();
		//Llenar formulario MiPyme
	
	    //Llenar formulario MiPyme
		WebDriverWait myWai = new WebDriverWait(Driver, 10);
		myWai.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Solicitud de préstamos MIPYMES')]")));
		Driver.findElement(By.xpath("//h2[contains(text(),'Solicitud de préstamos MIPYMES')]")).click();
        
		WebDriverWait myWa = new WebDriverWait(Driver, 10);
		myWa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Nuevo prestamo MiPYMES')]")));
		
		Driver.findElement(By.xpath("//button[contains(text(),'Nuevo prestamo MiPYMES')]")).click();
	}
	public void lab1_E2(){
		//Propiedades para Ejecutar el driver de Chrome
				System.setProperty("webdriver.chrome.driver","..\\FUNA\\Drivers\\chromedriver.exe");
				//instanciar Driver de Chrome + importar libreria org.openqa.selenium.chrome.ChromeDriver
				WebDriver Driver= new ChromeDriver();
				
				//Ir a url
				Driver.get("http://localhost:4200/afiliado/login");
				Driver.findElement(By.xpath("//button[contains(text(),'Nuevo prestamo MiPYMES')]")).click();
    }
}
