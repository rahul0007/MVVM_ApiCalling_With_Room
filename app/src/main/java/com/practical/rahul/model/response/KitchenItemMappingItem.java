package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class KitchenItemMappingItem{

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("KIMappingID")
	private String kIMappingID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("KitchenID")
	private String kitchenID;

	@SerializedName("ItemID")
	private String itemID;

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setKIMappingID(String kIMappingID){
		this.kIMappingID = kIMappingID;
	}

	public String getKIMappingID(){
		return kIMappingID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setKitchenID(String kitchenID){
		this.kitchenID = kitchenID;
	}

	public String getKitchenID(){
		return kitchenID;
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
			"KitchenItemMappingItem{" + 
			"companyID = '" + companyID + '\'' + 
			",kIMappingID = '" + kIMappingID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",kitchenID = '" + kitchenID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}