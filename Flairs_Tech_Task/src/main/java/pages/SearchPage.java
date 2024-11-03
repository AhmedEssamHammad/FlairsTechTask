package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebElement usersSearchSection() {
        return Driver.driver.findElement(By.xpath("//div[@class='--toggle']//button[@type='button']"));
    }

    public WebElement searchUserName() {
        return Driver.driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
    }

    public WebElement searchBtn() {
        return Driver.driver.findElement(By.xpath("//button[normalize-space()='Search']"));
    }

    public WebElement deleteBtn() {
        return Driver.driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']"));
    }

    public WebElement confirmDeleteBtn() {
        return Driver.driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']"));
    }

    public WebElement resetBtn() {
        return Driver.driver.findElement(By.xpath("//button[normalize-space()='Reset']"));
    }
}
