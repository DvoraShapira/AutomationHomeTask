package baseClasses;

import baseAction.WaitWebAction;
import baseAction.WebAction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.HelperFunctions;

public class BaseUITest {

    public WebDriver driver;
    public WaitWebAction waitWebAction;
    public WebAction webAction;
    public HelperFunctions helperFunctions;
    private static final String URL = "https://practice-automation.com/";


    @BeforeClass
    public void beforeClass() {
        initBrowser();
        initWebAction();
        initWebDriverWait();
        initHelperAction();
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        driver.quit();
    }

    public void initBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
    }

    public void initWebAction() {
        webAction = new WebAction(driver);
    }

    public void initHelperAction() {
        helperFunctions = new HelperFunctions(driver);
    }

    public void initWebDriverWait() {
        waitWebAction = new WaitWebAction(driver);
    }
}
