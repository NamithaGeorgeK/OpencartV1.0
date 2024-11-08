package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;



public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	public Properties p;
	public SoftAssert sfAssert;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup( String os,String br) throws IOException {
		
		FileReader file= new FileReader(".//src//test//resources//config.properties"); 
		p=new Properties();
		p.load(file);
		
		
		logger= LogManager.getLogger(this.getClass());
		
		
		switch(br.toLowerCase()) {
		case "chrome": driver = new ChromeDriver(); break;
		case "edge": driver=new EdgeDriver(); break;
		case "firefox": driver =new FirefoxDriver(); break;
		default: System.out.println("Invalid Driver"); return;			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();		
		
	}
	
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	
	public String randomString() {
		
		RandomStringGenerator generatorString = new RandomStringGenerator.Builder().withinRange('A', 'z').filteredBy(CharacterPredicates.LETTERS).get();

		return generatorString.generate(6);
	}
	
	public String randomNumber() {
		
		RandomStringGenerator generatorNumber = new RandomStringGenerator.Builder().withinRange('0', '9').get();

		return generatorNumber.generate(10);
	}
	
	public String randomAlphanumeric()
	{
		RandomStringGenerator string_generator = new RandomStringGenerator.Builder().withinRange('A', 'z').get();
		String randomgenerated_String=string_generator.generate(6);
		
		RandomStringGenerator number_generator = new RandomStringGenerator.Builder().withinRange('0', '9').get();
		String randomgenerated_Number=number_generator.generate(5);
		
		String randomgenerated_Alphanumeric=randomgenerated_String+"@"+randomgenerated_Number;
		return randomgenerated_Alphanumeric;                
		
	}
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
	
}
