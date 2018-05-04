package dolibarr.selenium;

import java.sql.Driver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDolibarr {
	ChromeDriver driver = new ChromeDriver();
	@Before
	public void setup() {
		driver.get("http://demo.testlogiciel.pro/dolibarr");
		driver.findElement(By.id ("username")).sendKeys("jsmith");
		driver.findElement(By.id ("password")).sendKeys("hp");
		driver.findElement(By.className("button")).click();
			}
	@After
		public void teardown() {
		//driver.findElement(By.xpath("//[@alt='Déconnexion']")).click();
		driver.close();
		}
	
	@Test
	public void testconnexion() {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://demo.testlogiciel.pro/dolibarr");
		driver.findElement(By.id ("username")).sendKeys("jsmith");
		driver.findElement(By.id ("password")).sendKeys("hp");
		driver.findElement(By.className("button")).click();
		//Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
		driver.findElement(By.cssSelector("div.mainmenu.companies")).click();
		driver.findElement(By.linkText("Nouveau tiers")).click();
		driver.findElement(By.name("nom")).sendKeys("Mantoum");
		driver.findElement(By.name("firstname")).sendKeys("zoulia");
		//new Select(driver.findElement(By.name("civilité_id"))).selectByVisibleText("Mademoiselle");
		driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
		//Assert.assertEquals( "Mantoum",driver.findElement(By.className("nobordernoppading")).getText());
		
		
		
		
		
		//*driver.close();
		
				
		
	}
	//@Test
	//public void testTiers( ) {
		//ChromeDriver driver= new ChromeDriver();
		//driver.get("http://demo.testlogiciel.pro/dolibarr");
		//driver.findElement(By.id("username")).sendKeys("jsmith");
		//driver.findElement(By.id ("password")).sendKeys("hp");
		//driver.findElement(By.className("button")).click();
		//driver.findElement(By.cssSelector("div.mainmenu_companies")).click();
		//driver.findElement(By.linkText("Nouveau tiers")).click();
		//driver.findElement(By.name("nom")).sendKeys("Mantoum");
		//driver.findElement(By.name("firstname")).sendKeys("zoulia");
		//new Select(driver.findElement(By.name("civilité_id"))).selectByVisibleText("Mademoiselle");
	//driver.findElement(By.cssSelector("img.login")).click();
		
		//
		
		
		
	
		
	}


	
	


