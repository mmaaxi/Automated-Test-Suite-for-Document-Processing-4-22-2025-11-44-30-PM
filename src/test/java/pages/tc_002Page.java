package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    private WebDriver driver;
    private By uploadInput = By.id("file-upload");
    private By uploadButton = By.id("upload-button");
    private By successMessage = By.id("upload-success");
    private By filePreview = By.id("file-preview");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadFile(String filename) {
        driver.findElement(uploadInput).sendKeys(System.getProperty("user.dir") + "/files/" + filename);
        driver.findElement(uploadButton).click();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isFilePreviewDisplayed() {
        return driver.findElement(filePreview).isDisplayed();
    }
}