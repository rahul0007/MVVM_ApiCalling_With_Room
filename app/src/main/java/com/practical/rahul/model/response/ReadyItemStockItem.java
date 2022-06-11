package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ReadyItemStockItem{

	@SerializedName("ReadyItemStockID")
	private String readyItemStockID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("LowThreshold")
	private String lowThreshold;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("CurrentStock")
	private String currentStock;

	public void setReadyItemStockID(String readyItemStockID){
		this.readyItemStockID = readyItemStockID;
	}

	public String getReadyItemStockID(){
		return readyItemStockID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setLowThreshold(String lowThreshold){
		this.lowThreshold = lowThreshold;
	}

	public String getLowThreshold(){
		return lowThreshold;
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

	public void setCurrentStock(String currentStock){
		this.currentStock = currentStock;
	}

	public String getCurrentStock(){
		return currentStock;
	}

	@Override
 	public String toString(){
		return 
			"ReadyItemStockItem{" + 
			"readyItemStockID = '" + readyItemStockID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",lowThreshold = '" + lowThreshold + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",currentStock = '" + currentStock + '\'' + 
			"}";
		}
}