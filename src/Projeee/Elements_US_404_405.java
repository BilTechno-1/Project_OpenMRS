package Projeee;

import Utility.BaseDriverGenel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

import static Utility.BaseDriverGenel.wait;

public class Elements_US_404_405 {

    public Elements_US_404_405() {
    PageFactory.initElements(BaseDriverGenel.driver,this);
    }

    @FindBy(css = "[class='gt_float_switcher-arrow']")
    public WebElement languageBtn;

    @FindBy(css = "[data-gt-lang='en']")
    public WebElement englishLanguage;

    @FindBy(linkText = "Demo")
    public WebElement demoBtn;

    @FindBy(xpath = "//*[text()='Explore OpenMRS 2']")
    public WebElement openMrs2;

    @FindBy(xpath = "//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement openMrs2Demo;

    @FindBy(name = "username")
    public WebElement username;

    @FindBy(name = "password")
    public WebElement passWord;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy(css = "[id='content'] h4")
    public WebElement textlabel;

    @FindBy(css = "[class='nav-item identifier']")
    public WebElement admin;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(xpath = "(//*[@class='button app big'])[1]")
    public WebElement changePassword;

    @FindBy(xpath = "(//*[@class='button app big'])[2]")
    public WebElement myLanguages;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy(xpath = "//*[@class='icon-search']")
    public WebElement findPatientRecord;

    @FindBy(css = "[id='patient-search']")
    public WebElement patientSearch;

    @FindBy(css = "[class='PersonName-givenName']")
    public WebElement personName;

    @FindBy(css = "[id='sessionLocation']>li")
    public List<WebElement> sessionLocationList;

    @FindBy(xpath = "//*[@id='patient-search-results-table']//td[1]")
    public List<WebElement> idler;

    @FindBy(xpath = "(//*[@class='col-11 col-lg-10'])[8]")
    public WebElement deletePatient;

    @FindBy(id = "delete-reason")
    public WebElement deleteReason;

    @FindBy(xpath = "(//*[@class='confirm right'])[6]")
    public WebElement confirmBtn;

    @FindBy(xpath = "//*[@id='patient-search-results-table']//td[2]")
    public List<WebElement> patientResults;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    public void verifyMessageContainsText(String value){
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"),0));
        Assert.assertTrue( this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));


    }






}
