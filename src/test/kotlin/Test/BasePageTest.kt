package Test

import io.appium.java_client.MobileElement
import io.appium.java_client.android.AndroidDriver
import org.junit.After
import org.junit.Before
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.support.ui.WebDriverWait
import java.io.File
import java.net.URL

open class BasePageTest {

    lateinit var driver: AndroidDriver<MobileElement>
    lateinit var wait: WebDriverWait

    @Before
    fun setup() {
        val caps = DesiredCapabilities()
        val appDir = File(System.getProperty("user.dir") + "/src/test/resources/")
        val app = File(appDir, "happyfresh.apk")
        caps.setCapability("deviceName", "AndroidM")
        caps.setCapability("udid", "emulator-5554") //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android")
        caps.setCapability("platformVersion", "6.0")
        caps.setCapability("skipUnlock", "true")
        caps.setCapability("app",  app.getAbsolutePath())
        caps.setCapability("appPackage", "com.happyfresh.android")
        caps.setCapability("appActivity", "com.happyfresh.activities.SplashActivity")
        caps.setCapability("noReset", "false")
        driver = AndroidDriver(URL("http://0.0.0.0:4723/wd/hub"), caps)
        wait = WebDriverWait(driver, 10)
    }

    @After
    fun teardown() {
        driver.quit()
    }
}