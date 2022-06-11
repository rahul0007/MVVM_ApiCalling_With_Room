package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class POSRolePermissionMastersItem{

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("POSPermissionID")
	private String pOSPermissionID;

	@SerializedName("IsSelected")
	private String isSelected;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("RoleID")
	private String roleID;

	@SerializedName("POSRolePermissionID")
	private String pOSRolePermissionID;

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
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

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setPOSPermissionID(String pOSPermissionID){
		this.pOSPermissionID = pOSPermissionID;
	}

	public String getPOSPermissionID(){
		return pOSPermissionID;
	}

	public void setIsSelected(String isSelected){
		this.isSelected = isSelected;
	}

	public String getIsSelected(){
		return isSelected;
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

	public void setRoleID(String roleID){
		this.roleID = roleID;
	}

	public String getRoleID(){
		return roleID;
	}

	public void setPOSRolePermissionID(String pOSRolePermissionID){
		this.pOSRolePermissionID = pOSRolePermissionID;
	}

	public String getPOSRolePermissionID(){
		return pOSRolePermissionID;
	}

	@Override
 	public String toString(){
		return 
			"POSRolePermissionMastersItem{" + 
			"updatedBy = '" + updatedBy + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",pOSPermissionID = '" + pOSPermissionID + '\'' + 
			",isSelected = '" + isSelected + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",roleID = '" + roleID + '\'' + 
			",pOSRolePermissionID = '" + pOSRolePermissionID + '\'' + 
			"}";
		}
}