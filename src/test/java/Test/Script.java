package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

public class Script {
    public static ChromeDriver driver;
    public static String email_id;

    public static String getEightDigit() {

        // It will generate 8 digit random Number.
        Random rnd = new Random();
        int number = rnd.nextInt(99999999);
        return String.format("%08d", number);
    }

    public static String getFourDigit() {

        // It will generate 4 digit random Number.
        Random rnd = new Random();
        int number = rnd.nextInt(9999);
        return String.format("%04d", number);
    }

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32(1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://159.89.38.11/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email-1\"]")).sendKeys("test@orangetoolz.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password-1\"]")).sendKeys("8Kh8nTe*^jdk");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"m_login_signin_submit\"]")).click();
        Thread.sleep(5000);
        //Clicking on Contact icon
        driver.findElement(By.xpath("//*[@id=\"main-sidebar\"]/div[1]/ul/li[1]/a")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"main-sidebar\"]/div[1]/ul/li[4]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/main/div/div/div[2]/div[2]/div/div[1]/div[2]/a")).click();
        Thread.sleep(5000);
        //Selecting tag
        driver.findElement(By.xpath("//*[@id=\"new-group-append-in-add-contact\"]/div[1]/label")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"new-group-append-in-add-contact\"]/div[16]/label")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[2]/div[1]/div/input")).sendKeys("017"+getEightDigit());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[2]/div[2]/div/input")).sendKeys(email_id = "random_email"+getFourDigit()+"@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[3]/div[1]/input")).sendKeys("Demo FirstName");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[3]/div[2]/input")).sendKeys("Demo LastName");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"date-time-picker-1\"]/input")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"date-time-picker-1\"]/input")).sendKeys("2022-05-30");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[6]/div[1]/input")).sendKeys("Dhaka");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[6]/div[2]/input")).sendKeys("Dhaka");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[6]/div[3]/input")).sendKeys(getFourDigit());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[7]/div[1]/input")).sendKeys("Bangladesh");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[7]/div[2]/textarea")).sendKeys("House: 00, Road: 00, Banani, Dhaka");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-form\"]/button")).click();
        Thread.sleep(4000);

        //Validation
        driver.findElement(By.xpath("//*[@id=\"contact-table_filter\"]/label/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"contact-table_filter\"]/label/input")).sendKeys(email_id);
        Thread.sleep(10000);

    }
}