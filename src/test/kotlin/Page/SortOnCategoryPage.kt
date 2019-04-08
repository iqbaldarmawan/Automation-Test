package Page

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebDriver

class SortOnCategoryPage(driver: WebDriver) : BasePage(driver as AppiumDriver<*>) {

    fun checkSortOnCategoryPageIsDisplayed(): SortOnCategoryPage{
        checkElementIsDisplayedById("toolbar")
        return this
    }

    fun checkPopularityRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_popularity")
        return this
    }

    fun checkPromotionFirstRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_promotions")
        return this
    }

    fun checkLowestUnitPriceRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_lowest_unit_price")
        return this
    }

    fun checkHighestUnitPriceRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_highest_unit_price")
        return this
    }

    fun checkLowestItemPriceRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_lowest_price")
        return this
    }

    fun checkHighestItemPriceRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_highest_price")
        return this
    }

    fun checkAZRadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_a_z")
        return this
    }

    fun checkZARadioButtonIsDisplayed() : SortOnCategoryPage{
        checkElementIsDisplayedById("sort_by_z_a")
        return this
    }

    fun clickPopularityRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_popularity")
        return this
    }

    fun clickPromotionFirstRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_promotions")
        return this
    }

    fun clickLowestUnitPriceRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_lowest_unit_price")
        return this
    }

    fun clickHighestUnitPriceRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_highest_unit_price")
        return this
    }

    fun clickLowestItemPriceRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_lowest_price")
        return this
    }

    fun clickHighestItemPriceRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_highest_price")
        return this
    }

    fun clickAZRadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_a_z")
        return this
    }

    fun clickZARadioButton() : SortOnCategoryPage{
        clickElementById("sort_by_z_a")
        return this
    }

    fun checkSortByCriteriaSameAsSelected(criteria : String) : SortOnCategoryPage{
        checkTextElementIsEqualsById("sort_by_criteria",criteria)
        return this
    }
}