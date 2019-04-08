package Test

import Page.HomeScreenPage
import org.junit.Test

class ListOfCategoriesPageTest : BasePageTest() {

    @Test
    fun listOfCategories_LOC_01_userCanChooseOneOfCategory() {
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
            .checkListOfCategoriePageIsDisplayed()
            .checkCategoryNameIsDIsplayed()
            .checkCategoryImageIsDIsplayed()
            .clickOneOfCategory()
    }
}