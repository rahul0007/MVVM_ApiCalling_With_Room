package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ComboGroupItemMastersItem{

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("CategoryID")
	private String categoryID;

	@SerializedName("RefComboGroupItemID")
	private String refComboGroupItemID;

	@SerializedName("IsCombinedCategoryGroups")
	private String isCombinedCategoryGroups;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ExtraPrice")
	private String extraPrice;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("ComboID")
	private String comboID;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("AllowQuantitySelection")
	private String allowQuantitySelection;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("ComboGroupID")
	private String comboGroupID;

	@SerializedName("MaximumNoOfComboItem")
	private String maximumNoOfComboItem;

	@SerializedName("ComboGroupItemID")
	private String comboGroupItemID;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("IsInvisibleItem")
	private String isInvisibleItem;

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setCategoryID(String categoryID){
		this.categoryID = categoryID;
	}

	public String getCategoryID(){
		return categoryID;
	}

	public void setRefComboGroupItemID(String refComboGroupItemID){
		this.refComboGroupItemID = refComboGroupItemID;
	}

	public String getRefComboGroupItemID(){
		return refComboGroupItemID;
	}

	public void setIsCombinedCategoryGroups(String isCombinedCategoryGroups){
		this.isCombinedCategoryGroups = isCombinedCategoryGroups;
	}

	public String getIsCombinedCategoryGroups(){
		return isCombinedCategoryGroups;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
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

	public void setExtraPrice(String extraPrice){
		this.extraPrice = extraPrice;
	}

	public String getExtraPrice(){
		return extraPrice;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	public void setComboID(String comboID){
		this.comboID = comboID;
	}

	public String getComboID(){
		return comboID;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setAllowQuantitySelection(String allowQuantitySelection){
		this.allowQuantitySelection = allowQuantitySelection;
	}

	public String getAllowQuantitySelection(){
		return allowQuantitySelection;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setComboGroupID(String comboGroupID){
		this.comboGroupID = comboGroupID;
	}

	public String getComboGroupID(){
		return comboGroupID;
	}

	public void setMaximumNoOfComboItem(String maximumNoOfComboItem){
		this.maximumNoOfComboItem = maximumNoOfComboItem;
	}

	public String getMaximumNoOfComboItem(){
		return maximumNoOfComboItem;
	}

	public void setComboGroupItemID(String comboGroupItemID){
		this.comboGroupItemID = comboGroupItemID;
	}

	public String getComboGroupItemID(){
		return comboGroupItemID;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setIsInvisibleItem(String isInvisibleItem){
		this.isInvisibleItem = isInvisibleItem;
	}

	public String getIsInvisibleItem(){
		return isInvisibleItem;
	}

	@Override
 	public String toString(){
		return 
			"ComboGroupItemMastersItem{" + 
			"isDefault = '" + isDefault + '\'' + 
			",categoryID = '" + categoryID + '\'' + 
			",refComboGroupItemID = '" + refComboGroupItemID + '\'' + 
			",isCombinedCategoryGroups = '" + isCombinedCategoryGroups + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",extraPrice = '" + extraPrice + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",comboID = '" + comboID + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",allowQuantitySelection = '" + allowQuantitySelection + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",comboGroupID = '" + comboGroupID + '\'' + 
			",maximumNoOfComboItem = '" + maximumNoOfComboItem + '\'' + 
			",comboGroupItemID = '" + comboGroupItemID + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",isInvisibleItem = '" + isInvisibleItem + '\'' + 
			"}";
		}
}