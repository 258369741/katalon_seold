import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

WebUI.navigateToUrl('http://localhost/seoldsk/index.php/seold/index')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Se Alumni website/a_login'))

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website login/input_Log in_se_studenid'), '614259043')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SE Alumni website login/input_Log in_se_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_SE Alumni website login/input_Log in_login'))

WebUI.click(findTestObject('Object Repository/Page_SE Alumni/a_'))

WebUI.click(findTestObject('Object Repository/Page_profile/a_'))

WebUI.setText(findTestObject('Object Repository/Page_dit profile/input__se_name'), 'milky')

WebUI.click(findTestObject('Object Repository/Page_dit profile/input__submit'))

WebUI.verifyTextPresent('milky', false)

WebUI.closeBrowser()

