package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ConcessionaireSectionBranchMappingItem{

	@SerializedName("IsDeleted")
	private String isDeleted;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ConcessionaireID")
	private String concessionaireID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ConSecBranMappID")
	private String conSecBranMappID;

	@SerializedName("KitchenID")
	private String kitchenID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("SectionID")
	private String sectionID;

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

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
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

	public void setConSecBranMappID(String conSecBranMappID){
		this.conSecBranMappID = conSecBranMappID;
	}

	public String getConSecBranMappID(){
		return conSecBranMappID;
	}

	public void setKitchenID(String kitchenID){
		this.kitchenID = kitchenID;
	}

	public String getKitchenID(){
		return kitchenID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
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
			"ConcessionaireSectionBranchMappingItem{" + 
			"isDeleted = '" + isDeleted + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",concessionaireID = '" + concessionaireID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",conSecBranMappID = '" + conSecBranMappID + '\'' + 
			",kitchenID = '" + kitchenID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",sectionID = '" + sectionID + '\'' + 
			"}";
		}
}