import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;


public class IOS {

    protected NewIOSDriver driver = null;

    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";

    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("platform", "ios");
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "<APP_BUNDLE_ID>");
        driver = new NewIOSDriver<IOSElement>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @Test
    public void testUntitled() {

    }


            @AfterMethod
    public void tearDown() {

        driver.quit();
    }

}