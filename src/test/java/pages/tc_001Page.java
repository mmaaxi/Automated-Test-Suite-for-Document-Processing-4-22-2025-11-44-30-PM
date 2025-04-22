package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_001Page {

    WebDriver driver;

    private By uploadOptionButton = By.id("uploadOption");
    private By singleUploadRadioButton = By.id("singleUpload");
    private By multipleUploadRadioButton = By.id("multipleUpload");
    private By singleUploadBox = By.id("singleUploadBox");
    private By multipleUploadBoxes = By.className("multipleUploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_document_upload_page() {
        driver.get("http://example.com/upload");
    }

    public void select_upload_option() {
        driver.findElement(uploadOptionButton).click();
    }

    public boolean is_single_and_multiple_upload_options_displayed() {
        return driver.findElement(singleUploadRadioButton).isDisplayed() &&
               driver.findElement(multipleUploadRadioButton).isDisplayed();
    }

    public void select_single_file_upload_option() {
        driver.findElement(singleUploadRadioButton).click();
    }

    public boolean is_single_upload_box_displayed() {
        WebElement element = driver.findElement(singleUploadBox);
        return element.isDisplayed() && element.isEnabled();
    }

    public void select_multiple_file_upload_option() {
        driver.findElement(multipleUploadRadioButton).click();
    }

    public boolean is_multiple_upload_boxes_displayed() {
        return driver.findElements(multipleUploadBoxes).size() > 0;
    }
}