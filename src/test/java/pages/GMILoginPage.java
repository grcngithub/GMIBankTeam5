package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GMILoginPage {
    public GMILoginPage(){ PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//input[@id='username']")
    public WebElement userNameBox;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "(//button)[4]")
    public WebElement signInButton;
    @FindBy (xpath = "//h5/span")
    public WebElement loginPageText;
    @FindBy (xpath = "(//span)[22]")
    public WebElement CanselButton;
    @FindBy (xpath = "//a[@href='/account/reset/request']")
    public WebElement  Did_you_forget_your_password;
    @FindBy (xpath = "//a[@href='/account/register']")
    public WebElement Register_a_new_account;


        @FindBy (xpath = "//button[@type='submit']")
        public WebElement  SigninBut;

        @FindBy (xpath = "(//button[@type='button'])[3]")
        public WebElement CanselButton2;


        @FindBy (id = "email")
        public WebElement emailButton;
        @FindBy (xpath = "//button[@type='submit']")
        public WebElement resetButton;

        @FindBy(xpath = "/html/body/div[2]/div/div[1]/div/div/form/div[2]/div[1]/div[1]/div/span")
        public WebElement errorMesage;




}
