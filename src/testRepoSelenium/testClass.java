package testRepoSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class testClass {

	//	public static void main(String[] args) throws FileNotFoundException {
	
	
	
	@Test
	public void test() {
		System.out.println ("Test Started");
		// TODO Auto-generated method stub

		String baseURL = "https://www.google.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		System.out.println (driver.getTitle());		
		System.out.println ("Test Completed");
	}


	//	}

}
