package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OtherChargeMastersItem{

	@SerializedName("OtherChargeID")
	private String otherChargeID;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("Amount")
	private String amount;

	@SerializedName("UsePercentage")
	private String usePercentage;

	@SerializedName("TaxGroup1")
	private String taxGroup1;

	@SerializedName("ChargeName")
	private String chargeName;

	@SerializedName("TaxGroup2")
	private String taxGroup2;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("RefChargeID")
	private String refChargeID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("ChargeTaxable")
	private String chargeTaxable;

	@SerializedName("IPAddress")
	private String iPAddress;

	public void setOtherChargeID(String otherChargeID){
		this.otherChargeID = otherChargeID;
	}

	public String getOtherChargeID(){
		return otherChargeID;
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

	public void setAmount(String amount){
		this.amount = amount;
	}

	public String getAmount(){
		return amount;
	}

	public void setUsePercentage(String usePercentage){
		this.usePercentage = usePercentage;
	}

	public String getUsePercentage(){
		return usePercentage;
	}

	public void setTaxGroup1(String taxGroup1){
		this.taxGroup1 = taxGroup1;
	}

	public String getTaxGroup1(){
		return taxGroup1;
	}

	public void setChargeName(String chargeName){
		this.chargeName = chargeName;
	}

	public String getChargeName(){
		return chargeName;
	}

	public void setTaxGroup2(String taxGroup2){
		this.taxGroup2 = taxGroup2;
	}

	public String getTaxGroup2(){
		return taxGroup2;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setRefChargeID(String refChargeID){
		this.refChargeID = refChargeID;
	}

	public String getRefChargeID(){
		return refChargeID;
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

	public void setChargeTaxable(String chargeTaxable){
		this.chargeTaxable = chargeTaxable;
	}

	public String getChargeTaxable(){
		return chargeTaxable;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	@Override
 	public String toString(){
		return 
			"OtherChargeMastersItem{" + 
			"otherChargeID = '" + otherChargeID + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",amount = '" + amount + '\'' + 
			",usePercentage = '" + usePercentage + '\'' + 
			",taxGroup1 = '" + taxGroup1 + '\'' + 
			",chargeName = '" + chargeName + '\'' + 
			",taxGroup2 = '" + taxGroup2 + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",refChargeID = '" + refChargeID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",chargeTaxable = '" + chargeTaxable + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			"}";
		}
}