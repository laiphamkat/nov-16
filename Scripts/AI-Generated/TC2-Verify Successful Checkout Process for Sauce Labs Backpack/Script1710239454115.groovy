import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import katalon.truetest.TrueTestScripts
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://www.saucedemo.com/"

WebUI.navigateToUrl(GlobalVariable.application_domain + '/')

"Step 2: Login into Application"

WebUI.takeScreenshot()

TrueTestScripts.login()

"Step 3: Enter input value in input field 'user-name'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_username'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_home/input_username'), input_user_name)

"Step 4: Click on input field 'password' -> Navigate to page 'inventory.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_home/input_password'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_home/input_password'))

"Step 5: Click on link 'item 4 title link' -> Navigate to page 'inventory-item.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/hyperlink_item_4_title_link'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/hyperlink_item_4_title_link'))

"Step 6: Click on button 'add-to-cart-sauce-labs-backpack'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_inventory-item_html/button_remove_sauce_labs_bike_light'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory-item_html/button_remove_sauce_labs_bike_light'))

"Step 7: Click on link '1' -> Navigate to page 'cart.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory-item_html/hyperlink_1'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory-item.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory-item_html/hyperlink_1'))

"Step 8: Click on button 'checkout' -> Navigate to page 'checkout-step-one.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_cart_html/button_checkout'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/cart.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_cart_html/button_checkout'))

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Successful Checkout Process for Sauce Labs Backpack_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
