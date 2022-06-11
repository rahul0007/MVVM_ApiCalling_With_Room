package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OrderPriorityByChannelsItem{

	@SerializedName("ModuleID")
	private String moduleID;

	@SerializedName("OrderPriority")
	private String orderPriority;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("OPByChannelID")
	private String oPByChannelID;

	@SerializedName("BranchID")
	private String branchID;

	public void setModuleID(String moduleID){
		this.moduleID = moduleID;
	}

	public String getModuleID(){
		return moduleID;
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

	public void setOPByChannelID(String oPByChannelID){
		this.oPByChannelID = oPByChannelID;
	}

	public String getOPByChannelID(){
		return oPByChannelID;
	}

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	@Override
 	public String toString(){
		return 
			"OrderPriorityByChannelsItem{" + 
			"moduleID = '" + moduleID + '\'' + 
			",orderPriority = '" + orderPriority + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",oPByChannelID = '" + oPByChannelID + '\'' + 
			",branchID = '" + branchID + '\'' + 
			"}";
		}
}