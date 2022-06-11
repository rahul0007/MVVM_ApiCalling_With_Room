package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class CommonModifierItemMappingsItem{

	@SerializedName("HasCustomOverride")
	private String hasCustomOverride;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("KOTDisplayOrder")
	private String kOTDisplayOrder;

	@SerializedName("ParentModifierID")
	private String parentModifierID;

	@SerializedName("MinNoOfSelection")
	private String minNoOfSelection;

	@SerializedName("ItemID")
	private String itemID;

	@SerializedName("CMIMappingID")
	private String cMIMappingID;

	@SerializedName("ModifierID")
	private String modifierID;

	@SerializedName("MaxiNoOfSelection")
	private String maxiNoOfSelection;

	public void setHasCustomOverride(String hasCustomOverride){
		this.hasCustomOverride = hasCustomOverride;
	}

	public String getHasCustomOverride(){
		return hasCustomOverride;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
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

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setKOTDisplayOrder(String kOTDisplayOrder){
		this.kOTDisplayOrder = kOTDisplayOrder;
	}

	public String getKOTDisplayOrder(){
		return kOTDisplayOrder;
	}

	public void setParentModifierID(String parentModifierID){
		this.parentModifierID = parentModifierID;
	}

	public String getParentModifierID(){
		return parentModifierID;
	}

	public void setMinNoOfSelection(String minNoOfSelection){
		this.minNoOfSelection = minNoOfSelection;
	}

	public String getMinNoOfSelection(){
		return minNoOfSelection;
	}

	public void setItemID(String itemID){
		this.itemID = itemID;
	}

	public String getItemID(){
		return itemID;
	}

	public void setCMIMappingID(String cMIMappingID){
		this.cMIMappingID = cMIMappingID;
	}

	public String getCMIMappingID(){
		return cMIMappingID;
	}

	public void setModifierID(String modifierID){
		this.modifierID = modifierID;
	}

	public String getModifierID(){
		return modifierID;
	}

	public void setMaxiNoOfSelection(String maxiNoOfSelection){
		this.maxiNoOfSelection = maxiNoOfSelection;
	}

	public String getMaxiNoOfSelection(){
		return maxiNoOfSelection;
	}

	@Override
 	public String toString(){
		return 
			"CommonModifierItemMappingsItem{" + 
			"hasCustomOverride = '" + hasCustomOverride + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",kOTDisplayOrder = '" + kOTDisplayOrder + '\'' + 
			",parentModifierID = '" + parentModifierID + '\'' + 
			",minNoOfSelection = '" + minNoOfSelection + '\'' + 
			",itemID = '" + itemID + '\'' + 
			",cMIMappingID = '" + cMIMappingID + '\'' + 
			",modifierID = '" + modifierID + '\'' + 
			",maxiNoOfSelection = '" + maxiNoOfSelection + '\'' + 
			"}";
		}
}