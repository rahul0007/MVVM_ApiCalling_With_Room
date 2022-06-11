package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class WeekdayMastersItem{

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("DayID")
	private String dayID;

	@SerializedName("DayName")
	private String dayName;

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setDayID(String dayID){
		this.dayID = dayID;
	}

	public String getDayID(){
		return dayID;
	}

	public void setDayName(String dayName){
		this.dayName = dayName;
	}

	public String getDayName(){
		return dayName;
	}

	@Override
 	public String toString(){
		return 
			"WeekdayMastersItem{" + 
			"displayOrder = '" + displayOrder + '\'' + 
			",dayID = '" + dayID + '\'' + 
			",dayName = '" + dayName + '\'' + 
			"}";
		}
}