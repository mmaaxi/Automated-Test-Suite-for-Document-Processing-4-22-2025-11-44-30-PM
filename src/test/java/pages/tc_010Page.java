package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    By documentUploadPageIdentifier = By.id("documentUploadPage");
    By slipDeSalidaIdentifier = By.id("slipDeSalida");
    By historyOriginalDocumentsIdentifier = By.id("historyOriginalDocuments");
    By historyExtractedDataIdentifier = By.id("historyExtractedData");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void goToDocumentUploadPage() {
        driver.get("http://example.com/document-upload");
    }

    public boolean isOnDocumentUploadPage() {
        return driver.findElement(documentUploadPageIdentifier).isDisplayed();
    }

    public void uploadDocuments() {
        // Code to upload documents
    }

    public void initiateDocumentProcessing() {
        // Code to start processing documents
    }

    public boolean isSlipDeSalidaGenerated() {
        return driver.findElement(slipDeSalidaIdentifier).isDisplayed();
    }

    public boolean areDocumentsSavedInHistory() {
        return driver.findElement(historyOriginalDocumentsIdentifier).isDisplayed();
    }

    public boolean isDataSavedInHistory() {
        return driver.findElement(historyExtractedDataIdentifier).isDisplayed();
    }
}