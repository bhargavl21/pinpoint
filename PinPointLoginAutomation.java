

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PinPointLoginAutomation {

    public static void main(String[] args) {

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Navigate to the login page
            driver.get("https://pinpoint.idearise.co/auth/login");
            

            // Locate the user ID field and input the user ID
            WebElement userIdField = driver.findElement(By.xpath("//input[@placeholder='Email']")); // Replace with the actual ID or selector
            userIdField.sendKeys("bhargav111887@gmail.com");

            // Locate the password field and input the password
            WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']")); // Replace with the actual ID or selector
            passwordField.sendKeys("bhargav123");

            // Locate the login button and click it
            WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Sign In']")); // Replace with the actual button locator
            loginButton.click();

            // Optional: Add a wait or validation step to verify login success
            Thread.sleep(3000); // Replace with WebDriverWait for better practice

            // Validate login (Example: Check if redirected to the dashboard or specific element exists)
            if (driver.getTitle().contains("Dashboard")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
