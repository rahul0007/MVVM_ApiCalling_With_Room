package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ThirdPartyPaymentCompanyMappingsItem{

	@SerializedName("ThirdPartyPaymentID")
	private String thirdPartyPaymentID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("PaymentDisplayName")
	private String paymentDisplayName;

	@SerializedName("TPPCMappingID")
	private String tPPCMappingID;

	public void setThirdPartyPaymentID(String thirdPartyPaymentID){
		this.thirdPartyPaymentID = thirdPartyPaymentID;
	}

	public String getThirdPartyPaymentID(){
		return thirdPartyPaymentID;
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

	public void setTPPCMappingID(String tPPCMappingID){
		this.tPPCMappingID = tPPCMappingID;
	}

	public String getTPPCMappingID(){
		return tPPCMappingID;
	}

	@Override
 	public String toString(){
		return 
			"ThirdPartyPaymentCompanyMappingsItem{" + 
			"thirdPartyPaymentID = '" + thirdPartyPaymentID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",paymentDisplayName = '" + paymentDisplayName + '\'' + 
			",tPPCMappingID = '" + tPPCMappingID + '\'' + 
			"}";
		}
}