package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SchedulePromoPricingMastersItem{

	@SerializedName("StartDate")
	private String startDate;

	@SerializedName("IsByWeek")
	private String isByWeek;

	@SerializedName("IsByDate")
	private String isByDate;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("IsRecurringYearly")
	private String isRecurringYearly;

	@SerializedName("AdjustPricesByValue")
	private String adjustPricesByValue;

	@SerializedName("SchedulePromotionId")
	private String schedulePromotionId;

	@SerializedName("AdjustPricesByID")
	private String adjustPricesByID;

	@SerializedName("AdjustPricesForID")
	private String adjustPricesForID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("EndDate")
	private String endDate;

	@SerializedName("Name")
	private String name;

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setIsByWeek(String isByWeek){
		this.isByWeek = isByWeek;
	}

	public String getIsByWeek(){
		return isByWeek;
	}

	public void setIsByDate(String isByDate){
		this.isByDate = isByDate;
	}

	public String getIsByDate(){
		return isByDate;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setIsRecurringYearly(String isRecurringYearly){
		this.isRecurringYearly = isRecurringYearly;
	}

	public String getIsRecurringYearly(){
		return isRecurringYearly;
	}

	public void setAdjustPricesByValue(String adjustPricesByValue){
		this.adjustPricesByValue = adjustPricesByValue;
	}

	public String getAdjustPricesByValue(){
		return adjustPricesByValue;
	}

	public void setSchedulePromotionId(String schedulePromotionId){
		this.schedulePromotionId = schedulePromotionId;
	}

	public String getSchedulePromotionId(){
		return schedulePromotionId;
	}

	public void setAdjustPricesByID(String adjustPricesByID){
		this.adjustPricesByID = adjustPricesByID;
	}

	public String getAdjustPricesByID(){
		return adjustPricesByID;
	}

	public void setAdjustPricesForID(String adjustPricesForID){
		this.adjustPricesForID = adjustPricesForID;
	}

	public String getAdjustPricesForID(){
		return adjustPricesForID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return endDate;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SchedulePromoPricingMastersItem{" + 
			"startDate = '" + startDate + '\'' + 
			",isByWeek = '" + isByWeek + '\'' + 
			",isByDate = '" + isByDate + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",isRecurringYearly = '" + isRecurringYearly + '\'' + 
			",adjustPricesByValue = '" + adjustPricesByValue + '\'' + 
			",schedulePromotionId = '" + schedulePromotionId + '\'' + 
			",adjustPricesByID = '" + adjustPricesByID + '\'' + 
			",adjustPricesForID = '" + adjustPricesForID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}