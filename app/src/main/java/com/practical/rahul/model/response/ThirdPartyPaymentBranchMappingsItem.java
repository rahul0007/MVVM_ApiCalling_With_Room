package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyPaymentBranchMappingsItem{

	@SerializedName("ThirdPartyPaymentID")
	private String thirdPartyPaymentID;

	@SerializedName("TenderId")
	private String tenderId;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("PaymentDisplayName")
	private String paymentDisplayName;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("TPPBMappingID")
	private String tPPBMappingID;

	public void setThirdPartyPaymentID(String thirdPartyPaymentID){
		this.thirdPartyPaymentID = thirdPartyPaymentID;
	}

	public String getThirdPartyPaymentID(){
		return thirdPartyPaymentID;
	}

	public void setTenderId(String tenderId){
		this.tenderId = tenderId;
	}

	public String getTenderId(){
		return tenderId;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setPaymentDisplayName(String paymentDisplayName){
		this.paymentDisplayName = paymentDisplayName;
	}

	public String getPaymentDisplayName(){
		return paymentDisplayName;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setTPPBMappingID(String tPPBMappingID){
		this.tPPBMappingID = tPPBMappingID;
	}

	public String getTPPBMappingID(){
		return tPPBMappingID;
	}

	@Override
 	public String toString(){
		return 
			"ThirdPartyPaymentBranchMappingsItem{" + 
			"thirdPartyPaymentID = '" + thirdPartyPaymentID + '\'' + 
			",tenderId = '" + tenderId + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",paymentDisplayName = '" + paymentDisplayName + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",tPPBMappingID = '" + tPPBMappingID + '\'' + 
			"}";
		}
}