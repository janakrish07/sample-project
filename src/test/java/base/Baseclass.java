package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	//browser launch
	public static WebDriver launchBrowser(String browserName) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("invalid browser");
		}
		
		return driver;
	}
	//url launch
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	//get title
	public static String getTitle(String url) {
		String title = driver.getTitle();
		return title;
	}
	
	//get current url
	public static String getTitle() {
		String title = driver.getTitle();
		return title;	
	}
	//quit
	public static void quite() {
		driver.quit();
	}
	//sendkeys
	public static void sendKeys(WebElement e, String user) {
		e.sendKeys(user);
	}
	//find Element
	public static WebElement findElement(String locatorName,String locatorValue) {
		WebElement value=null;
		if(locatorName.equals("id")) {
			value=driver.findElement(By.id(locatorValue));
		}
		else if(locatorName.equals("name")) {
			value=driver.findElement(By.name(locatorValue)); 	
		}
		else if(locatorName.equals("xpath")) {
			value=driver.findElement(By.xpath(locatorValue));
		}
		return value;
	}
	//click
	public static void buttonClick(WebElement e) {
		e.click();
	}
	//get text
	public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	//getAttribute
	public static String getAttribute(WebElement e) {
	    String attribute = e.getAttribute("value");
		return attribute;
	}
	//wait
		public static void implicitywait(long time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
	//dynamic wait
	public static void implicitlyWait(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);	
	}
	//static wait
	public static void Threadsleep(long millis) throws InterruptedException{
		Thread.sleep(millis);
	}
	//Actions
	//MoveToElement
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();
	}
	//drag and drop
	public static void dragAndDrop(WebElement src,WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	//click and hold
	public static void clickAndHold(WebElement scr,WebElement des) {
		Actions a=new Actions(driver);
		a.clickAndHold(scr).release(des).perform();
    }
	//right click
	public static void rightClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick(e).perform();
	}
	//double click
	public static void doubleClick(WebElement e) {
		
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
	}
	//clear
	public static void clear(WebElement e) {
		e.clear();
	}
	//Select
	//Select by Index
	public static void selectByIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	//Select by value
	public static void selectByValue(WebElement e,String value) {
		Select s=new Select(e);
        s.selectByValue(value);
	}
	//Select by visible Text
	public static void selectByVisibleText(WebElement e,String value) {
		Select s=new Select(e);
        s.selectByVisibleText(value);
	}
	//first selected option
	public static void firstSelectedOption(WebElement e) {
	    Select s=new Select(e);
	    s.getFirstSelectedOption();
	}
	//deselect all
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
        s.deselectAll();
	}
	//deselect by index
	public static void deselectByIndex(WebElement e, int index) {
		Select s=new Select(e);
	    s.deselectByIndex(index);
	}
	//deselect by visible text
	public static void deselectByVisibleText(WebElement e,String value) {
		Select s=new Select(e);
        s.deselectByVisibleText(value);
	}
	//deslect by value
	public static void deselectByValue(WebElement e,String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	//Excel value
	public static String getExcelData(String name,String sheetName,int rowNo,int cellNo) throws IOException {
	
	File loc=new File("C:\\Users\\Admin\\eclipse-workspace\\MavenProject\\src\\test\\resources\\Book2.xlsx");
	FileInputStream fi=new FileInputStream(loc);
	Workbook w=new XSSFWorkbook(fi);
	Sheet  s= w.getSheet(sheetName);
    Row r= s.getRow(rowNo);
    
    Cell  cell= r.getCell(cellNo);
    System.out.println(cell);
    int type = cell.getCellType();
    String value=null;

    if(type==1) {
    	  value= cell.getStringCellValue();
    }
    else {
    	if(DateUtil.isCellDateFormatted(cell)) {
    		Date  d= cell.getDateCellValue();
    		SimpleDateFormat si=new SimpleDateFormat();
    		  value= si.format(d);
    	}
    	else {
    		double numeric = cell.getNumericCellValue();
    		long ln=(long)numeric;
    		  value= String.valueOf(ln);
    			return value;

    }

	}
	return value;
	}}
	
	
	
	
	
