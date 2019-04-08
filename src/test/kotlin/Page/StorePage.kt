package Page

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebDriver

class StorePage(driver: WebDriver) : BasePage(driver as AppiumDriver<*>){

    fun checkStorePageIsDisplayed(): StorePage{
        checkElementIsDisplayedById("ui_view_store_home_title_store_name")
        return this
    }

    fun checkLocationDeliverToIsDisplayed() : StorePage{
        checkElementIsDisplayedById("ui_view_store_home_title_store_name")
        return this
    }

    fun verifyAddressLocationSameAsEntered() : StorePage{
        checkTextElementIsEqualsById("ui_view_address_info_text_view_address","North Bekasi, North Bekasi, Bekasi City, West Java, Indonesia")
        return this
    }

    fun clickCategoriesButton() : ListOfCategoriesPage{
        clickElementById("component_browse_categories")
        return ListOfCategoriesPage(driver)
    }


}