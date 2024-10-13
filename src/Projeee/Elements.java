package Projeee;

import Utility.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Elements {

    public Elements() {
        PageFactory.initElements(BaseDriverGenel.driver, this);
    }

    @FindBy(css = "[class='gt_float_switcher-arrow']")
    public WebElement dilAyari;

    @FindBy(css = "[alt='en']")
    public WebElement english;


    @FindBy(linkText = "Demo")
    public WebElement demo;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement exploreOpenMRS2;

    @FindBy(linkText= "Enter the OpenMRS 2 Demo")
    public WebElement entertheOpenMRS2Demo;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "loginButton")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='You must choose a location!']")
    public WebElement youMustChooseaLocation;

    @FindBy(id = "Inpatient Ward")
    public WebElement ınpatientWard;

    @FindBy(xpath = "//*[text()='Invalid username/password. Please try again.']")
    public WebElement pleaseTryAgain;

    @FindBy(css = "//span[text()='tr']")
    public boolean trYazıyormu;

    @FindBy(linkText = "Logout")
    public WebElement logout;

    @FindBy(css = "[id='sessionLocation']>li")
    public List<WebElement> randomLocation;

    @FindBy(linkText = "Register a patient")
    public WebElement registeraPatient;

    @FindBy(name = "givenName")
    public WebElement givenName;

    @FindBy(name = "familyName")
    public WebElement familyName;

    @FindBy(id = "next-button")
    public WebElement nextButton;

    @FindBy(id = "gender-field")
    public WebElement gender;

    @FindBy(id = "birthdateDay-field")
    public WebElement day;

    @FindBy(id = "birthdateMonth-field")
    public WebElement month;

    @FindBy(id = "birthdateYear-field")
    public WebElement year;

    @FindBy(id = "address1")
    public WebElement adress;

    @FindBy(id = "address2")
    public WebElement adress2;

    @FindBy(id = "cityVillage")
    public WebElement cityVillage;

    @FindBy(id = "stateProvince")
    public WebElement stateProvince;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(id = "postalCode")
    public WebElement postalCode;

    @FindBy(name = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "relationship_type")
    public WebElement relationship_type;

    @FindBy(css = "[placeholder='Person Name']")
    public WebElement personName;

    @FindBy(id = "submit")
    public WebElement confirm;

    @FindBy(css = "[class='PersonName-givenName']")
    public WebElement hastaKayıtAdıKontrolü;

    @FindBy(css = "[class='float-sm-right'] span")
    public WebElement hastaId;

    @FindBy(css = "[id='navbarSupportedContent'] li")
    public WebElement adminHoverOver;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(xpath= "(//*[@class='task'])[1]")
    public WebElement changePassword;

    @FindBy(xpath = "(//*[@class='task'])[2]")
    public WebElement myLanguages;

    @FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
    public WebElement hastaKayıtArama;

    @FindBy(css = "[placeholder='Search by ID or Name']")
    public WebElement isimVeyaIdleArama;

    @FindBy(xpath = "(//tr[@class='odd']/ td)[2]")
    public WebElement hastaAdı;

    @FindBy(xpath = "//td[text()='No matching records found']")
    public WebElement noMatchingRecordsFound;

    @FindBy(xpath = "(//div[@class='col-11 col-lg-10'])[8]")
    public WebElement deletePatient;

    @FindBy(id = "delete-reason")
    public WebElement deleteReason;

    @FindBy(css = "[role='alert'] tr")
    public List<WebElement> identifier;

    @FindBy(className = "dataTables_info")
    public WebElement hastaSayısı;

    @FindBy(css = "[href='/openmrs/referenceapplication/home.page']")
    public WebElement logo;

    @FindBy(id = "coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension")
    public WebElement dataManagement;

    @FindBy(id = "coreapps-mergePatientsHomepageLink-app")
    public WebElement mergePatientElectronicRecords;

    @FindBy(id = "patient1-text")
    public WebElement patientID1;

    @FindBy(id = "patient2-text")
    public WebElement patientID2;

    @FindBy(id = "confirm-button")
    public WebElement confirmbutton;

    @FindBy(css = "[class='row name'] h3")
    public WebElement hastaSecme;

    @FindBy(xpath = "[class='messages-container'] h1")
    public WebElement değişiklikİçinSonUyarı;




}