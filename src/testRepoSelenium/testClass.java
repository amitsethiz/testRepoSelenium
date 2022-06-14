package testRepoSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class testClass {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println ("Test Started");
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "/home/amitsethi/eclipse-workspace/testProject/geckodriver");
		String baseURL = "https://www.google.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
		System.out.println (driver.getTitle());		
		System.out.println ("Test Completed");

	}

}
