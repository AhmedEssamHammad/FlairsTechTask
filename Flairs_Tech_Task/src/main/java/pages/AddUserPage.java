package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import driver.Driver;

public class AddUserPage {


    public void chooseUserRole() {
        WebElement userRole = Driver.driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]"));
        userRole.click();
        Actions actions = new Actions(Driver.driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    public void chooseStatus() {
        WebElement status = Driver.driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-card-container']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[1]/div[1]/div[2]/div[1]/div[1]"));
        status.click();
        Actions actions = new Actions(Driver.driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    public WebElement employeeName() {
        return Driver.driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
    }

    public WebElement newUserName() {
        return Driver.driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']"));
    }

    public WebElement newPassword() {
        return Driver.driver.findElement(By.xpath("(//input[@type='password'])[1]"));
    }

    public WebElement newConfirmPassword() {
        return Driver.driver.findElement(By.xpath("(//input[@type='password'])[2]"));
    }

    public WebElement saveBtn() {
        return Driver.driver.findElement(By.xpath("//button[normalize-space()='Save']"));
    }
}
