package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ConcessionaireItemMappingsItem{

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("CIM")
	private String cIM;

	@SerializedName("ConcessionaireID")
	private String concessionaireID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ItemID")
	private String itemID;

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setCIM(String cIM){
		this.cIM = cIM;
	}

	public String getCIM(){
		return cIM;
	}

	public void setConcessionaireID(String concessionaireID){
		this.concessionaireID = concessionaireID;
	}

	public String getConcessionaireID(){
		return concessionaireID;
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
			"ConcessionaireItemMappingsItem{" + 
			"categoryID = '" + categoryID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",cIM = '" + cIM + '\'' + 
			",concessionaireID = '" + concessionaireID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			"}";
		}
}