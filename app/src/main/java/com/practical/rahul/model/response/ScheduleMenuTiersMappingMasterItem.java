package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ScheduleMenuTiersMappingMasterItem{

	@SerializedName("ScheduleMenuTierMappingId")
	private String scheduleMenuTierMappingId;

	@SerializedName("OrderPlaceId")
	private String orderPlaceId;

	@SerializedName("SchedulePromotionId")
	private String schedulePromotionId;

	public void setScheduleMenuTierMappingId(String scheduleMenuTierMappingId){
		this.scheduleMenuTierMappingId = scheduleMenuTierMappingId;
	}

	public String getScheduleMenuTierMappingId(){
		return scheduleMenuTierMappingId;
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
			"ScheduleMenuTiersMappingMasterItem{" + 
			"scheduleMenuTierMappingId = '" + scheduleMenuTierMappingId + '\'' + 
			",orderPlaceId = '" + orderPlaceId + '\'' + 
			",schedulePromotionId = '" + schedulePromotionId + '\'' + 
			"}";
		}
}