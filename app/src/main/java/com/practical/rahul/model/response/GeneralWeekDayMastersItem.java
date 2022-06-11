package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class GeneralWeekDayMastersItem{

	@SerializedName("EndTime")
	private String endTime;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("GeneralWeekDayID")
	private String generalWeekDayID;

	@SerializedName("StartTime")
	private String startTime;

	@SerializedName("DayID")
	private String dayID;

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

	public void setGeneralWeekDayID(String generalWeekDayID){
		this.generalWeekDayID = generalWeekDayID;
	}

	public String getGeneralWeekDayID(){
		return generalWeekDayID;
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
			"GeneralWeekDayMastersItem{" + 
			"endTime = '" + endTime + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",generalWeekDayID = '" + generalWeekDayID + '\'' + 
			",startTime = '" + startTime + '\'' + 
			",dayID = '" + dayID + '\'' + 
			"}";
		}
}