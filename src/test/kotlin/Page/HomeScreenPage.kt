package Page

import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement

class HomeScreenPage(driver: AppiumDriver<MobileElement>) : BasePage(driver) {

    fun checkHomeScrenPageIsDisplayed(): HomeScreenPage{
        checkElementIsDisplayedById("ui_view_newsfeed_display_on_home_screen_view_pager")
        return this
    }

    fun clickEnglishLanguage(): HomeScreenPage{
        try {
            clickElementById("textview_default")
        }
        catch (exception: Exception){
        }
        return this
    }

    fun clickDeliverToButton() : HomeScreenPage{
        clickElementById("component_address_info")
        return this
    }

    fun clickAllowLocationPermission() : HomeScreenPage{
        clickElementById("com.android.packageinstaller:id/permission_allow_button")
        return this
    }

    fun clickAllowFilePermission() : HomeScreenPage{
        clickElementById("com.android.packageinstaller:id/permission_allow_button")
        return this
    }

    fun clickFindAddressBar() : HomeScreenPage{
        clickElementById("et_find_address")
        return this
    }

    fun inputAddress(address : String) : HomeScreenPage{
        inputTextToElement("et_find_address", address)
        clickElementById("suggested_name")
        return this
    }

    fun clickUseThisAddressButton() : HomeScreenPage{
        clickElementById("btn_next")
        return this
    }

    fun checkAddressLocationSameAsEntered() : HomeScreenPage{
        checkTextElementIsEqualsById("ui_view_address_info_text_view_address","North Bekasi, North Bekasi, Bekasi City, West Java, Indonesia")
        return this
    }

    fun imageStoreImageIsDisplayed() : HomeScreenPage{
        checkElementIsDisplayedById("container")
        return this
    }

    fun imageStoreNameIsDisplayed() : HomeScreenPage{
        checkElementIsDisplayedById("text_view_supplier")
        return this
    }

    fun clickStoreButton() : StorePage{
        clickElementById("text_view_supplier")
        return StorePage(driver)
    }

}