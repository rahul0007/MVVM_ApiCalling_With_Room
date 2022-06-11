package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SchedulePromoPricingDetailMastersItem{

	@SerializedName("BasePrice")
	private String basePrice;

	@SerializedName("IsFreezePrice")
	private String isFreezePrice;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("OrderPlaceID")
	private String orderPlaceID;

	@SerializedName("SchedulePromotionId")
	private String schedulePromotionId;

	@SerializedName("NewPrice")
	private String newPrice;

	@SerializedName("IsHideItem")
	private String isHideItem;

	@SerializedName("ColorClass")
	private String colorClass;

	@SerializedName("SchedulePromoOrderPlacePricingDetailID")
	private String schedulePromoOrderPlacePricingDetailID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ItemID")
	private String itemID;

	public void setBasePrice(String basePrice){
		this.basePrice = basePrice;
	}

	public String getBasePrice(){
		return basePrice;
	}

	public void setIsFreezePrice(String isFreezePrice){
		this.isFreezePrice = isFreezePrice;
	}

	public String getIsFreezePrice(){
		return isFreezePrice;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setOrderPlaceID(String orderPlaceID){
		this.orderPlaceID = orderPlaceID;
	}

	public String getOrderPlaceID(){
		return orderPlaceID;
	}

	public void setSchedulePromotionId(String schedulePromotionId){
		this.schedulePromotionId = schedulePromotionId;
	}

	public String getSchedulePromotionId(){
		return schedulePromotionId;
	}

	public void setNewPrice(String newPrice){
		this.newPrice = newPrice;
	}

	public String getNewPrice(){
		return newPrice;
	}

	public void setIsHideItem(String isHideItem){
		this.isHideItem = isHideItem;
	}

	public String getIsHideItem(){
		return isHideItem;
	}

	public void setColorClass(String colorClass){
		this.colorClass = colorClass;
	}

	public String getColorClass(){
		return colorClass;
	}

	public void setSchedulePromoOrderPlacePricingDetailID(String schedulePromoOrderPlacePricingDetailID){
		this.schedulePromoOrderPlacePricingDetailID = schedulePromoOrderPlacePricingDetailID;
	}

	public String getSchedulePromoOrderPlacePricingDetailID(){
		return schedulePromoOrderPlacePricingDetailID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
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
			"SchedulePromoPricingDetailMastersItem{" + 
			"basePrice = '" + basePrice + '\'' + 
			",isFreezePrice = '" + isFreezePrice + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",orderPlaceID = '" + orderPlaceID + '\'' + 
			",schedulePromotionId = '" + schedulePromotionId + '\'' + 
			",newPrice = '" + newPrice + '\'' + 
			",isHideItem = '" + isHideItem + '\'' + 
			",colorClass = '" + colorClass + '\'' + 
			",schedulePromoOrderPlacePricingDetailID = '" + schedulePromoOrderPlacePricingDetailID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}