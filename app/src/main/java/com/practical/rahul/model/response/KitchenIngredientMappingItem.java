package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class KitchenIngredientMappingItem{

	@SerializedName("IngredientID")
	private String ingredientID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("KIGMappingID")
	private String kIGMappingID;

	@SerializedName("KitchenID")
	private String kitchenID;

	public void setIngredientID(String ingredientID){
		this.ingredientID = ingredientID;
	}

	public String getIngredientID(){
		return ingredientID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setKIGMappingID(String kIGMappingID){
		this.kIGMappingID = kIGMappingID;
	}

	public String getKIGMappingID(){
		return kIGMappingID;
	}

	public void setKitchenID(String kitchenID){
		this.kitchenID = kitchenID;
	}

	public String getKitchenID(){
		return kitchenID;
	}

	@Override
 	public String toString(){
		return 
			"KitchenIngredientMappingItem{" + 
			"ingredientID = '" + ingredientID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",kIGMappingID = '" + kIGMappingID + '\'' + 
			",kitchenID = '" + kitchenID + '\'' + 
			"}";
		}
}