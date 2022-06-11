package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderTypeKDSMappingsItem{

	@SerializedName("IsPrintCompletion")
	private String isPrintCompletion;

	@SerializedName("OTKDSMappingID")
	private String oTKDSMappingID;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("KDSID")
	private String kDSID;

	@SerializedName("IsEnabled")
	private String isEnabled;

	@SerializedName("OrderTypeID")
	private String orderTypeID;

	@SerializedName("DisplayLabel")
	private String displayLabel;

	public void setIsPrintCompletion(String isPrintCompletion){
		this.isPrintCompletion = isPrintCompletion;
	}

	public String getIsPrintCompletion(){
		return isPrintCompletion;
	}

	public void setOTKDSMappingID(String oTKDSMappingID){
		this.oTKDSMappingID = oTKDSMappingID;
	}

	public String getOTKDSMappingID(){
		return oTKDSMappingID;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setKDSID(String kDSID){
		this.kDSID = kDSID;
	}

	public String getKDSID(){
		return kDSID;
	}

	public void setIsEnabled(String isEnabled){
		this.isEnabled = isEnabled;
	}

	public String getIsEnabled(){
		return isEnabled;
	}

	public void setOrderTypeID(String orderTypeID){
		this.orderTypeID = orderTypeID;
	}

	public String getOrderTypeID(){
		return orderTypeID;
	}

	public void setDisplayLabel(String displayLabel){
		this.displayLabel = displayLabel;
	}

	public String getDisplayLabel(){
		return displayLabel;
	}

	@Override
 	public String toString(){
		return 
			"OrderTypeKDSMappingsItem{" + 
			"isPrintCompletion = '" + isPrintCompletion + '\'' + 
			",oTKDSMappingID = '" + oTKDSMappingID + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",kDSID = '" + kDSID + '\'' + 
			",isEnabled = '" + isEnabled + '\'' + 
			",orderTypeID = '" + orderTypeID + '\'' + 
			",displayLabel = '" + displayLabel + '\'' + 
			"}";
		}
}