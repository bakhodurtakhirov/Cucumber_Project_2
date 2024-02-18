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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
