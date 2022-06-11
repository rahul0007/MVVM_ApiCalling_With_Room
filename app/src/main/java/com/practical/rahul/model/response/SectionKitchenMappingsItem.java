package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class SectionKitchenMappingsItem{

	@SerializedName("SKMID")
	private String sKMID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("KitchenID")
	private String kitchenID;

	@SerializedName("SectionID")
	private String sectionID;

	public void setSKMID(String sKMID){
		this.sKMID = sKMID;
	}

	public String getSKMID(){
		return sKMID;
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

	public void setKitchenID(String kitchenID){
		this.kitchenID = kitchenID;
	}

	public String getKitchenID(){
		return kitchenID;
	}

	public void setSectionID(String sectionID){
		this.sectionID = sectionID;
	}

	public String getSectionID(){
		return sectionID;
	}

	@Override
 	public String toString(){
		return 
			"SectionKitchenMappingsItem{" + 
			"sKMID = '" + sKMID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",kitchenID = '" + kitchenID + '\'' + 
			",sectionID = '" + sectionID + '\'' + 
			"}";
		}
}