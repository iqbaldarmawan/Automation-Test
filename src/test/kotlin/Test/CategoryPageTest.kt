package Test

import Page.HomeScreenPage
import org.junit.Test

class CategoryPageTest : BasePageTest() {

    @Test
    fun categoryPage_CP_01_userCanClickSortByButton() {
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
            .checkCategoryPageIsDisplayed()
            .sortByButtonIsDisplayed()
            .sortByCriteriaDisplayed()
            .checkSubCategoryIsDisplayed()
            .checkItemIsDisplayed()
            .checkSaleIsDisplayed()
            .checkNormalPriceIsDIsplayed()
            .checkPriceAfterSaleIsDisplayed()
            .checkItemNameIsDisplayed()
            .checkProductUnitIsDIsplayed()
            .checkPriceUniteIsDisplayed()
            .clickSortButon()
    }
}