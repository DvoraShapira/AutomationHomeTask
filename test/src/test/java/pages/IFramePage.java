package pages;

import baseClasses.BaseUIPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IFramePage extends BaseUIPage {

    public IFramePage(WebDriver driver){
        super(driver);
    }

    @FindBy(how = How.ID,using = "iframe-1")
    public WebElement iframe1;

    @FindBy(how = How.XPATH,using = "//*[@id=\"__docusaurus\"]/footer/div/div[1]/div[3]/ul/li[1]/a")
    public WebElement gitHubLink;

}
