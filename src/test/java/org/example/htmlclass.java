package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class htmlclass {
    public static void main(String[] args) throws Exception {
        //@Test
        //@public void test()
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.get("https://codeforces.com/enter?back=%2Fprofile%2Flogin");
        Thread.sleep(3000);
        driver.findElement(By.id("handleOrEmail"));
        WebElement usernameText = driver.findElement(By.id("handleOrEmail"));
        //if we check text is enabled or not
        if(usernameText.isDisplayed()){
            //if we check weather text box is enabled or not
            if(usernameText.isEnabled()){
                usernameText.sendKeys("2000031530cse@gmail.com");
                System.out.println(usernameText.getAttribute("value"));
                Thread.sleep(3000);
                usernameText.click();
            }
            else
                System.out.println("user name text box not enabled");
        }
        else System.out.println("user name text box not displayed");
    }
}