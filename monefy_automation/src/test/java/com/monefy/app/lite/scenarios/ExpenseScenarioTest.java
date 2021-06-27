/**
 * @author sunil_s
 * @created on 06/26/2021
 * @description Class containing Test Scripts for Expense Charter
 */
package com.monefy.app.lite.scenarios;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntry;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.monefy.app.lite.common.DriverSetup;
import com.monefy.app.lite.dataprovider.ExpenseDP;
import com.monefy.app.lite.objectrepo.BaseObjRepo;
import com.monefy.app.lite.pages.ExpensePage;

public class ExpenseScenarioTest extends DriverSetup {

	String platFormName, logFilePath;

	@BeforeMethod
	public void setUp() throws Exception {
		driverSet();
		platFormName = DriverSetup.getPlatform();
		logFilePath = DriverSetup.getLogfilePath();
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws Exception {
		try {
			if (!result.isSuccess()) {
				SimpleDateFormat formater = new SimpleDateFormat("ddMMyyyy_HHmmss");
				Calendar calendar = Calendar.getInstance();

				String classname1 = this.getClass().getName();
				int clsname2 = classname1.lastIndexOf('.') + 1;
				String className = classname1.substring(clsname2);

				String methodName = result.getName();

				String parameter = String.format("TestNG Debugger : %s() running with parameters %s.",
						result.getMethod().getConstructorOrMethod().getName(), Arrays.toString(result.getParameters()));
				System.out.println("parameter: " + parameter);
				String tcName = parameter.substring(parameter.indexOf("[") + 1, parameter.indexOf("[") + 6);

				// To capture the screenshot for the failure case(s)
				File scrFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File((logFilePath + className + "_" + methodName + "_"
						+ tcName + "_" + formater.format(calendar.getTime()) + ".png")));

				if ("ANDROID".equalsIgnoreCase(platFormName)) {
					// To capture the logs for the failure case(s)
					System.out.println("Saving device log - start");
					List<LogEntry> logEntries = getDriver().manage().logs().get("logcat").filter(Level.ALL);

					File logFile = new File(logFilePath + className + "_" + methodName + "_" + tcName + "_"
							+ formater.format(calendar.getTime()) + ".txt");
					@SuppressWarnings("resource")
					PrintWriter log_file_writer = new PrintWriter(logFile);
					for (LogEntry logEntry : logEntries) {
						if (logEntry.getMessage().toLowerCase().contains("com.monefy.app.lite")) {
							log_file_writer.println(logEntry);
							log_file_writer.flush();
						}
					}
					System.out.println("Saving device log - finish");
				}

			}
			// getDriver().quit();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	@AfterClass
	public void suiteTearDown() throws Exception {
		getDriver().quit();
	}

	
	/**
	 * @author sunil_s
	 * @description Test Method to verify expense screen 
	 * @param TC
	 */
	@Test(description = "Test to verify home screen", dataProvider = "ExpenseScreenValidations", dataProviderClass = ExpenseDP.class)
	public void verifyExpenseScreen(String TC, String ActResult, String ExpResult) {

		try {
			BaseObjRepo baseOR = getSetupor().getbaseobjrep();
			WebDriver dr = getDriver();
			printTestScriptExecutionInfo(TC);
			ExpensePage page = new ExpensePage();
 			Assert.assertTrue(page.ExpenseScreenValidations(TC,dr, baseOR,ActResult,ExpResult));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	
	/**
	 * @author sunil_s
	 * @description Test Method to verify repeat button click functionality 
	 * @param TC
	 */
	@Test(description = "Test to verify repeat button click functionality", dataProvider = "ExpenseScreen_RepeatButtonFunctionality", dataProviderClass = ExpenseDP.class)
	public void verifyExpenseScreen_RepeatButtonFunctionality(String TC, String ActResult, String ExpResult) {

		try {
			BaseObjRepo baseOR = getSetupor().getbaseobjrep();
			WebDriver dr = getDriver();
			printTestScriptExecutionInfo(TC);
			ExpensePage page = new ExpensePage();
 			Assert.assertTrue(page.ExpenseScreen_RepeatButtonFunctionality(TC,dr, baseOR,ActResult,ExpResult));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	
	/**
	 * @author sunil_s
	 * @description Test Method to verify date picker functionality 
	 * @param TC
	 */
	@Test(description = "Test to verify date picker functionality", dataProvider = "ExpenseScreen_DatePickerFunctionality", dataProviderClass = ExpenseDP.class)
	public void verifyExpenseScreen_DatePickerFunctionality(String TC, String ActResult, String ExpResult) {

		try {
			BaseObjRepo baseOR = getSetupor().getbaseobjrep();
			WebDriver dr = getDriver();
			printTestScriptExecutionInfo(TC);
			ExpensePage page = new ExpensePage();
 			Assert.assertTrue(page.ExpenseScreen_DatePickerFunctionality(TC,dr, baseOR,ActResult,ExpResult));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	
	/**
	 * @author sunil_s
	 * @description Test Method to verify date picker functionality 
	 * @param TC
	 */
	@Test(description = "Test to verify change payment method", dataProvider = "ExpenseScreen_ChangePaymentMethod", dataProviderClass = ExpenseDP.class)
	public void verifyExpenseScreen_ChangePaymentMethod(String TC, String ActResult, String ExpResult) {

		try {
			BaseObjRepo baseOR = getSetupor().getbaseobjrep();
			WebDriver dr = getDriver();
			printTestScriptExecutionInfo(TC);
			ExpensePage page = new ExpensePage();
 			Assert.assertTrue(page.ExpenseScreen_ChangePaymentMethod(TC,dr, baseOR,ActResult,ExpResult));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	/**
	 * @author sunil_s
	 * @description Test Method to verify amount input field functionality 
	 * @param TC
	 */
	@Test(description = "Test to verify amount input field functionality", dataProvider = "ExpenseScreen_AmountInputFieldFunctionality", dataProviderClass = ExpenseDP.class)
	public void verifyExpenseScreen_AmountInputFieldFunctionality(String TC, String ActResult, String ExpResult) {

		try {
			BaseObjRepo baseOR = getSetupor().getbaseobjrep();
			WebDriver dr = getDriver();
			printTestScriptExecutionInfo(TC);
			ExpensePage page = new ExpensePage();
 			Assert.assertTrue(page.ExpenseScreen_AmountInputFieldFunctionality(TC,dr, baseOR,ActResult,ExpResult));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}
	
	/**
	 * @author sunil_s
	 * @description Test Method to verify undo added expenses
	 * @param TC
	 */
	@Test(description = "Test to verify undo added expense", dataProvider = "ExpenseScreen_UndoAddedExpense", dataProviderClass = ExpenseDP.class)
	public void verifyExpenseScreen_UndoAddedExpense(String TC, String ActResult, String ExpResult) {

		try {
			BaseObjRepo baseOR = getSetupor().getbaseobjrep();
			WebDriver dr = getDriver();
			printTestScriptExecutionInfo(TC);
			ExpensePage page = new ExpensePage();
 			Assert.assertTrue(page.ExpenseScreen_UndoAddedExpense(TC,dr, baseOR,ActResult,ExpResult));
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false);
		}
	}

}
