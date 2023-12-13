package com.simplilearn.seleniumtest.AutomatingAmazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLoginVerification {
    public static void main(String[] args) {
    	
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Amazon homepage
        driver.get("https://www.amazon.in/");

        // Verify if the user has signed in
        // Using boolean to return true, or false in case of not signed in
        
        boolean isUserSignedIn = isUserSignedIn(driver);
        
        System.out.println("USER IS SIGNED IN SUCCESSFULLY: " + isUserSignedIn);

        // Verify the page's ability to scroll
        
        scrollPage(driver, 800);   // Scroll down the amazon page by 800 pixels

        // Close the browser
         driver.quit();
    }

    // Method to verify if the user has signed in
    
    private static boolean isUserSignedIn(WebDriver driver) {
        WebElement signInLink = driver.findElement(By.id("nav-link-accountList"));
        return signInLink.isDisplayed();
    }

    // Method to scroll the page
    
    private static void scrollPage(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixels + ")");
    }
}
