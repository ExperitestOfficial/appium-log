import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android {

    protected NewAndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("platform", "android");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "<APP_PACKAGE>");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "<APP_ACTIVITY>");;
        driver = new NewAndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @Test
    public void testUntitled() {
    }

    @After
    public void tearDown() {

        driver.quit();
    }
}