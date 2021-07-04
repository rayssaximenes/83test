package io.eightythree.eithythree_testing;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

class KeyBoardAndMouseInput {
    public static void main(String [] args) {

        System.setProperty("webdriver.chrome.driver", "/home/rayssa.ximenes/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://eightythree.azurewebsites.net/");

        WebElement name = driver.findElement(By.name("Name"));
        name.click();
        name.sendKeys ("Rayssa");

        WebElement email = driver.findElement(By.name("Email"));
        email.click();
        email.sendKeys(generateEmail());

        WebElement password = driver.findElement(By.name("Password"));
        password.click();
        password.sendKeys("raiisinha");

        WebElement button = driver.findElement (By.xpath("//button[@type='submit']"));
        button.click();

        Assert.assertEquals("https://eightythree.azurewebsites.net/login", driver.getCurrentUrl());

        driver.quit();
    }

    protected static String generateEmail() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }

        String saltStr = salt.toString();
        return saltStr + "@gmail.com";
    }
}




