package io.eightythree.eithythree_testing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Viewarticle {
    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/rayssa.ximenes/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://eightythree.azurewebsites.net/");

        WebElement signin = driver.findElement(By.xpath("//a[@href='/login']"));
        signin.click();

        WebElement email = driver.findElement(By.name("Email"));
        email.click();
        email.sendKeys ("rayssa.lx@hotmail.com");


        WebElement password = driver.findElement(By.name("Password"));
        password.click();
        password.sendKeys("12345678");

        WebElement button = driver.findElement (By.xpath("//button[@type='submit']"));
        button.click();

        WebElement article1 = driver.findElement(By.xpath("//a[@href='/article/the-art-of-abstracting-software-and-writing-proper-interfaces']"));
        article1.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("Comment:window.scrollBy(500, 500)");

       //WebElement login = driver.findElement (By.xpath("//a[@href='/login']"));
       //Thread.sleep(3000);
      // login.click();


       WebElement comment = driver.findElement(By.name("Comment"));
       Thread.sleep(2000);
       comment.click();
       comment.sendKeys("Great!");

       WebElement buttoncomment= driver.findElement(By.xpath("//button[@type='submit']"));
        buttoncomment.click();

        WebElement msg = driver.findElement(By.xpath("//div[@class='ui success message']"));
        Thread.sleep(2000);
        Assert.assertTrue(msg.getText().contains("Great!"));

        driver.quit();
    }
}

