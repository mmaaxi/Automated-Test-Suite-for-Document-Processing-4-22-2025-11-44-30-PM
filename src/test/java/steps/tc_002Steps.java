package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_002Page;

public class tc_002Steps {
    private WebDriver driver;
    private tc_002Page page;

    public tc_002Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc_002Page.class);
    }

    @Given("I am on the file upload page")
    public void i_am_on_the_file_upload_page() {
        driver.get("http://example.com/upload");
    }

    @When("I select a {string} file within the size limit")
    public void i_select_valid_file(String filename) {
        page.uploadFile(filename);
    }

    @Then("the file is uploaded successfully")
    public void the_file_is_uploaded_successfully() {
        Assert.assertTrue(page.isUploadSuccessMessageDisplayed());
    }

    @Then("I can see a preview showing the file name, size, and type")
    public void i_can_see_file_preview() {
        Assert.assertTrue(page.isFilePreviewDisplayed());
    }
}