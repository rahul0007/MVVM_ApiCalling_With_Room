package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OtherChargesSubFeatureMappingsItem{

	@SerializedName("OCSFMappingID")
	private String oCSFMappingID;

	@SerializedName("OtherChargeID")
	private String otherChargeID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("SubFeatureID")
	private String subFeatureID;

	public void setOCSFMappingID(String oCSFMappingID){
		this.oCSFMappingID = oCSFMappingID;
	}

	public String getOCSFMappingID(){
		return oCSFMappingID;
	}

	public void setOtherChargeID(String otherChargeID){
		this.otherChargeID = otherChargeID;
	}

	public String getOtherChargeID(){
		return otherChargeID;
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

	public void setSubFeatureID(String subFeatureID){
		this.subFeatureID = subFeatureID;
	}

	public String getSubFeatureID(){
		return subFeatureID;
	}

	@Override
 	public String toString(){
		return 
			"OtherChargesSubFeatureMappingsItem{" + 
			"oCSFMappingID = '" + oCSFMappingID + '\'' + 
			",otherChargeID = '" + otherChargeID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",subFeatureID = '" + subFeatureID + '\'' + 
			"}";
		}
}