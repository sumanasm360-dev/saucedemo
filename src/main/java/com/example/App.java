package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {

        // Create ChromeDriver object
        WebDriver driver = new ChromeDriver();

        // Open Saucedemo website
        driver.get("https://www.saucedemo.com/");

        // Maximize browser window
        driver.manage().window().maximize();

        // Enter Username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click Login button
        driver.findElement(By.id("login-button")).click();

        // Wait for 5 seconds so we can see login success
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
