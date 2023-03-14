package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@aria-controls='example'])[1]")
    public WebElement newButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement isimKutusu;

    @FindBy(xpath = "//button[@class='btn']")
    public WebElement createButton;

    @FindBy(xpath = "//input[@aria-controls='example']")
    public WebElement searchBox;

    @FindBy(xpath = "(//td[@class='sorting_1'])[1]")
    public WebElement sonucYazi;

}
