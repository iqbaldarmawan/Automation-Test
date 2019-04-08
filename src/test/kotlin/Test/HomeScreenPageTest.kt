package Test

import Page.HomeScreenPage
import org.junit.Test

class HomeScreenPageTest : BasePageTest() {

    @Test
    fun homePage_HP_01_selectLoctionStoreAndInputAddresUsingSearchBar() {
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
    }
}