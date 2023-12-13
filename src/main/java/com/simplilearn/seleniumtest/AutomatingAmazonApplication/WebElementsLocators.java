package com.simplilearn.seleniumtest.AutomatingAmazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsLocators {
    public static void main(String[] args) {
    	
        // Set the path to ChromeDriver 
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Opening Amazon homepage
        driver.get("https://www.amazon.in/");

        // Locate web elements using different locators
        
        WebElement searchById = driver.findElement(By.id("twotabsearchtextbox"));
        
        //Add Delay 
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        // Searching by sendkeys the particular product
        
        searchById.sendKeys("iphone 13");

        // Close the browser
        driver.quit();
    }
}

