package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import driver.Driver;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminPage {

    public WebElement adminTab() {
        return Driver.driver.findElement(By.xpath("//li[1]//a[1]//span[1]"));
    }

    public int numberOfRecords() {
        String text = Driver.driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText();
        Pattern pattern = Pattern.compile("\\((\\d+)\\)");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            int number = Integer.parseInt(matcher.group(1)); // Extract and convert to an integer
            System.out.println(number);
            return number;
        }
        return 10;
    }

    public WebElement addBtn() {
        return Driver.driver.findElement(By.xpath("//button[normalize-space()='Add']"));
    }

}
