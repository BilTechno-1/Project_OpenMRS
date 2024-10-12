package US_01;

import Utility.BaseDriverGenel;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
    public elements(){

}
@FindBy(css = "[class='gt_float_switcher-arrow']")
public WebElement dilAyari;

@FindBy(css = "[alt='en']")
public WebElement english;

@FindBy(linkText = "Demo")
public WebElement demo;

@FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
public WebElement exploreOpenMRS2;

@FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
public WebElement entertheOpenMRS2Demo;

@FindBy(id = "username")
public WebElement username;

@FindBy(id = "password")
public WebElement password;

@FindBy(id = "loginButton")
public WebElement loginButton;
}
