package io.eightythree.eithythree_testing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/home/rayssa.ximenes/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://eightythree.azurewebsites.net/login");


        WebElement email = driver.findElement(By.name("Email"));
        email.click();
        email.sendKeys("rayssa.lx@hotmail.com");

        WebElement password = driver.findElement(By.name("Password"));
        password.click();
        password.sendKeys("raiisinha");

        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        button.click();

        Assert.assertEquals("https://eightythree.azurewebsites.net/", driver.getCurrentUrl());

        WebElement msg = driver.findElement(By.xpath("//div[@class='ui right dropdown item']"));
        Assert.assertTrue(msg.getText().contains("Rayssa Loiola Ximenes"));
        //Assert.assertEquals(msg.getText(), "Rayssa Loiola Ximenes");

    }
}
