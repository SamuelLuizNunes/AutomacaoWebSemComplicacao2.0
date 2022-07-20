package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;
    @FindBy(xpath = "//login-modal//div[2]")
    public WebElement btnFechar;
    public WebElement divFecharModal;
    public WebElement inpUserName;
    public WebElement inpPassWord;
    public WebElement btnSignIn;
    public WebElement inpRemember;
    public WebElement linkCreateAccount;
}
