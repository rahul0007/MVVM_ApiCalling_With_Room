package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderPriorityByOrderTypesItem{

	@SerializedName("OPByOrderTypeID")
	private String oPByOrderTypeID;

	@SerializedName("OrderPriority")
	private String orderPriority;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("OrderTypeID")
	private String orderTypeID;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("CeilingWaitingTime")
	private String ceilingWaitingTime;

	public void setOPByOrderTypeID(String oPByOrderTypeID){
		this.oPByOrderTypeID = oPByOrderTypeID;
	}

	public String getOPByOrderTypeID(){
		return oPByOrderTypeID;
	}

	public void setOrderPriority(String orderPriority){
		this.orderPriority = orderPriority;
	}

	public String getOrderPriority(){
		return orderPriority;
	}

	public void setCompanyID(String companyID){
		this.companyID = companyID;
	}

	public String getCompanyID(){
		return companyID;
	}

	public void setOrderTypeID(String orderTypeID){
		this.orderTypeID = orderTypeID;
	}

	public String getOrderTypeID(){
		return orderTypeID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setCeilingWaitingTime(String ceilingWaitingTime){
		this.ceilingWaitingTime = ceilingWaitingTime;
	}

	public String getCeilingWaitingTime(){
		return ceilingWaitingTime;
	}

	@Override
 	public String toString(){
		return 
			"OrderPriorityByOrderTypesItem{" + 
			"oPByOrderTypeID = '" + oPByOrderTypeID + '\'' + 
			",orderPriority = '" + orderPriority + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",orderTypeID = '" + orderTypeID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",ceilingWaitingTime = '" + ceilingWaitingTime + '\'' + 
			"}";
		}
}