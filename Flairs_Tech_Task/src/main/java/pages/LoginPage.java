package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driver.Driver;

public class LoginPage {

    public WebElement userName() {
        return Driver.driver.findElement(By.xpath("//input[@placeholder='Username']"));
    }

    public WebElement password() {
        return Driver.driver.findElement(By.xpath("//input[@placeholder='Password']"));
    }

    public WebElement loginBtn() {
        return Driver.driver.findElement(By.xpath("//button[normalize-space()='Login']"));
    }

}
