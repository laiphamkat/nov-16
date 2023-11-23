import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page checkout-step-two html'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/checkout-step-two.html')

'step 2: Add visual checkpoint at Page checkout-step-two html'

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Verify Page Display for Checkout Step Two_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
