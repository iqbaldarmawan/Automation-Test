package Page

import io.appium.java_client.AppiumDriver
import org.openqa.selenium.WebDriver

class ListOfCategoriesPage(driver: WebDriver) : BasePage(driver as AppiumDriver<*>){

    fun checkListOfCategoriePageIsDisplayed(): ListOfCategoriesPage{
        try {
            clickElementById("com_appboy_inappmessage_full_button_one")
            clickElementById("component_browse_categories")
        }
        catch (exception: Exception){
        }
        return this
    }

    fun checkCategoryNameIsDIsplayed(): ListOfCategoriesPage{
        checkElementIsDisplayedById("textview_category_name")
        return this
    }

    fun checkCategoryImageIsDIsplayed(): ListOfCategoriesPage{
        checkElementIsDisplayedById("imageview_category_image")
        return this
    }

    fun clickOneOfCategory() :CategoryPage{
        clickElementById("imageview_category_image")
        return CategoryPage(driver)
    }
}