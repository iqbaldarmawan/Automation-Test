package Test

import Page.HomeScreenPage
import org.junit.Test

class StorePageTest : BasePageTest() {

    @Test
    fun storePage_SP_01_userClickOnCategoriesButton() {
        HomeScreenPage(driver)
            .clickEnglishLanguage()
            .checkHomeScrenPageIsDisplayed()
            .clickDeliverToButton()
            .clickAllowLocationPermission()
            .clickAllowFilePermission()
            .clickFindAddressBar()
            .inputAddress("Bekasi Utara")
            .clickUseThisAddressButton()
            .checkAddressLocationSameAsEntered()
            .imageStoreImageIsDisplayed()
            .imageStoreNameIsDisplayed()
            .clickStoreButton()
            .checkStorePageIsDisplayed()
            .checkLocationDeliverToIsDisplayed()
            .verifyAddressLocationSameAsEntered()
            .clickCategoriesButton()
    }
}