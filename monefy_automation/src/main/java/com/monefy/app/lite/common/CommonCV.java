/**
 * @author sunil_s
 * @created on 06/26/2021
 * @description Class containing common validations 
 */
package com.monefy.app.lite.common;

import java.time.LocalDate;

public class CommonCV {
	
	// Validations on Home Menu
	public static String hamburger_menu = "Open navigation";
	public static String title = "Monefy";
	public static String income = "INCOME";
	public static String expense = "EXPENSE";
	public static String transfer = "Transfer";
	public static String settings = "Settings";
	public static String search = "Search records";
	
	
	static String getMonth = LocalDate.now().getMonth().toString();
	public static String month = getMonth.charAt(0) + getMonth.substring(1 ).toLowerCase();
	
	//Validations on Expense Menu
	public static String newExpense = "New expense";
	public static String repeat = "Repeat";
	public static String chooseCategory = "CHOOSE CATEGORY";
	public static String note = "Note";
	public static String usd = "USD";
	
	
}
