package com.simplilearn.seleniumtest.AutomatingAmazonApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationBoxVerification {

    @SuppressWarnings("null")
	public static void main(String[] args) {
    	
        // Set the path to ChromeDriver 
    	
        System.setProperty("webdriver.chrome.driver", "DRIVERS/WIN/chromedriver.exe");

        // Create a new instance 
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the Amazon homepage
        	
            driver.get("https://www.amazon.in/");

            // Search for a product (you can modify this locator based on your use case)
            
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
            searchBox.sendKeys("iphone 14");
            searchBox.submit();

            // Click on the first product in the search results
            
            WebElement firstProduct = driver.findElement(By.xpath("(//div[@class='s-result-list']/div[@data-asin])[1]"));
            firstProduct.click();

            // Add the product to the wishlist
            WebElement addToWishlistButton = driver.findElement(By.id("add-to-wishlist-button-submit"));
            addToWishlistButton.click();
          
          
            WebElement confirmationBox = null;
			// Verify if the confirmation box is displayed
            if (confirmationBox.isDisplayed()) {
                System.out.println("Product successfully added to the wishlist!");
            } else {
                System.out.println("Failed to add the product to the wishlist.");
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}


