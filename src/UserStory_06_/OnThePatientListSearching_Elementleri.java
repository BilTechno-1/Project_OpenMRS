package UserStory_06_;

import UserStory_06_.Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnThePatientListSearching_Elementleri {

    public OnThePatientListSearching_Elementleri() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(css = "[class='gt-current-lang']")// Dropdown'ı bulma
    public WebElement dropdown;

    @FindBy(linkText = "English") // English butonu
    public WebElement englishButton;

    @FindBy(linkText = "Demo") // Demo butonu
    public WebElement demo;
    public void selectLanguage(String language) {
        dropdown.click();
        if (language.equals("English")) {
            englishButton.click(); // İngilizce butonuna tıklama
        }
    }
    @FindBy(linkText = "Explore OpenMRS 2")//Explore OpenMRS 2 butonu
    public WebElement EO2;

    @FindBy(linkText = "Enter the OpenMRS 2 Demo")//Enter the OpenMRS 2 Demo butonu
    public WebElement EO2D;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "Inpatient Ward")
    public WebElement locationSelection ;

    @FindBy(id = "loginButton")
    public WebElement login;

    @FindBy(xpath = "//*[@id='apps']/a[1]")
    public WebElement FindPatientRecord;


    @FindBy(id = "patient-search")
    public WebElement searchInput;


    @FindBy(xpath= "//*[@role='alert']")
    public WebElement result;

    @FindBy(xpath = "//td[@class='dataTables_empty' and contains(text(), 'No matching records found')]")
    public WebElement message;

}
