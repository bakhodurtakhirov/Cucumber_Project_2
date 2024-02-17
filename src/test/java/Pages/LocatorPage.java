package Pages;

import Utilities.GWD;
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
            case "singInClick":
                return this.singInClick;
            
        }
        return null;
    }
    
    @FindBy(css = ".login")
    private WebElement singInClick;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private List<WebElement> dressList;

    
    


    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
