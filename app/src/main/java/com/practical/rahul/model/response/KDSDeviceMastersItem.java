package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class KDSDeviceMastersItem{

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("KDSID")
	private String kDSID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("ExternalPOSID")
	private String externalPOSID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("EPOS_KDS_MID")
	private String ePOSKDSMID;

	public void setIsDeleted(String isDeleted){
		this.isDeleted = isDeleted;
	}

	public String getIsDeleted(){
		return isDeleted;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setKDSID(String kDSID){
		this.kDSID = kDSID;
	}

	public String getKDSID(){
		return kDSID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setExternalPOSID(String externalPOSID){
		this.externalPOSID = externalPOSID;
	}

	public String getExternalPOSID(){
		return externalPOSID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setEPOSKDSMID(String ePOSKDSMID){
		this.ePOSKDSMID = ePOSKDSMID;
	}

	public String getEPOSKDSMID(){
		return ePOSKDSMID;
	}

	@Override
 	public String toString(){
		return 
			"KDSDeviceMastersItem{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",kDSID = '" + kDSID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",externalPOSID = '" + externalPOSID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",ePOS_KDS_MID = '" + ePOSKDSMID + '\'' + 
			"}";
		}
}