package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyCardNetworkBranchMappingsItem{

	@SerializedName("ThirdPartyPaymentID")
	private String thirdPartyPaymentID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("TenderID")
	private String tenderID;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("TPCNMappingID")
	private String tPCNMappingID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("MappedSource")
	private String mappedSource;

	@SerializedName("CardNetworkID")
	private String cardNetworkID;

	public void setThirdPartyPaymentID(String thirdPartyPaymentID){
		this.thirdPartyPaymentID = thirdPartyPaymentID;
	}

	public String getThirdPartyPaymentID(){
		return thirdPartyPaymentID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setTenderID(String tenderID){
		this.tenderID = tenderID;
	}

	public String getTenderID(){
		return tenderID;
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

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setTPCNMappingID(String tPCNMappingID){
		this.tPCNMappingID = tPCNMappingID;
	}

	public String getTPCNMappingID(){
		return tPCNMappingID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setMappedSource(String mappedSource){
		this.mappedSource = mappedSource;
	}

	public String getMappedSource(){
		return mappedSource;
	}

	public void setCardNetworkID(String cardNetworkID){
		this.cardNetworkID = cardNetworkID;
	}

	public String getCardNetworkID(){
		return cardNetworkID;
	}

	@Override
 	public String toString(){
		return 
			"ThirdPartyCardNetworkBranchMappingsItem{" + 
			"thirdPartyPaymentID = '" + thirdPartyPaymentID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",tenderID = '" + tenderID + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",tPCNMappingID = '" + tPCNMappingID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",mappedSource = '" + mappedSource + '\'' + 
			",cardNetworkID = '" + cardNetworkID + '\'' + 
			"}";
		}
}