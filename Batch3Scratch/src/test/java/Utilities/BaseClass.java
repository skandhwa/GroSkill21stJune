package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Constants.Constants1;



public class BaseClass {
	
	
	static ReadDataFromProperty obj2=new ReadDataFromProperty();
	
	public static WebDriver driver;
	public static String browsername;
	
	
	public static WebDriver initializeDriver()  
	{
		
		
		try {
			browsername = ReadDataFromProperty.readDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	if(browsername.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		try {
			driver.get(GetDataFromExcel.getUrl());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}
	
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
		try {
			driver.get(GetDataFromExcel.getUrl());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}
	
	else if(browsername.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
		try {
			driver.get(GetDataFromExcel.getUrl());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
	}
	else
	{
		System.out.println("Incorrect Browser selected");
	}
	
	
	
	
		
		
		return driver;
	}
	
	public static void getTitleOfPage()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public static void AddHardcodedWait() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	
	public static void takeScreenShotMethod() throws IOException
	{
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File SrcFile=srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(Constants1.SCREENSHOTPATH);
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void ScrollDown()
	{
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("windows.scrollBy(0,500)","");
	}
	
	
	
	
	

}
