/**
 * @author sunil_s
 * @created on 06/26/2021
 */
package com.monefy.app.lite.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.ConnectionClosedException;

import com.monefy.app.lite.common.DriverSetup;
import com.monefy.app.lite.objectrepo.BaseObjRepo;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;


public class ExpensePage extends BasePage {

	String platFormName = DriverSetup.getPlatform();
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify home screen validations
	 * @param TC
	 * @return
	 */
	public boolean HomeScreenValidations(String TC,WebDriver dr, BaseObjRepo obj, String month,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
		
			obj.getHomeScreen_OpenNavigationBtn(dr, actResult[0]).getText().trim().equalsIgnoreCase(expResult[0]);
			obj.getHomeScreen_HomeScreenTitle(dr, actResult[1]).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getHomeScreen_AllAccountsTxt(dr, actResult[2]).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getHomeScreen_SearchBtn(dr, actResult[3]).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getHomeScreen_TransferBtn(dr, actResult[4]).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getHomeScreen_SettingsBtn(dr, actResult[5]).getText().trim().equalsIgnoreCase(expResult[5]);
			obj.getHomeScreen_MonthTxt(dr, month).isDisplayed();
			obj.getHomeScreen_IncomeAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[6]);
			obj.getHomeScreen_ExpenseAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[6]);
			obj.getHomeScreen_BalanceAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[7]);
			obj.getHomeScreen_IncomeBtn(dr).getText().trim().equalsIgnoreCase(expResult[8]);
			obj.getHomeScreen_ExpenseBtn(dr).getText().trim().equalsIgnoreCase(expResult[9]);
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}
		
	}
	
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify expense screen validations
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreenValidations(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			waitforElementToLoad(2);
			obj.getHomeScreen_ExpenseBtn(dr).click(); 
			
			waitforElementToLoad(3);
			obj.getExpenseScreen_AlertToastMsg(dr, actResult[0]).getText().trim().equalsIgnoreCase(expResult[0]);
			obj.getExpenseScreen_AlertToastMsg(dr, actResult[0]).click();
			obj.getExpenseScreen_NavigateUpBtn(dr).isDisplayed();
			obj.getExpenseScreen_Title(dr, actResult[1]).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getExpenseScreen_RepeatBtn(dr).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getExpenseScreen_DatePicker(dr).isDisplayed();
			obj.getExpenseScreen_CurrencyIcon(dr).isDisplayed();
			obj.getExpenseScreen_CurrencyTxt(dr).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getExpenseScreen_AmtTxtFld(dr).isDisplayed();
			obj.getExpenseScreen_KeyboardClearBtn(dr).isDisplayed();
			obj.getExpenseScreen_NoteTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getExpenseScreen_ChooseCategoryBtn(dr).getText().trim().equalsIgnoreCase(expResult[5]);
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}
		
	}
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify Repeat Button Functionality
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreen_RepeatButtonFunctionality(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			waitforElementToLoad(2);
			obj.getExpenseScreen_RepeatBtn(dr).click();
			
			waitforElementToLoad(2);
			obj.getMonefyProScreen_Title(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getMonefyProScreen_BuyBtn(dr).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getMonefyProScreen_ProFeaturesTxt(dr).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(0).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(1).getText().trim().equalsIgnoreCase(expResult[5]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(2).getText().trim().equalsIgnoreCase(expResult[6]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(3).getText().trim().equalsIgnoreCase(expResult[7]);
			
			((AndroidDriver<?>)dr).sendKeyEvent(AndroidKeyCode.BACK);waitforElementToLoad(2);
			obj.getExpenseScreen_Title(dr, actResult[0]).getText().trim().equalsIgnoreCase(actResult[0]);
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}
	}
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify Date Picker Functionality
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreen_DatePickerFunctionality(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		
		String[] expResult = expRes.split("\\|");
		
		Date date = commonUtils.getDate(1);
		final String MMDDYYY = new SimpleDateFormat("MM/dd/yyyy").format(date);
		final String MMMDDYYYY = new SimpleDateFormat("MMM dd, yyyy").format(date);
		final String EEEEDDMM = new SimpleDateFormat("EEEE, dd MMM").format(date);
		
		try {
			
			obj.getExpenseScreen_DatePicker(dr).click();waitforElementToLoad(2);
			
			obj.getDatePicker_SelectDateTxt(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getDataPicker_EditIcon(dr).click(); waitforElementToLoad(1);
			
			obj.getDataPicker_CalendarIcon(dr).isDisplayed();
			WebElement element = obj.getDataPicker_DateTxtFld(dr);
			element.clear();
			element.sendKeys(MMDDYYY);
			((AndroidDriver<?>)dr).sendKeyEvent(AndroidKeyCode.ENTER);

			obj.getDatePicker_DateTxt(dr).getText().trim().equalsIgnoreCase(MMMDDYYYY);
			obj.getDataPicker_OkBtn(dr).click();waitforElementToLoad(2);

			obj.getExpenseScreen_DatePicker(dr).getText().trim().equalsIgnoreCase(EEEEDDMM);
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}
	}
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify Change Payment Method
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreen_ChangePaymentMethod(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			
			obj.getExpenseScreen_CurrencyIcon(dr).isDisplayed();
			obj.getExpenseScreen_CurrencyTxt(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getExpenseScreen_CurrencyTxt(dr).click(); waitforElementToLoad(1);
			
			obj.getExpenseScreen_PaymentMethod(dr, actResult[2]).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getExpenseScreen_PaymentMethod(dr, actResult[3]).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getExpenseScreen_CurrencyIcon(dr).isDisplayed();
			obj.getExpenseScreen_CurrencyTxt(dr).isDisplayed();
			
			if(TC.equalsIgnoreCase("TC_01")){
				obj.getExpenseScreen_PaymentMethod(dr, actResult[2]).click(); waitforElementToLoad(2);
			}else{
				obj.getExpenseScreen_PaymentMethod(dr, actResult[3]).click(); waitforElementToLoad(2);
			}
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}	
	}
	
	/**
	 * @author sunil_s
	 * @description Method to verify Amount Input Field Functionality
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreen_AmountInputFieldFunctionality(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			
			commonUtils.enter_amount_using_keypad(dr, actResult[1]);
			commonUtils.enter_amount_using_keypad(dr, actResult[2]);
			commonUtils.enter_amount_using_keypad(dr, actResult[3]);
			commonUtils.enter_amount_using_keypad(dr,actResult[4]);
			waitforElementToLoad(2);
			String actualAmount = obj.getExpenseScreen_AmtTxtFld(dr).getText();
			if(Integer.compare(Integer.parseInt(actualAmount), Integer.parseInt(expResult[1])) !=0){
				System.out.println("TestCase : FAIL Actual Amount : "+ actualAmount  + " Expected Amount : "+ expResult[1]);
				while(!obj.getExpenseScreen_AmtTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[2])){
					obj.getExpenseScreen_KeyboardClearBtn(dr).click();
				}
				return false;
			}
			
			while(!obj.getExpenseScreen_AmtTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[2])){
				obj.getExpenseScreen_KeyboardClearBtn(dr).click();
			}
			waitforElementToLoad(2);
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}	
	}
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify undo added expense
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreen_UndoAddedExpense(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			
			commonUtils.enter_amount_using_keypad(dr, actResult[1]);
			commonUtils.enter_amount_using_keypad(dr, actResult[2]);
			commonUtils.enter_amount_using_keypad(dr, actResult[3]);
			commonUtils.enter_amount_using_keypad(dr,actResult[4]);
			waitforElementToLoad(2);
			
			obj.getExpenseScreen_NoteTxtFld(dr).sendKeys(actResult[5]); waitforElementToLoad(2);
			((AndroidDriver<?>)dr).hideKeyboard();
			obj.getExpenseScreen_NoteTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[2]);
	
			obj.getExpenseScreen_ChooseCategoryBtn(dr).click();
			obj.getExpenseScreen_CategoryBtn(dr, actResult[6]).click();
			
			obj.getHomeScreen_BillsToastMsg(dr).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getHomeScreen_ExpenseAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getHomeScreen_BalanceAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[5]);
			
			obj.getHomeScreen_CancelButton(dr).click();waitforElementToLoad(2);
			obj.getHomeScreen_ExpenseAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[6]);
			obj.getHomeScreen_BalanceAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[7]);
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}	
	}
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify  adding expense
	 * @param TC
	 * @return
	 */
	public boolean ExpenseScreen_AddingExpense(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		Date date = commonUtils.getDate(2);
		final String MMDDYYY = new SimpleDateFormat("MM/dd/yyyy").format(date);
		final String MMMDDYYYY = new SimpleDateFormat("MMM dd, yyyy").format(date);
		final String EEEEDDMM = new SimpleDateFormat("EEEE, dd MMM").format(date);
		
		try {
			
			obj.getHomeScreen_ExpenseBtn(dr).click();waitforElementToLoad(2);
			
			obj.getExpenseScreen_DatePicker(dr).click();waitforElementToLoad(2);
			obj.getDatePicker_SelectDateTxt(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getDataPicker_EditIcon(dr).click(); waitforElementToLoad(1);
			
			obj.getDataPicker_CalendarIcon(dr).isDisplayed();
			WebElement element = obj.getDataPicker_DateTxtFld(dr);
			element.clear();
			element.sendKeys(MMDDYYY);
			((AndroidDriver<?>)dr).sendKeyEvent(AndroidKeyCode.ENTER);

			obj.getDatePicker_DateTxt(dr).getText().trim().equalsIgnoreCase(MMMDDYYYY);
			obj.getDataPicker_OkBtn(dr).click();waitforElementToLoad(2);
			obj.getExpenseScreen_DatePicker(dr).getText().trim().equalsIgnoreCase(EEEEDDMM);
			

			commonUtils.enter_amount_using_keypad(dr, actResult[2]);
			commonUtils.enter_amount_using_keypad(dr, actResult[3]);
			commonUtils.enter_amount_using_keypad(dr, actResult[4]);
			commonUtils.enter_amount_using_keypad(dr,actResult[5]);
			waitforElementToLoad(2);
			
			obj.getExpenseScreen_NoteTxtFld(dr).sendKeys(actResult[6]); waitforElementToLoad(2);
			((AndroidDriver<?>)dr).hideKeyboard();
			obj.getExpenseScreen_NoteTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[3]);
	
			obj.getExpenseScreen_ChooseCategoryBtn(dr).click();
			obj.getExpenseScreen_CategoryBtn(dr, actResult[7]).click(); waitforElementToLoad(2);
			
			obj.getHomeScreen_BillsToastMsg(dr).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getHomeScreen_ExpenseAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[5]);
			obj.getHomeScreen_BalanceAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[6]);
			
			System.out.println("TestCase :  PASS");
			return true;
			
		} catch (TimeoutException te) {
			te.printStackTrace();
			System.out.println("TestCase: FAIL <Timeout Exception> " + te.getMessage());
			return false;
		} catch (NoSuchElementException nse) {
			nse.printStackTrace();
			System.out.println("TestCase: FAIL <NoSuchElement Exception> " + nse.getMessage());
			return false;
		} catch (ConnectionClosedException cce) {
			cce.printStackTrace();
			System.out.println("TestCase: FAIL <ConnectionClosed Exception> " + cce.getMessage());
			return false;
		} catch (Exception ie) {
			ie.printStackTrace();
			System.out.println("TestCase: FAIL <Exception> " + ie.getMessage());
			return false;
		}	
	}

}
