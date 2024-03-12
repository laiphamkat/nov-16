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

"Step 5: Click on button 'add-to-cart-sauce-labs-bike-light'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('AI-Generated/Page_inventory_html/button_add_to_cart_sauce_labs_bike_light'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_inventory_html/button_add_to_cart_sauce_labs_bike_light'))

"Step 6: Click on link '2' -> Navigate to page 'checkout-step-one.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_inventory_html/hyperlink_object'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/inventory.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_inventory_html/hyperlink_object'))

"Step 7: Click on input field 'firstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_first_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_first_name'))

"Step 8: Enter input value in input field 'firstName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_first_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_checkout-step-one_html/input_first_name'), input_firstname)

"Step 9: Click on input field 'lastName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_last_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_last_name'))

"Step 10: Enter input value in input field 'lastName'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_last_name'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_checkout-step-one_html/input_last_name'), input_lastname)

"Step 11: Click on input field 'postalCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_postal_code'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_postal_code'))

"Step 12: Enter input value in input field 'postalCode'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_postal_code'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('Page_checkout-step-one_html/input_postal_code'), input_postalcode)

"Step 13: Click on input field 'continue' -> Navigate to page 'checkout-step-two.html'"

WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Page_checkout-step-one_html/input_continue'), 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/checkout-step-one.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('Page_checkout-step-one_html/input_continue'))

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Successful Checkout Process for Sauce Labs Bike Light_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
