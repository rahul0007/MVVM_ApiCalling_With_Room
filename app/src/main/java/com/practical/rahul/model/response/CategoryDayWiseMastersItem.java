package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CategoryDayWiseMastersItem{

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("EndTime")
	private String endTime;

	@SerializedName("CategoryWeekDayID")
	private String categoryWeekDayID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("StartTime")
	private String startTime;

	@SerializedName("DayID")
	private String dayID;

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return endTime;
	}

	public void setCategoryWeekDayID(String categoryWeekDayID){
		this.categoryWeekDayID = categoryWeekDayID;
	}

	public String getCategoryWeekDayID(){
		return categoryWeekDayID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setDayID(String dayID){
		this.dayID = dayID;
	}

	public String getDayID(){
		return dayID;
	}

	@Override
 	public String toString(){
		return 
			"CategoryDayWiseMastersItem{" + 
			"categoryID = '" + categoryID + '\'' + 
			",endTime = '" + endTime + '\'' + 
			",categoryWeekDayID = '" + categoryWeekDayID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",dayID = '" + dayID + '\'' + 
			"}";
		}
}