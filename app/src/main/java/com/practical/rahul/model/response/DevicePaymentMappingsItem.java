package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class DevicePaymentMappingsItem{

	@SerializedName("DPMappingID")
	private String dPMappingID;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("StaffModuleID")
	private String staffModuleID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("PaymentTypeID")
	private String paymentTypeID;

	public void setDPMappingID(String dPMappingID){
		this.dPMappingID = dPMappingID;
	}

	public String getDPMappingID(){
		return dPMappingID;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setStaffModuleID(String staffModuleID){
		this.staffModuleID = staffModuleID;
	}

	public String getStaffModuleID(){
		return staffModuleID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setPaymentTypeID(String paymentTypeID){
		this.paymentTypeID = paymentTypeID;
	}

	public String getPaymentTypeID(){
		return paymentTypeID;
	}

	@Override
 	public String toString(){
		return 
			"DevicePaymentMappingsItem{" + 
			"dPMappingID = '" + dPMappingID + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",staffModuleID = '" + staffModuleID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",paymentTypeID = '" + paymentTypeID + '\'' + 
			"}";
		}
}