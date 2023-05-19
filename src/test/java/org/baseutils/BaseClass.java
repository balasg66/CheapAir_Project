package org.baseutils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static String browser,url;
	
	public static void browserLaunch()
	{
		switch (browser) {
		case "chrome": WebDriverManager.chromedriver().setup();
						driver=new ChromeDriver();
						driver.manage().window().maximize();
						break;
		case "firefor":WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
						driver.manage().window().maximize();
						break;
		case "ie":WebDriverManager.iedriver().setup();
				  driver=new InternetExplorerDriver();
				  driver.manage().window().maximize();
				  break;
		case "edge":WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
					driver.manage().window().maximize();
					break;
		default:	System.out.println("Browser not selected");
			
		}
	}
	public static void loadProperties()
	{
		FileReader reader=null;
		try {
			 reader=new FileReader("config.properties");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(reader);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		 browser = property.getProperty("BrowserType");
		 url = property.getProperty("AppURL");
	}
	public static void click(WebElement element)
	{
		element.click();
	}
	public static void clear(WebElement element)
	{
		element.clear();
	}
	public static void dropDown(WebElement element, String type, String value)
	{
		Select sc=new Select(element);
		switch (type) {
		case "index": sc.selectByIndex(Integer.parseInt(value));
					  break;
		case "value": sc.selectByValue(value);
					  break;
		case "text": sc.selectByVisibleText(value);
					 break;
		default : System.out.println("Nothing selected");
			
			break;

		}
		
	}
	public static void impWait()
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public static List<String> getWindowHandles(int index)
	{
		Set<String> windows = driver.getWindowHandles();
		List<String> allwindows =new ArrayList<>();
		allwindows.addAll(windows);
		driver.switchTo().window(allwindows.get(index));
		return allwindows;
		
	}
	public static void alerts(String condition) {
		switch (condition) {
		case "accept":
			driver.switchTo().alert().accept();
			break;
		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;

		default:
			System.out.println("Invalid condition");
			break;
		}
	}
		
	public static void javaScriptExecutorClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
}
