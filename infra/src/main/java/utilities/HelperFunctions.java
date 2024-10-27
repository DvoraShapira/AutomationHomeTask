package utilities;

import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.Set;

public class HelperFunctions {
    private WebDriver driver;

    public HelperFunctions(WebDriver driver) {
        this.driver = driver;
    }
    public void switchToTabByIndex(int tabIndex) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabIndex));
    }

    public void switchToNextTab() {
        Set<String> allWindowHandles = driver.getWindowHandles();
        String currentWindowHandle = driver.getWindowHandle();
        int currentIndex = 0;
        for (String windowHandle : allWindowHandles) {
            if (windowHandle.equals(currentWindowHandle)) {
                break;
            }
            currentIndex++;

        }
        int nextIndex = (currentIndex + 1) % allWindowHandles.size();
        driver.switchTo().window((String) allWindowHandles.toArray()[nextIndex]);
    }

    public void switchToTabByUrl(String url) {
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getCurrentUrl().contains(url)) {
                break;
            }
        }
    }
}
