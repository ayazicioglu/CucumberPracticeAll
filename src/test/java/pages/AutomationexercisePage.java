package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationexercisePage {

    public AutomationexercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[text()=' Signup / Login']")
    public WebElement signupLoginButton;

    @FindBy(xpath = "//*[@placeholder='Name']")
    public WebElement nameKutusu;

    @FindBy(xpath = "(//*[@placeholder='Email Address'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signupButon;

    @FindBy(xpath = "(//input[@id='id_gender1'])[1]")
    public WebElement mrButon;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButon;

    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement basariliKayitYazisi;



}
