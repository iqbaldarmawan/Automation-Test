package Page

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

open class BasePage(var driver : AppiumDriver<*>)
{
    fun getElementById(id: String): MobileElement {
        return driver.findElement(By.id(id)) as MobileElement
    }

    fun getElementByXpath(xpath: String): MobileElement {
        return driver.findElement(By.xpath(xpath)) as MobileElement
    }

    fun waitForElementDisplayedById(id: String) {
        val wait = WebDriverWait(driver, 15)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)))
    }

    fun waitForElementDisplayedByText(text: String) {
        val wait = WebDriverWait(driver, 15)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(text)))
    }

    fun checkElementIsDisplayedById(id: String){
        waitForElementDisplayedById(id)
        Assert.assertTrue(
            "Failed : " + getElementById(id).toString() + " Is Not Displayed",
            getElementById(id).isDisplayed
        )
    }

    fun checkElementIsDisplayedByXpath(xpath: String){
        waitForElementDisplayedByText(xpath)
        assertTrue(
            "Failed : " + getElementByXpath(xpath).toString() + " Is Not Displayed",
            getElementByXpath(xpath).isDisplayed
        )
    }

    fun clickElementById(id : String){
        checkElementIsDisplayedById(id)
        getElementById(id).click()
    }

    fun clickElementByXpath(xpath: String){
        checkElementIsDisplayedByXpath(xpath)
        getElementByXpath(xpath).click()
    }

    fun inputTextToElement(id: String, textToInput: String) {
        checkElementIsDisplayedById(id)
        getElementById(id).sendKeys(textToInput)
        driver.hideKeyboard()
    }

    fun checkTextElementIsEqualsById(id: String, expected: String) {
        waitForElementDisplayedById(id)
        val actual = getElementById(id).text
        assertEquals("Failed : $actual Not Equals With $expected", expected, actual)
    }
}
