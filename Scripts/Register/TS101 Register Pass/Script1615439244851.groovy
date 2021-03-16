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

WebUI.click(findTestObject('Object Repository/Page_Welcome to Se Alumni website/a_Register'))

WebUI.click(findTestObject('Object Repository/Page_SE Alumni website register/div_'))

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_studentid'), '614259043')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_numna'), 'นาย')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_name'), 'วรทัต')

WebUI.click(findTestObject('Object Repository/Page_SE Alumni website register/div__1'))

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_lastname'), 'ปั้นอินทร์')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_idcard'), '1769900568518')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_yearend'), '12345678')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_skill'), 'milky')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_tel'), '0852638675')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input_Facebook_se_facebook'), 'milk')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input_Email_se_email'), '614259043@webmail')

WebUI.click(findTestObject('Object Repository/Page_SE Alumni website register/input__se_lakete'))

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input_Email_se_email'), '614259043@webmail.com')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_lakete'), '80/100')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_mu'), '100')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_district'), 'หัวหิน')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_aumpa'), 'หัวหิน')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__se_province'), 'ประจวบ')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_name'), 'มอ')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_rank'), 'มอ')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_lakete'), '99')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_mu'), '100')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_district'), 'หนองปากโลง')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_aumpua'), 'เมือง')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_province'), 'นครปฐม')

WebUI.setText(findTestObject('Object Repository/Page_SE Alumni website register/input__work_tel'), '0123456789')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SE Alumni website register/input_Password_se_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_SE Alumni website register/input_Password_btn btn-primary'))

WebUI.verifyTextPresent('login', false)

WebUI.closeBrowser()

