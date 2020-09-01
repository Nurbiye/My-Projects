package com.cybertek.tests.MyProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Create an automated test for Login to Vytrack in Xray– each team member
Automate your scenarios and review with team – each team member
 */
public class VyTrackLogIn {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://vytrack.com");
        driver.findElement(By.linkText("LOGIN")).click();

        String expectedTitle ="Login";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Login page verification PASSED!");
        }else{
            System.out.println("Login page verification FAILED!!");
        }

        //from here I should learn how to get ID
//        WebElement username = driver.findElement(By.id("prependedInput")); // locating login input with the id
//        WebElement password = driver.findElement(By.id("prependedInput2")); // locating the password input with the id
//        WebElement login = driver.findElement(By.xpath("//button[text()='Log in']")); // locating log in button
        // username, password and log in button been assigned
        WebElement userName = driver.findElement(By.name("_username"));
        WebElement passWord = driver.findElement(By.name("_password"));
        WebElement logIn = driver.findElement(By.name("_submit"));

        userName.sendKeys("user162"); // inserting correct login
        passWord.sendKeys("UserUser123"); //inserting correct password

        logIn.click(); //clicking on the log in button
        Thread.sleep(3000); //wait 3 seconds

        //url that after logging in
        String expectedURL = "https://app.vytrack.com/";
        String actualURL = driver.getCurrentUrl();

        if(actualURL.equals(expectedURL)){
            System.out.println("Login functionality Validation PASSED!!");
        }else{
            System.out.println("Login functionality Validation  FAILED!!");
        }

        Thread.sleep(5000);

        driver.close(); //closing browser window







    }





}
