package baseAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebAction {

    private WebDriver driver;

    public WebAction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnBtn(WebElement element) {
        element.click();
    }

    public void switchToElemnt(WebElement element) {
        driver.switchTo().frame(element);
    }
}
