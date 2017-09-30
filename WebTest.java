package selenium.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebTest
{
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception 
	{
		//driver = new HtmlUnitDriver();
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void  tearDown() throws Exception
	{
		driver.close();
		driver.quit();
	}

	
	@Test
	public void googleExists() throws Exception
	{
		driver.get("http://www.google.com");
        assertEquals("Google", driver.getTitle());		
	}
	

	@Test
	public void Closed() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		List<WebElement> spans = driver.findElements(By.xpath("//a[@class='status']/span[.='CLOSED']"));

		assertNotNull(spans);
		assertEquals(5, spans.size());
	}
	
	@Test
	public void Count() throws Exception{
		driver.get("http://www.checkbox.io/studies.html");
		String titlexpath = "//div[@class='span8']//span[.='Frustration of Software Developers']";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		WebElement title = driver.findElement(By.xpath(titlexpath));
		WebElement next = title.findElement(By.xpath("../../following-sibling::div//span[@class='backers']"));
		assertNotNull(next);
		assertEquals(next.getText(),"55");
	}
	
	@Test 
	public void Participate() throws Exception{
		driver.get("http://www.checkbox.io/studies.html");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='OPEN']")));
		List<WebElement> open = driver.findElements(By.xpath("//a[@class='status']/span[.='OPEN']/../../div[@data-bind='if: canParticipate']/button[.='Participate']"));
		assertNotNull(open);
		for(int i=0;i<open.size();i++)
		{
			assertEquals(open.get(i).getText(),"Participate");
			open.get(i).click();
		}
	}
	
	@Test
	public void hasAmazon() throws Exception{
		driver.get("http://www.checkbox.io/studies.html");
	//	String titlexpath = "//div[@class='span8']//span[.='Software Changes Survey']";
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='award']//img")));
		WebElement amazon = driver.findElement(By.xpath("//div[@class='span8']//span[.='Software Changes Survey']/../../div[@class='award']//img"));
		assertNotNull(amazon);
		assertEquals(amazon.getAttribute("src"),"http://www.checkbox.io/media/amazongc-micro.jpg");
		System.out.println(amazon.getAttribute("src"));
	}
	
}
