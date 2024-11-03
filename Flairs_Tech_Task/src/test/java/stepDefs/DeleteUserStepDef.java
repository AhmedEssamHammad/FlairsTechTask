package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.AdminPage;
import pages.LoginPage;
import pages.SearchPage;

public class DeleteUserStepDef {
    LoginPage login = new LoginPage();
    AdminPage admin = new AdminPage();
    SearchPage search = new SearchPage();
    SoftAssert softAssert = new SoftAssert();
    int currentNumberOfRecords;

    @When("Admin user login with {string} and {string}")
    public void loginWithAdminUser(String userName, String password) {
        login.userName().sendKeys(userName);
        login.password().sendKeys(password);
        login.loginBtn().click();
    }

    @And("Click on Admin tab to delete user")
    public void clickOnAdminTabToDeleteUser() {
        admin.adminTab().click();
    }

    @And("Get the number of records")
    public void getTheNumberOfRecords() {
        currentNumberOfRecords =  admin.numberOfRecords();
    }

    @And("Search with the username {string} for the new user")
    public void searchWithTheUsernameForTheNewUser(String userName) {
        search.usersSearchSection().click();
        search.searchUserName().sendKeys(userName);
        search.searchBtn().click();
    }

    @And("Delete the new user")
    public void deleteTheNewUser() {
        search.deleteBtn().click();
        search.confirmDeleteBtn().click();
    }

    @And("Reset the search values")
    public void resetTheSearchValues() {
        search.resetBtn().click();
    }

    @Then("Verify that the number of records decreased by one")
    public void verifyThatTheNumberOfRecordsDecreasedBy() {
        softAssert.assertEquals(admin.numberOfRecords(), currentNumberOfRecords - 1);
        softAssert.assertAll();
    }


}
