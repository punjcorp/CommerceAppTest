import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:8080/login')

WebUI.click(findTestObject('Page_User Login/span_Signup'))

WebUI.setText(findTestObject('Page_Register_User/input_firstName'), findTestData('User Test Data').getValue(1, 2))

WebUI.setText(findTestObject('Page_Register_User/input_lastName'), findTestData('User Test Data').getValue(2, 2))

WebUI.setText(findTestObject('Page_Register_User/input_email'), findTestData('User Test Data').getValue(3, 2))

WebUI.setText(findTestObject('Page_Register_User/input_password'), findTestData('User Test Data').getValue(4, 2))

WebUI.setText(findTestObject('Page_Register_User/input_confirmPassword'), findTestData('User Test Data').getValue(4, 2))

WebUI.setText(findTestObject('Page_Register_User/input_address1'), findTestData('User Test Data').getValue(5, 2))

WebUI.setText(findTestObject('Page_Register_User/input_address2'), findTestData('User Test Data').getValue(6, 2))

WebUI.selectOptionByValue(findTestObject('Page_Register_User/select_addressType'), findTestData('User Test Data').getValue(
        7, 2), true)

WebUI.setText(findTestObject('Page_Register_User/input_phone1'), findTestData('User Test Data').getValue(8, 2))

WebUI.setText(findTestObject('Page_Register_User/input_phone2'), findTestData('User Test Data').getValue(9, 2))

WebUI.setText(findTestObject('Page_Register_User/input_city'), findTestData('User Test Data').getValue(10, 2))

WebUI.setText(findTestObject('Page_Register_User/input_state'), findTestData('User Test Data').getValue(11, 2))

WebUI.setText(findTestObject('Page_Register_User/input_country'), findTestData('User Test Data').getValue(12, 2))

WebUI.setText(findTestObject('Page_Register_User/input_pincode'), findTestData('User Test Data').getValue(13, 2))

WebUI.click(findTestObject('Page_Register_User/input_btn btn-info btn-block'))

WebUI.click(findTestObject('Page_User Login/div_Your account has been crea'))

WebUI.closeBrowser()

