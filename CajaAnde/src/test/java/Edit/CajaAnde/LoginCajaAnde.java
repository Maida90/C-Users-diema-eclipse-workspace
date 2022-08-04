package Edit.CajaAnde;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginCajaAnde {
	@Test
	public void lab1_E1(){
		//Propiedades para Ejecutar el driver de Chrome
		System.setProperty("webdriver.chrome.driver","..\\CajaAnde\\Drivers\\chromedriver.exe");
		//instanciar Driver de Chrome + importar libreria org.openqa.selenium.chrome.ChromeDriver
		WebDriver d= new ChromeDriver();
		
		//Ir a url
		d.get("https://selenium.dev/");
		//Cerrar navegador
		//d.quit();
	}
	
}
