package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderTypeMappingMastersItem{

	@SerializedName("PosIsActive")
	private String posIsActive;

	@SerializedName("KioskIsActive")
	private String kioskIsActive;

	@SerializedName("KioskAskCustomerEmail")
	private String kioskAskCustomerEmail;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("KioskTableTent")
	private String kioskTableTent;

	@SerializedName("KioskAskCustomerPhone")
	private String kioskAskCustomerPhone;

	@SerializedName("RefOrderTypeID")
	private String refOrderTypeID;

	@SerializedName("KioskPath")
	private String kioskPath;

	@SerializedName("Name")
	private String name;

	@SerializedName("DisplayLabel")
	private String displayLabel;

	@SerializedName("PosPath")
	private String posPath;

	@SerializedName("OrderTypeID")
	private String orderTypeID;

	@SerializedName("OnlineOrderIsActive")
	private String onlineOrderIsActive;

	@SerializedName("KioskAskCustomerName")
	private String kioskAskCustomerName;

	@SerializedName("OPMID")
	private String oPMID;

	@SerializedName("OnlineOrderPath")
	private String onlineOrderPath;

	public void setPosIsActive(String posIsActive){
		this.posIsActive = posIsActive;
	}

	public String getPosIsActive(){
		return posIsActive;
	}

	public void setKioskIsActive(String kioskIsActive){
		this.kioskIsActive = kioskIsActive;
	}

	public String getKioskIsActive(){
		return kioskIsActive;
	}

	public void setKioskAskCustomerEmail(String kioskAskCustomerEmail){
		this.kioskAskCustomerEmail = kioskAskCustomerEmail;
	}

	public String getKioskAskCustomerEmail(){
		return kioskAskCustomerEmail;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setKioskTableTent(String kioskTableTent){
		this.kioskTableTent = kioskTableTent;
	}

	public String getKioskTableTent(){
		return kioskTableTent;
	}

	public void setKioskAskCustomerPhone(String kioskAskCustomerPhone){
		this.kioskAskCustomerPhone = kioskAskCustomerPhone;
	}

	public String getKioskAskCustomerPhone(){
		return kioskAskCustomerPhone;
	}

	public void setRefOrderTypeID(String refOrderTypeID){
		this.refOrderTypeID = refOrderTypeID;
	}

	public String getRefOrderTypeID(){
		return refOrderTypeID;
	}

	public void setKioskPath(String kioskPath){
		this.kioskPath = kioskPath;
	}

	public String getKioskPath(){
		return kioskPath;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDisplayLabel(String displayLabel){
		this.displayLabel = displayLabel;
	}

	public String getDisplayLabel(){
		return displayLabel;
	}

	public void setPosPath(String posPath){
		this.posPath = posPath;
	}

	public String getPosPath(){
		return posPath;
	}

	public void setOrderTypeID(String orderTypeID){
		this.orderTypeID = orderTypeID;
	}

	public String getOrderTypeID(){
		return orderTypeID;
	}

	public void setOnlineOrderIsActive(String onlineOrderIsActive){
		this.onlineOrderIsActive = onlineOrderIsActive;
	}

	public String getOnlineOrderIsActive(){
		return onlineOrderIsActive;
	}

	public void setKioskAskCustomerName(String kioskAskCustomerName){
		this.kioskAskCustomerName = kioskAskCustomerName;
	}

	public String getKioskAskCustomerName(){
		return kioskAskCustomerName;
	}

	public void setOPMID(String oPMID){
		this.oPMID = oPMID;
	}

	public String getOPMID(){
		return oPMID;
	}

	public void setOnlineOrderPath(String onlineOrderPath){
		this.onlineOrderPath = onlineOrderPath;
	}

	public String getOnlineOrderPath(){
		return onlineOrderPath;
	}

	@Override
 	public String toString(){
		return 
			"OrderTypeMappingMastersItem{" + 
			"posIsActive = '" + posIsActive + '\'' + 
			",kioskIsActive = '" + kioskIsActive + '\'' + 
			",kioskAskCustomerEmail = '" + kioskAskCustomerEmail + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",kioskTableTent = '" + kioskTableTent + '\'' + 
			",kioskAskCustomerPhone = '" + kioskAskCustomerPhone + '\'' + 
			",refOrderTypeID = '" + refOrderTypeID + '\'' + 
			",kioskPath = '" + kioskPath + '\'' + 
			",name = '" + name + '\'' + 
			",displayLabel = '" + displayLabel + '\'' + 
			",posPath = '" + posPath + '\'' + 
			",orderTypeID = '" + orderTypeID + '\'' + 
			",onlineOrderIsActive = '" + onlineOrderIsActive + '\'' + 
			",kioskAskCustomerName = '" + kioskAskCustomerName + '\'' + 
			",oPMID = '" + oPMID + '\'' + 
			",onlineOrderPath = '" + onlineOrderPath + '\'' + 
			"}";
		}
}