package com.simplilearn.seleniumtest.AutomatingAmazonApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAmazon {
    public static void main(String[] args) {
    	
        // Set the path to ChromeDriver
    	
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");

        // Initialize WebDriver
        
        WebDriver driver = new ChromeDriver();

        // Opening Amazon homepage
        
        driver.get("https://www.amazon.in/");
        
        //Add Delay 
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Close the browser
        
        driver.quit();
    }
}

