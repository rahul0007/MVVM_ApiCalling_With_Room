package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DateFormatMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("DateFormat")
	private String dateFormat;

	@SerializedName("DateFormatID")
	private String dateFormatID;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setDateFormat(String dateFormat){
		this.dateFormat = dateFormat;
	}

	public String getDateFormat(){
		return dateFormat;
	}

	public void setDateFormatID(String dateFormatID){
		this.dateFormatID = dateFormatID;
	}

	public String getDateFormatID(){
		return dateFormatID;
	}

	@Override
 	public String toString(){
		return 
			"DateFormatMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",dateFormat = '" + dateFormat + '\'' + 
			",dateFormatID = '" + dateFormatID + '\'' + 
			"}";
		}
}