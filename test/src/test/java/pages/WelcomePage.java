package pages;

import baseClasses.BaseUIPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WelcomePage extends BaseUIPage {

    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CSS, using = "a[href='https://practice-automation.com/iframes/']")
    public WebElement iFrameElement;

}
