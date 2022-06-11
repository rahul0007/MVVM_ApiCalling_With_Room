package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CurrencyMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("CurrencyID")
	private String currencyID;

	@SerializedName("CurrencyShortForm")
	private String currencyShortForm;

	@SerializedName("CurrencySymbol")
	private String currencySymbol;

	@SerializedName("CurrencyName")
	private String currencyName;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setCurrencyID(String currencyID){
		this.currencyID = currencyID;
	}

	public String getCurrencyID(){
		return currencyID;
	}

	public void setCurrencyShortForm(String currencyShortForm){
		this.currencyShortForm = currencyShortForm;
	}

	public String getCurrencyShortForm(){
		return currencyShortForm;
	}

	public void setCurrencySymbol(String currencySymbol){
		this.currencySymbol = currencySymbol;
	}

	public String getCurrencySymbol(){
		return currencySymbol;
	}

	public void setCurrencyName(String currencyName){
		this.currencyName = currencyName;
	}

	public String getCurrencyName(){
		return currencyName;
	}

	@Override
 	public String toString(){
		return 
			"CurrencyMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",currencyID = '" + currencyID + '\'' + 
			",currencyShortForm = '" + currencyShortForm + '\'' + 
			",currencySymbol = '" + currencySymbol + '\'' + 
			",currencyName = '" + currencyName + '\'' + 
			"}";
		}
}