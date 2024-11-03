package stepDefs;

import driver.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.AddUserPage;
import pages.AdminPage;
import pages.LoginPage;

public class AddUserStepDef {

    LoginPage login = new LoginPage();
    AdminPage admin = new AdminPage();
    AddUserPage addUSer = new AddUserPage();
    int currentNumberOfRecords;
    SoftAssert softAssert = new SoftAssert();

    @When("user Login with {string} and {string}")
    public void loginWithAdminUser(String userName, String password) throws InterruptedException {
        login.userName().sendKeys(userName);
        login.password().sendKeys(password);
        login.loginBtn().click();
    }

    @And("Click on Admin tab")
    public void clickOnAdminTab() {
        admin.adminTab().click();
    }

    @And("Get the number of records found")
    public void getRecordsNumber() {
        currentNumberOfRecords =  admin.numberOfRecords();
    }

    @And("Click on add button")
    public void clickAddButton() {
        admin.addBtn().click();
    }

    @And("Fill the required data {string} and {string} and {string}")
    public void fillDataToAddNewUser(String employeeName, String userName, String password) throws InterruptedException {
        addUSer.chooseUserRole();
        addUSer.chooseStatus();
        addUSer.newPassword().sendKeys(password);
        addUSer.newConfirmPassword().sendKeys(password);
        addUSer.newUserName().sendKeys(userName);
        addUSer.employeeName().sendKeys(employeeName);
        Thread.sleep(1000);
        Actions actions = new Actions(Driver.driver);
        actions.sendKeys(Keys.ARROW_DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        addUSer.saveBtn().click();

    }

    @Then("Verify that the number of records increased by one")
    public void verifyThatTheNumberOfRecordsIncreasedBy() {
        softAssert.assertEquals(admin.numberOfRecords(), currentNumberOfRecords + 1);
        softAssert.assertAll();

    }
}
