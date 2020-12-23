package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/alexdudin/Documents/chromedriver copy");
        WebDriver obj = new ChromeDriver();
        obj.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
//        WebElement create = obj.findElement(By.xpath("//*[@id=\"ow277\"]/span/span"));
        Actions action = new Actions(obj);
//        action.click(create);
//        action.perform();
        WebDriverWait wait = new WebDriverWait(obj,20);
        wait.until(ExpectedConditions.urlToBe("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp"));
        MakeName name = new MakeName();
        WebElement namePlace = obj.findElement(By.xpath("//*[@id=\"firstName\"]"));
        action.click(namePlace);
        action.perform();
        action.sendKeys(name.getFirst());
        action.perform();
    }
}
