package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DiscountItemMappingsItem{

	@SerializedName("DIID")
	private String dIID;

	@SerializedName("PurchaseOrGet")
	private String purchaseOrGet;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("DiscountID")
	private String discountID;

	@SerializedName("GroupCategoryID")
	private String groupCategoryID;

	public void setDIID(String dIID){
		this.dIID = dIID;
	}

	public String getDIID(){
		return dIID;
	}

	public void setPurchaseOrGet(String purchaseOrGet){
		this.purchaseOrGet = purchaseOrGet;
	}

	public String getPurchaseOrGet(){
		return purchaseOrGet;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	public void setDiscountID(String discountID){
		this.discountID = discountID;
	}

	public String getDiscountID(){
		return discountID;
	}

	public void setGroupCategoryID(String groupCategoryID){
		this.groupCategoryID = groupCategoryID;
	}

	public String getGroupCategoryID(){
		return groupCategoryID;
	}

	@Override
 	public String toString(){
		return 
			"DiscountItemMappingsItem{" + 
			"dIID = '" + dIID + '\'' + 
			",purchaseOrGet = '" + purchaseOrGet + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",discountID = '" + discountID + '\'' + 
			",groupCategoryID = '" + groupCategoryID + '\'' + 
			"}";
		}
}