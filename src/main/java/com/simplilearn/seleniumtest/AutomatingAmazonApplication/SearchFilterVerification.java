package com.simplilearn.seleniumtest.AutomatingAmazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFilterVerification {
    public static void main(String[] args) throws InterruptedException {
    	
        // Set the path to ChromeDriver
    	
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Amazon homepage
        driver.get("https://www.amazon.in/");

        // Locate the search box and enter the product
        
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        
        //product is iphone 14
        
        searchBox.sendKeys("iphone 14");

        // Locate and click on the search button
        
        WebElement searchButton = driver.findElement(By.className("nav-input"));
        searchButton.click();

        // Add some delay
        
        Thread.sleep(3000);

        // Check if filters are being used
        
        boolean areFiltersUsed = verifyFilters(driver);
        if (areFiltersUsed) {
            System.out.println("FILTERS ARE APPLIED SUCCESSFULLY");
        } else {
            System.out.println("FILTERS ARE NOT APPLIED SUCCESSFULLY");
        }

        // Close the browser
        driver.quit();
    }

    private static boolean verifyFilters(WebDriver driver) {
        
        WebElement filterOption = driver.findElement(By.xpath("//span[contains(text(),'Brand')]"));
        return filterOption.isDisplayed();
    }
}
