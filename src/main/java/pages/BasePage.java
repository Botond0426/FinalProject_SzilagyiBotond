package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Random;

public class BasePage {
    public static WebDriver driver;
    public static WebDriverWait wait; // Added WebDriverWait

    private String BASE_URL = "https://ecommerce-playground.lambdatest.io/index.php?route=common/home";

    public BasePage() {
        // Default constructor
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait
    }

    @BeforeMethod
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public String generateEmailAddress() {
        String str = "panitCity%s@testmail.ro";
        Random random = new Random();
        int x = random.nextInt(999);

        String finalString = String.format(str, x);
        return finalString;
    }
}