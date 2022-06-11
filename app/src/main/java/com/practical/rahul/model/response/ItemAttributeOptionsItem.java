package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ItemAttributeOptionsItem{

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ShowOnDMB")
	private String showOnDMB;

	@SerializedName("ImageUrl")
	private String imageUrl;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("OptionName")
	private String optionName;

	@SerializedName("Calories")
	private String calories;

	@SerializedName("ExtPriceSeq")
	private String extPriceSeq;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("ItemAttributeID")
	private String itemAttributeID;

	@SerializedName("Price")
	private String price;

	@SerializedName("IsVariation86")
	private String isVariation86;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("DisplayName")
	private String displayName;

	@SerializedName("ItemAttributeOptionID")
	private String itemAttributeOptionID;

	@SerializedName("RefItemAttributeOptionID")
	private Object refItemAttributeOptionID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("SKU")
	private String sKU;

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setUpdatedDate(String updatedDate){
		this.updatedDate = updatedDate;
	}

	public String getUpdatedDate(){
		return updatedDate;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setShowOnDMB(String showOnDMB){
		this.showOnDMB = showOnDMB;
	}

	public String getShowOnDMB(){
		return showOnDMB;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	public void setOptionName(String optionName){
		this.optionName = optionName;
	}

	public String getOptionName(){
		return optionName;
	}

	public void setCalories(String calories){
		this.calories = calories;
	}

	public String getCalories(){
		return calories;
	}

	public void setExtPriceSeq(String extPriceSeq){
		this.extPriceSeq = extPriceSeq;
	}

	public String getExtPriceSeq(){
		return extPriceSeq;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setItemAttributeID(String itemAttributeID){
		this.itemAttributeID = itemAttributeID;
	}

	public String getItemAttributeID(){
		return itemAttributeID;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setIsVariation86(String isVariation86){
		this.isVariation86 = isVariation86;
	}

	public String getIsVariation86(){
		return isVariation86;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setItemAttributeOptionID(String itemAttributeOptionID){
		this.itemAttributeOptionID = itemAttributeOptionID;
	}

	public String getItemAttributeOptionID(){
		return itemAttributeOptionID;
	}

	public void setRefItemAttributeOptionID(Object refItemAttributeOptionID){
		this.refItemAttributeOptionID = refItemAttributeOptionID;
	}

	public Object getRefItemAttributeOptionID(){
		return refItemAttributeOptionID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setSKU(String sKU){
		this.sKU = sKU;
	}

	public String getSKU(){
		return sKU;
	}

	@Override
 	public String toString(){
		return 
			"ItemAttributeOptionsItem{" + 
			"createdBy = '" + createdBy + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",showOnDMB = '" + showOnDMB + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",optionName = '" + optionName + '\'' + 
			",calories = '" + calories + '\'' + 
			",extPriceSeq = '" + extPriceSeq + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",itemAttributeID = '" + itemAttributeID + '\'' + 
			",price = '" + price + '\'' + 
			",isVariation86 = '" + isVariation86 + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",displayName = '" + displayName + '\'' + 
			",itemAttributeOptionID = '" + itemAttributeOptionID + '\'' + 
			",refItemAttributeOptionID = '" + refItemAttributeOptionID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",sKU = '" + sKU + '\'' + 
			"}";
		}
}