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

WebUI.setText(findTestObject('Page_User Login/input_username'), 'amit@gmail.com')

WebUI.setText(findTestObject('Page_User Login/input_password'), 'amit')

WebUI.click(findTestObject('Page_User Login/button_Login'))

WebUI.waitForElementClickable(findTestObject('Page_Home/a_accountmenu'), 10)

WebUI.click(findTestObject('Page_Home/a_accountmenu'))

WebUI.waitForElementClickable(findTestObject('Page_Home/a_manageaccount'), 10)

WebUI.click(findTestObject('Page_Home/a_manageaccount'))

WebUI.click(findTestObject('Page_Manage_User/input_editbtn'))

WebUI.setText(findTestObject('Page_Manage_User/input_lastName'), 'changed')

WebUI.click(findTestObject('Page_Manage_User/input_btn btn-info btn-block'))

WebUI.click(findTestObject('Page_Manage_User/div_The details has been updat'))

WebUI.click(findTestObject('Page_Manage_User/a_nav-link'))

WebUI.closeBrowser()

