package com.monefy.app.lite.pages;

import java.text.SimpleDateFormat;
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

public class IncomePage extends BasePage {
	
	String platFormName = DriverSetup.getPlatform();
	
	
	/**
	 * @author sunil_s
	 * @description Method to verify income screen validations
	 * @param TC
	 * @return
	 */
	public boolean IncomeScreenValidations(String TC, WebDriver dr, BaseObjRepo obj, String actRes, String expRes) {

		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");

		try {
			waitforElementToLoad(2);
			obj.getHomeScreen_IncomeBtn(dr).click();

			waitforElementToLoad(3);
			obj.getIncomeScreen_AlertToastMsg(dr, actResult[0]).getText().trim().equalsIgnoreCase(expResult[0]);
			obj.getIncomeScreen_AlertToastMsg(dr, actResult[0]).click();
			obj.getIncomeScreen_NavigateUpBtn(dr).isDisplayed();
			obj.getIncomeScreen_Title(dr, actResult[1]).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getIncomeScreen_RepeatBtn(dr).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getIncomeScreen_DatePicker(dr).isDisplayed();
			obj.getIncomeScreen_CurrencyIcon(dr).isDisplayed();
			obj.getIncomeScreen_CurrencyTxt(dr).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getIncomeScreen_AmtTxtFld(dr).isDisplayed();
			obj.getIncomeScreen_KeyboardClearBtn(dr).isDisplayed();
			obj.getIncomeScreen_NoteTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getIncomeScreen_ChooseCategoryBtn(dr).getText().trim().equalsIgnoreCase(expResult[5]);

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
	public boolean IncomeScreen_RepeatButtonFunctionality(String TC, WebDriver dr, BaseObjRepo obj, String actRes,
			String expRes) {

		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");

		try {
			waitforElementToLoad(2);
			obj.getIncomeScreen_RepeatBtn(dr).click();

			waitforElementToLoad(2);
			obj.getMonefyProScreen_Title(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getMonefyProScreen_BuyBtn(dr).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getMonefyProScreen_ProFeaturesTxt(dr).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(0).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(1).getText().trim().equalsIgnoreCase(expResult[5]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(2).getText().trim().equalsIgnoreCase(expResult[6]);
			obj.getMonefyProScreen_ProFeatureList(dr).get(3).getText().trim().equalsIgnoreCase(expResult[7]);

			((AndroidDriver<?>) dr).sendKeyEvent(AndroidKeyCode.BACK);
			waitforElementToLoad(2);
			obj.getIncomeScreen_Title(dr, actResult[0]).getText().trim().equalsIgnoreCase(actResult[0]);

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
	public boolean IncomeScreen_DatePickerFunctionality(String TC, WebDriver dr, BaseObjRepo obj, String actRes,
			String expRes) {

		String[] expResult = expRes.split("\\|");

		Date date = commonUtils.getDate(1);
		final String MMDDYYY = new SimpleDateFormat("MM/dd/yyyy").format(date);
		final String MMMDDYYYY = new SimpleDateFormat("MMM dd, yyyy").format(date);
		final String EEEEDDMM = new SimpleDateFormat("EEEE, dd MMM").format(date);

		try {

			obj.getIncomeScreen_DatePicker(dr).click();
			waitforElementToLoad(2);

			obj.getDatePicker_SelectDateTxt(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getDataPicker_EditIcon(dr).click();
			waitforElementToLoad(1);

			obj.getDataPicker_CalendarIcon(dr).isDisplayed();
			WebElement element = obj.getDataPicker_DateTxtFld(dr);
			element.clear();
			element.sendKeys(MMDDYYY);
			((AndroidDriver<?>) dr).sendKeyEvent(AndroidKeyCode.ENTER);

			obj.getDatePicker_DateTxt(dr).getText().trim().equalsIgnoreCase(MMMDDYYYY);
			obj.getDataPicker_OkBtn(dr).click();
			waitforElementToLoad(2);

			obj.getIncomeScreen_DatePicker(dr).getText().trim().equalsIgnoreCase(EEEEDDMM);

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
	public boolean IncomeScreen_ChangePaymentMethod(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			
			obj.getIncomeScreen_CurrencyIcon(dr).isDisplayed();
			obj.getIncomeScreen_CurrencyTxt(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getIncomeScreen_CurrencyTxt(dr).click(); waitforElementToLoad(1);
			
			obj.getIncomeScreen_PaymentMethod(dr, actResult[2]).getText().trim().equalsIgnoreCase(expResult[2]);
			obj.getIncomeScreen_PaymentMethod(dr, actResult[3]).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getIncomeScreen_CurrencyIcon(dr).isDisplayed();
			obj.getIncomeScreen_CurrencyTxt(dr).isDisplayed();
			
			if(TC.equalsIgnoreCase("TC_01")){
				obj.getIncomeScreen_PaymentMethod(dr, actResult[2]).click(); waitforElementToLoad(2);
			}else{
				obj.getIncomeScreen_PaymentMethod(dr, actResult[3]).click(); waitforElementToLoad(2);
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
	public boolean IncomeScreen_AmountInputFieldFunctionality(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			
			commonUtils.enter_amount_using_keypad(dr, actResult[1]);
			commonUtils.enter_amount_using_keypad(dr, actResult[2]);
			commonUtils.enter_amount_using_keypad(dr, actResult[3]);
			commonUtils.enter_amount_using_keypad(dr,actResult[4]);
			waitforElementToLoad(2);
			String actualAmount = obj.getIncomeScreen_AmtTxtFld(dr).getText();
			if(Integer.compare(Integer.parseInt(actualAmount), Integer.parseInt(expResult[1])) !=0){
				System.out.println("TestCase : FAIL Actual Amount : "+ actualAmount  + " Expected Amount : "+ expResult[1]);
				while(!obj.getIncomeScreen_AmtTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[2])){
					obj.getIncomeScreen_KeyboardClearBtn(dr).click();
				}
				return false;
			}
			
			while(!obj.getIncomeScreen_AmtTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[2])){
				obj.getIncomeScreen_KeyboardClearBtn(dr).click();
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
	 * @description Method to verify undo added income
	 * @param TC
	 * @return
	 */
	public boolean IncomeScreen_UndoAddedIncome(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		try {
			
			commonUtils.enter_amount_using_keypad(dr, actResult[1]);
			commonUtils.enter_amount_using_keypad(dr, actResult[2]);
			commonUtils.enter_amount_using_keypad(dr, actResult[3]);
			commonUtils.enter_amount_using_keypad(dr,actResult[4]);
			waitforElementToLoad(2);
			
			obj.getIncomeScreen_NoteTxtFld(dr).sendKeys(actResult[5]); waitforElementToLoad(2);
			((AndroidDriver<?>)dr).hideKeyboard();
			obj.getIncomeScreen_NoteTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[2]);
	
			obj.getIncomeScreen_ChooseCategoryBtn(dr).click();
			obj.getIncomeScreen_CategoryBtn(dr, actResult[6]).click();
			
			obj.getHomeScreen_BillsToastMsg(dr).getText().trim().equalsIgnoreCase(expResult[3]);
			obj.getHomeScreen_IncomeAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getHomeScreen_BalanceAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[5]);
			
			obj.getHomeScreen_CancelButton(dr).click();waitforElementToLoad(2);
			obj.getHomeScreen_IncomeAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[6]);
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
	 * @description Method to verify  adding income
	 * @param TC
	 * @return
	 */
	public boolean IncomeScreen_AddingIncome(String TC,WebDriver dr, BaseObjRepo obj,String actRes, String expRes){
		
		String[] actResult = actRes.split("\\|");
		String[] expResult = expRes.split("\\|");
		
		Date date = commonUtils.getDate(1);
		final String MMDDYYY = new SimpleDateFormat("MM/dd/yyyy").format(date);
		final String MMMDDYYYY = new SimpleDateFormat("MMM dd, yyyy").format(date);
		final String EEEEDDMM = new SimpleDateFormat("EEEE, dd MMM").format(date);
		
		try {
			
			obj.getHomeScreen_IncomeBtn(dr).click();waitforElementToLoad(2);
			
			obj.getIncomeScreen_DatePicker(dr).click();waitforElementToLoad(2);
			try{
				obj.getIncomeScreen_DatePicker(dr).click();
			}catch (Exception e) {
				// TODO: handle exception
			}
			obj.getDatePicker_SelectDateTxt(dr).getText().trim().equalsIgnoreCase(expResult[1]);
			obj.getDataPicker_EditIcon(dr).click(); waitforElementToLoad(1);
			
			obj.getDataPicker_CalendarIcon(dr).isDisplayed();
			WebElement element = obj.getDataPicker_DateTxtFld(dr);
			element.clear();
			element.sendKeys(MMDDYYY);
			((AndroidDriver<?>)dr).sendKeyEvent(AndroidKeyCode.ENTER);

			obj.getDatePicker_DateTxt(dr).getText().trim().equalsIgnoreCase(MMMDDYYYY);
			obj.getDataPicker_OkBtn(dr).click();waitforElementToLoad(2);
			obj.getIncomeScreen_DatePicker(dr).getText().trim().equalsIgnoreCase(EEEEDDMM);
			

			commonUtils.enter_amount_using_keypad(dr, actResult[2]);
			commonUtils.enter_amount_using_keypad(dr, actResult[3]);
			commonUtils.enter_amount_using_keypad(dr, actResult[4]);
			commonUtils.enter_amount_using_keypad(dr,actResult[5]);
			waitforElementToLoad(2);
			
			obj.getIncomeScreen_NoteTxtFld(dr).sendKeys(actResult[6]); waitforElementToLoad(2);
			((AndroidDriver<?>)dr).hideKeyboard();
			obj.getIncomeScreen_NoteTxtFld(dr).getText().trim().equalsIgnoreCase(expResult[3]);
	
			obj.getIncomeScreen_ChooseCategoryBtn(dr).click();
			obj.getIncomeScreen_CategoryBtn(dr, actResult[7]).click(); waitforElementToLoad(2);
			
			obj.getHomeScreen_BillsToastMsg(dr).getText().trim().equalsIgnoreCase(expResult[4]);
			obj.getHomeScreen_IncomeAmtTxt(dr).getText().trim().equalsIgnoreCase(expResult[5]);
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
