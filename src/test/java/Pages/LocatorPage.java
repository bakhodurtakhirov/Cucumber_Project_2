package Pages;

import Utilities.GWD;
import org.apache.poi.ss.formula.functions.Now;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends Parent {

    public LocatorPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    
    public List<WebElement> getDressList() {
        return dressList;
    }
    
    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "username":
                return this.username;
            case "password":
                return this.password;
            case "SubmitLogin":
                return this.SubmitLogin;
            case "updateContactInfo":
                return this.updateContactInfo;
            case "address":
                return this.address;
            case "updateProfile":
                return this.updateProfile;
            case "errorMessage":
                return this.errorMessage;
            case "requestLoan":
                return this.requestLoan;
            case "LoanAmount":
                return this.LoanAmount;
            case "downPayment":
                return this.downPayment;
            case "applyNow":
                return this.applyNow;
            case "loanStatus":
                return this.loanStatus;
            case "newAccountId":
                return this.newAccountId;
            case "noTransactionsFoundMessage":
                return this.noTransactionsFoundMessage;
            case "insufficientFundsMessage":
                return this.insufficientFundsMessage;
            
            
            
            
            
            
                
            
        }
        return null;
    }
    
    

    @FindBy(xpath = "//span[text()='Add to cart']")
    private List<WebElement> dressList;
    
    @FindBy(name = "username")
    private WebElement username;
    
    @FindBy(name = "password")
    private WebElement password;
    
    @FindBy(css = "input[value=\"Log In\"]")
    private WebElement SubmitLogin;
    
    @FindBy(linkText = "Update Contact Info")
    private WebElement updateContactInfo;
    
    @FindBy(id = "customer.address.street")
    private WebElement address;
    
    @FindBy(css = "input[value=\"Update Profile\"]")
    private WebElement updateProfile;
    
    @FindBy(css = "span[class=\"error ng-scope\"]")
    private WebElement errorMessage;
    
    @FindBy(linkText = "Request Loan")
    private WebElement requestLoan;
    
    @FindBy(id = "amount")
    private WebElement LoanAmount;
    
    @FindBy(id = "downPayment")
    private WebElement downPayment;
    
    @FindBy(css = "input[value=\"Apply Now\"]")
    private WebElement applyNow;
    
    @FindBy(id = "loanStatus")
    private WebElement loanStatus;
    
    @FindBy(id = "newAccountId")
    private WebElement newAccountId;
    
    @FindBy(xpath = "//b[text()=\"No transactions found.\"]")
    private WebElement noTransactionsFoundMessage;
    
    @FindBy(xpath = "//p[text()=\"We cannot grant a loan in that amount with your available funds and down payment.\"]")
    private WebElement insufficientFundsMessage;
    
    
    @FindBy(linkText = "Register")
    private WebElement registerButton;
    @FindBy(id = "customer.firstName")
    private WebElement customerFirstName;
    @FindBy(id = "customer.lastName")
    private WebElement customerLastName;
    @FindBy(id = "customer.address.street")
    private WebElement customerAddress;
    @FindBy(id = "customer.address.city")
    private WebElement customerAddressCity;
    @FindBy(id = "customer.address.state")
    private WebElement customerAddressState;
    @FindBy(id = "customer.address.zipCode")
    private WebElement customerAddressZipCode;
    @FindBy(id = "customer.phoneNumber")
    private WebElement customerPhoneNumber;
    @FindBy(id = "customer.ssn")
    private WebElement customerSSN;
    @FindBy(id = "customer.username")
    private WebElement customerUserName;
    @FindBy(id = "customer.password")
    private WebElement customerPassword;
    @FindBy(id = "repeatedPassword")
    private WebElement customerPasswordConfirm;
    @FindBy(css = "input[type=\"submit\"]")
    private WebElement registerComplete;
    @FindBy(css = "h1[class=\"title\"]")
    private WebElement registerSuccessMessage;
    @FindBy(linkText = "Log Out")
    private WebElement logOut;
    @FindBy(xpath = "//p[@class=\"smallText\"]//b")
    private WebElement myAccountSuccess;
    @FindBy(xpath = "//p[contains(text(),'Please enter a username and password.')]")
    private WebElement myAccountError;
    @FindBy(linkText = "Bill Pay")
    private WebElement billPay;
    @FindBy(name = "payee.name")
    private WebElement payeeName;
    @FindBy(name = "payee.address.street")
    private WebElement payeeAddress;
    @FindBy(name = "payee.address.city")
    private WebElement payeeCity;
    @FindBy(name = "payee.address.state")
    private WebElement payeeState;
    @FindBy(name = "payee.address.zipCode")
    private WebElement payeeZipCode;
    @FindBy(name = "payee.phoneNumber")
    private WebElement payeePhone;
    @FindBy(name = "payee.accountNumber")
    private WebElement payeeAccountNumber;
    @FindBy(name = "verifyAccount")
    private WebElement payeeAccountNumberVerify;
    @FindBy(name = "amount")
    private WebElement payeeAmount;
    @FindBy(css = "input[type=\"submit\"]")
    private WebElement payeeSendPayment;
    @FindBy(xpath = "(//div[@ng-show=\"showResult\"]//span)[3]")
    private WebElement payeeSuccessMessage;
    @FindBy(linkText = "Accounts Overview")
    private WebElement accountOverview;
    @FindBy(css = "a[class=\"ng-binding\"]")
    private WebElement accountNumber;
    @FindBy(css = "td[class=\"ng-binding ng-scope\"]")
    private WebElement paymentCompleteMessage;
    @FindBy(linkText = "Open New Account")
    private WebElement openNewAccount;
    @FindBy(id = "type")
    private WebElement openAccDropDownMenu;
    @FindBy(id = "newAccountId")
    private WebElement newAccountSuccess;
    @FindBy(css = "input[type=\"submit\"]")
    private WebElement openNewAccount12;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
