package Projeee;

import Utility.BaseDriverGenel;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class US401_CheckingLoginErrorsInTheSystem extends BaseDriverGenel {

    @Test(dataProvider = "UserData", groups = {"Smoke Testi"})
    public void SistemeGirişLoginHatalarınıKontrolEtmek(String userNameDAta, String passwordData) {

        Elements elements = new Elements();

        driver.get("https://openmrs.org/");
        Tools.Bekle(2);

        if (driver.getCurrentUrl().equals("https://openmrs.org/tr/")) {
            wait.until(ExpectedConditions.elementToBeClickable(elements.dilAyari)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.english)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.demo)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.exploreOpenMRS2)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.entertheOpenMRS2Demo)).click();
        } else {
            wait.until(ExpectedConditions.elementToBeClickable(elements.demo)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.exploreOpenMRS2)).click();
            wait.until(ExpectedConditions.elementToBeClickable(elements.entertheOpenMRS2Demo)).click();
        }


        elements.username.sendKeys(userNameDAta);
        elements.password.sendKeys(passwordData);
        elements.loginButton.click();

        Assert.assertEquals(elements.youMustChooseaLocation.getText(),
                "You must choose a location!", "Yanlış uyarı");

        elements.ınpatientWard.click();
        elements.username.clear();
        elements.password.clear();
        elements.username.sendKeys(userNameDAta);
        elements.password.sendKeys(passwordData);
        elements.loginButton.click();

        Assert.assertTrue(elements.pleaseTryAgain.getText().equals("Invalid username/password. Please try again."),
                "Invalid username/password. Please try again.");


    }


    @DataProvider
    Object[][] UserData() {
        Object[][] userPass = {
                {"Polat", "fasfaf"},
                {"Erman", "12dd7fasfasa"},
                {"Ummet", "1vvv57a"},
                {"Fatma", "1xxx7a"},
                {"Leyla", "fafasf"},
                {"Ayce", "asdfsa"},
        };

        return userPass;
    }

}
