package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page page = new tc_010Page();

    @Given("the user is on the document upload page")
    public void userOnDocumentUploadPage() {
        page.goToDocumentUploadPage();
        Assert.assertTrue("The user is not on the document upload page", page.isOnDocumentUploadPage());
    }

    @When("the user uploads necessary documents")
    public void userUploadsDocuments() {
        page.uploadDocuments();
    }

    @When("the user initiates the document processing")
    public void userInitiatesProcessing() {
        page.initiateDocumentProcessing();
    }

    @Then("the system should generate the 'Slip de salida'")
    public void systemGeneratesSlipDeSalida() {
        Assert.assertTrue("The 'Slip de salida' was not generated", page.isSlipDeSalidaGenerated());
    }

    @Then("the system should save original documents in request history")
    public void systemSavesOriginalDocuments() {
        Assert.assertTrue("The original documents were not saved in history", page.areDocumentsSavedInHistory());
    }

    @Then("the system should save extracted data in request history")
    public void systemSavesExtractedData() {
        Assert.assertTrue("The extracted data were not saved in history", page.isDataSavedInHistory());
    }
}