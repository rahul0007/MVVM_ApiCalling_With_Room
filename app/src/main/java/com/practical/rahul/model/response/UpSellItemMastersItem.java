package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class UpSellItemMastersItem{

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("AllowQuantitySelection")
	private String allowQuantitySelection;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("UpSellItemID")
	private String upSellItemID;

	@SerializedName("ExtraPrice")
	private String extraPrice;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("CustomMessage")
	private String customMessage;

	@SerializedName("ItemAttributeOptionID")
	private String itemAttributeOptionID;

	@SerializedName("UpSellItemMasterID")
	private String upSellItemMasterID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("ItemID")
	private String itemID;

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

	public void setAllowQuantitySelection(String allowQuantitySelection){
		this.allowQuantitySelection = allowQuantitySelection;
	}

	public String getAllowQuantitySelection(){
		return allowQuantitySelection;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setUpSellItemID(String upSellItemID){
		this.upSellItemID = upSellItemID;
	}

	public String getUpSellItemID(){
		return upSellItemID;
	}

	public void setExtraPrice(String extraPrice){
		this.extraPrice = extraPrice;
	}

	public String getExtraPrice(){
		return extraPrice;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setCustomMessage(String customMessage){
		this.customMessage = customMessage;
	}

	public String getCustomMessage(){
		return customMessage;
	}

	public void setItemAttributeOptionID(String itemAttributeOptionID){
		this.itemAttributeOptionID = itemAttributeOptionID;
	}

	public String getItemAttributeOptionID(){
		return itemAttributeOptionID;
	}

	public void setUpSellItemMasterID(String upSellItemMasterID){
		this.upSellItemMasterID = upSellItemMasterID;
	}

	public String getUpSellItemMasterID(){
		return upSellItemMasterID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
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
			"UpSellItemMastersItem{" + 
			"categoryID = '" + categoryID + '\'' + 
			",allowQuantitySelection = '" + allowQuantitySelection + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",upSellItemID = '" + upSellItemID + '\'' + 
			",extraPrice = '" + extraPrice + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",customMessage = '" + customMessage + '\'' + 
			",itemAttributeOptionID = '" + itemAttributeOptionID + '\'' + 
			",upSellItemMasterID = '" + upSellItemMasterID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}