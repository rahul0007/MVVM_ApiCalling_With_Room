package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemDayWiseMastersItem{

	@SerializedName("FullDay")
	private String fullDay;

	@SerializedName("EndTime")
	private String endTime;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("PriceOverride")
	private String priceOverride;

	@SerializedName("StartTime")
	private String startTime;

	@SerializedName("ItemWeekDayID")
	private String itemWeekDayID;

	@SerializedName("DayID")
	private String dayID;

	@SerializedName("ItemID")
	private String itemID;

	public void setFullDay(String fullDay){
		this.fullDay = fullDay;
	}

	public String getFullDay(){
		return fullDay;
	}

	public void setEndTime(String endTime){
		this.endTime = endTime;
	}

	public String getEndTime(){
		return endTime;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setPriceOverride(String priceOverride){
		this.priceOverride = priceOverride;
	}

	public String getPriceOverride(){
		return priceOverride;
	}

	public void setStartTime(String startTime){
		this.startTime = startTime;
	}

	public String getStartTime(){
		return startTime;
	}

	public void setItemWeekDayID(String itemWeekDayID){
		this.itemWeekDayID = itemWeekDayID;
	}

	public String getItemWeekDayID(){
		return itemWeekDayID;
	}

	public void setDayID(String dayID){
		this.dayID = dayID;
	}

	public String getDayID(){
		return dayID;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	@Override
 	public String toString(){
		return 
			"ItemDayWiseMastersItem{" + 
			"fullDay = '" + fullDay + '\'' + 
			",endTime = '" + endTime + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",priceOverride = '" + priceOverride + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",itemWeekDayID = '" + itemWeekDayID + '\'' + 
			",dayID = '" + dayID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}