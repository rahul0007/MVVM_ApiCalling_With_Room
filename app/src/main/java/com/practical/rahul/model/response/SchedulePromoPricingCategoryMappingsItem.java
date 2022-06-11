package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SchedulePromoPricingCategoryMappingsItem{

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("SOTCMappingId")
	private String sOTCMappingId;

	@SerializedName("OrderPlaceId")
	private String orderPlaceId;

	@SerializedName("SchedulePromotionId")
	private String schedulePromotionId;

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

	public void setSOTCMappingId(String sOTCMappingId){
		this.sOTCMappingId = sOTCMappingId;
	}

	public String getSOTCMappingId(){
		return sOTCMappingId;
	}

	public void setOrderPlaceId(String orderPlaceId){
		this.orderPlaceId = orderPlaceId;
	}

	public String getOrderPlaceId(){
		return orderPlaceId;
	}

	public void setSchedulePromotionId(String schedulePromotionId){
		this.schedulePromotionId = schedulePromotionId;
	}

	public String getSchedulePromotionId(){
		return schedulePromotionId;
	}

	@Override
 	public String toString(){
		return 
			"SchedulePromoPricingCategoryMappingsItem{" + 
			"categoryID = '" + categoryID + '\'' + 
			",sOTCMappingId = '" + sOTCMappingId + '\'' + 
			",orderPlaceId = '" + orderPlaceId + '\'' + 
			",schedulePromotionId = '" + schedulePromotionId + '\'' + 
			"}";
		}
}