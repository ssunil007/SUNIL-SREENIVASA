package com.monefy.app.lite.pages;

import com.monefy.app.lite.utils.CommonUtils;

public class BasePage {

	
	protected final CommonUtils commonUtils;
	
	public BasePage(){
		commonUtils = new CommonUtils();
	}
	
	/**
	 * @author sunil_s
	 * @description Method to wait for element to load
	 * @param second
	 */
	public void waitforElementToLoad(int second) {
		try {
			Thread.sleep(second * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
