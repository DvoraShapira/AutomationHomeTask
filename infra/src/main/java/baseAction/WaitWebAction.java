package baseAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class WaitWebAction {

    private static WebDriverWait wait;
    private static final int SECONDS = 120;

    public WaitWebAction(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(SECONDS));
    }

    public void waitForElementNotBeExist(WebElement element) {
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void waitForElementHaveValue(WebElement element) {
        wait.until(ExpectedConditions.attributeToBeNotEmpty(element, "value"));
    }

    public void waitForElementToBeEnable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
