package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton = driver.findElement(By.xpath("//input[@value='0 - 5']"));
        boolean isRadioButtonEnabled = ageRadioButton.isEnabled();
        boolean isRadioButtonDisplayed=ageRadioButton.isDisplayed();
        System.out.println(isRadioButtonEnabled);
        System.out.println(isRadioButtonDisplayed);

        System.out.println("Before clicking " + ageRadioButton.isSelected());
        ageRadioButton.click();
        System.out.println("After clicking " + ageRadioButton.isSelected());
    }
}
