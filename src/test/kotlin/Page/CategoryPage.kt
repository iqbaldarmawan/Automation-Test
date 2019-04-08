package Page

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebDriver

class CategoryPage(driver: WebDriver) : BasePage(driver as AppiumDriver<*>){

    fun checkCategoryPageIsDisplayed(): CategoryPage{
        checkElementIsDisplayedById("toolbar")
        return this
    }

    fun sortByButtonIsDisplayed() :CategoryPage{
        checkElementIsDisplayedById("sort_by_header")
        return this
    }

    fun sortByCriteriaDisplayed() :CategoryPage{
        checkElementIsDisplayedById("sort_by_criteria")
        return this
    }

    fun checkSubCategoryIsDisplayed() :CategoryPage{
        checkElementIsDisplayedById("textview_category_name")
        return this
    }

    fun checkItemIsDisplayed() : CategoryPage{
        checkElementIsDisplayedById("ripple")
        return this
    }

    fun checkSaleIsDisplayed() : CategoryPage{
        checkElementIsDisplayedById("banner_text")
        return this
    }

    fun checkNormalPriceIsDIsplayed() : CategoryPage{
        checkElementIsDisplayedById("product_original_price_text_view")
        return this
    }

    fun checkPriceAfterSaleIsDisplayed() : CategoryPage{
        checkElementIsDisplayedById("product_price_text_view")
        return this
    }

    fun checkItemNameIsDisplayed() : CategoryPage{
        checkElementIsDisplayedById("product_name_text_view")
        return this
    }

    fun checkProductUnitIsDIsplayed() : CategoryPage{
        checkElementIsDisplayedById("sort_by_header")
        return this
    }

    fun checkPriceUniteIsDisplayed() : CategoryPage{
        checkElementIsDisplayedById("product_unit_price")
        return this
    }

    fun clickSortButon() : SortOnCategoryPage{
        clickElementById("sort_by_header")
        return SortOnCategoryPage(driver)
    }

}