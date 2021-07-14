package io.eightythree.eithythree_testing;

import com.epam.jdi.tools.switcher.Actions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
    private static Object Webelement;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/home/rayssa.ximenes/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://eightythree.azurewebsites.net/login");

        WebElement email = driver.findElement(By.name("Email"));
        email.click();
        email.sendKeys("rayssa.lx@hotmail.com");

        WebElement password = driver.findElement(By.name("Password"));
        password.click();
        password.sendKeys("12345678");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        driver.findElement(By.xpath("//div[@class='ui right dropdown item']"));

        WebElement btn = driver.findElement(By.xpath("//i[@class='dropdown icon']"));
        btn.click();

        Thread.sleep(2000);

        WebElement logout = driver.findElement(By.xpath("//*[text()='Logout']"));
        logout.click();

        Assert.assertEquals("https://eightythree.azurewebsites.net/", driver.getCurrentUrl());

    }

    }
