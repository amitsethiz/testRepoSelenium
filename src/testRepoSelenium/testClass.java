package testRepoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;



public class testClass {

	//	public static void main(String[] args) throws FileNotFoundException {
	
	
	
	@Test
	public void test() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
	    firefoxBinary.addCommandLineOptions("--headless");
	    
	    FirefoxOptions firefoxOptions = new FirefoxOptions();
	    firefoxOptions.setBinary(firefoxBinary);
	    FirefoxDriver driver = new FirefoxDriver(firefoxOptions);
		
		System.out.println ("Test Started");
		

		String baseURL = "https://www.google.com";
//		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		System.out.println (driver.getTitle());		
		System.out.println ("Test Completed");
		driver.quit();
	}


	//	}

}
