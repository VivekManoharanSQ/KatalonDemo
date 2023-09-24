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

WebUI.navigateToUrl('https://test-sqms.skill-quotient.com/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Login-/Login_Username'), 'skill@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login-/Login_Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/Page_Login-/button_Login'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Login-/div_Timesheet'))

WebUI.click(findTestObject('Object Repository/Page_Login-/a_Add Timesheet'))

WebUI.setText(findTestObject('Object Repository/Page_Add Timesheet/input_Employee_basic_employee'), '100')

WebUI.click(findTestObject('Object Repository/Page_Add Timesheet/div_SQR2023073100 - praveen ram'))

WebUI.click(findTestObject('Page_Add Timesheet/text_WorkOrder'))

WebUI.click(findTestObject('Object Repository/Page_Add Timesheet/div_SQW2023072748-Automation-exe'))

WebUI.setText(findTestObject('Object Repository/Page_Add Timesheet/input_Work Hours_basic_workedHours'), '40')

WebUI.setText(findTestObject('Object Repository/Page_Add Timesheet/input_Annual Leave Hours_basic_annualLeaveHours'), '5')

WebUI.setText(findTestObject('Object Repository/Page_Add Timesheet/input_Sick Leave Hours_basic_sickLeaveHours'), '0')

WebUI.click(findTestObject('Object Repository/Page_Add Timesheet/input_Date From-To_basic_date'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Add Timesheet/input_Date From-To_basic_date'), '01-09-2023')

WebUI.click(findTestObject('Object Repository/Page_Add Timesheet/input'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Add Timesheet/input'), '30-09-2023')

WebUI.uploadFileWithDragAndDrop(findTestObject('Page_Add Timesheet/button_Click to attach'), 'C:\\Users\\skquo\\Katalon Studio\\CDA_WW_EN.pdf')

WebUI.delay(10)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_Add Timesheet/button_Save as draft'))

WebUI.closeBrowser()

