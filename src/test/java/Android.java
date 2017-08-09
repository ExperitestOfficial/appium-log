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

    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("useRemoteGrid", true);
        dc.setCapability("username", "tom");
        dc.setCapability("password", "Aa123456");
        dc.setCapability(MobileCapabilityType.UDID, "ce05160545dc6d3702");
        dc.setCapability(MobileCapabilityType.APP, "http://192.168.2.72:8181/AndroidApps/cameraFlash-%20simulateCapture/com.CameraFlash-.MainActivity_ver_11.0.apk");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.CameraFlash");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".MainActivity");
        dc.setCapability("android.instrumentation.camera", true);
        dc.setCapability("instrumentApp", true);
        driver = new AndroidDriver<AndroidElement>(new URL("http://stage.experitest.com/wd/hub"), dc);
    }

    @Test
    public void testUntitled() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}