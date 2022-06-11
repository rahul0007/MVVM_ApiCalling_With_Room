package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class TableMastersItem{

	@SerializedName("TableID")
	private String tableID;

	@SerializedName("YCode")
	private String yCode;

	@SerializedName("TableQRCodePath")
	private String tableQRCodePath;

	@SerializedName("ShapeTypeID")
	private String shapeTypeID;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("CreatedBy")
	private String createdBy;

	@SerializedName("CompanyID")
	private String companyID;

	@SerializedName("StaffID")
	private String staffID;

	@SerializedName("ScaleRatio")
	private String scaleRatio;

	@SerializedName("UpdatedDate")
	private String updatedDate;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("BranchID")
	private String branchID;

	@SerializedName("LocationLang")
	private String locationLang;

	@SerializedName("Name")
	private String name;

	@SerializedName("UpdatedBy")
	private String updatedBy;

	@SerializedName("TableStatusID")
	private String tableStatusID;

	@SerializedName("NameLang")
	private String nameLang;

	@SerializedName("ReservationID")
	private String reservationID;

	@SerializedName("CreatedDate")
	private String createdDate;

	@SerializedName("IPAddress")
	private String iPAddress;

	@SerializedName("SectionID")
	private String sectionID;

	@SerializedName("XCode")
	private String xCode;

	@SerializedName("NoOfSeat")
	private String noOfSeat;

	@SerializedName("Location")
	private String location;

	public void setTableID(String tableID){
		this.tableID = tableID;
	}

	public String getTableID(){
		return tableID;
	}

	public void setYCode(String yCode){
		this.yCode = yCode;
	}

	public String getYCode(){
		return yCode;
	}

	public void setTableQRCodePath(String tableQRCodePath){
		this.tableQRCodePath = tableQRCodePath;
	}

	public String getTableQRCodePath(){
		return tableQRCodePath;
	}

	public void setShapeTypeID(String shapeTypeID){
		this.shapeTypeID = shapeTypeID;
	}

	public String getShapeTypeID(){
		return shapeTypeID;
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

	public void setStaffID(String staffID){
		this.staffID = staffID;
	}

	public String getStaffID(){
		return staffID;
	}

	public void setScaleRatio(String scaleRatio){
		this.scaleRatio = scaleRatio;
	}

	public String getScaleRatio(){
		return scaleRatio;
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

	public void setBranchID(String branchID){
		this.branchID = branchID;
	}

	public String getBranchID(){
		return branchID;
	}

	public void setLocationLang(String locationLang){
		this.locationLang = locationLang;
	}

	public String getLocationLang(){
		return locationLang;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setUpdatedBy(String updatedBy){
		this.updatedBy = updatedBy;
	}

	public String getUpdatedBy(){
		return updatedBy;
	}

	public void setTableStatusID(String tableStatusID){
		this.tableStatusID = tableStatusID;
	}

	public String getTableStatusID(){
		return tableStatusID;
	}

	public void setNameLang(String nameLang){
		this.nameLang = nameLang;
	}

	public String getNameLang(){
		return nameLang;
	}

	public void setReservationID(String reservationID){
		this.reservationID = reservationID;
	}

	public String getReservationID(){
		return reservationID;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setIPAddress(String iPAddress){
		this.iPAddress = iPAddress;
	}

	public String getIPAddress(){
		return iPAddress;
	}

	public void setSectionID(String sectionID){
		this.sectionID = sectionID;
	}

	public String getSectionID(){
		return sectionID;
	}

	public void setXCode(String xCode){
		this.xCode = xCode;
	}

	public String getXCode(){
		return xCode;
	}

	public void setNoOfSeat(String noOfSeat){
		this.noOfSeat = noOfSeat;
	}

	public String getNoOfSeat(){
		return noOfSeat;
	}

	public void setLocation(String location){
		this.location = location;
	}

	public String getLocation(){
		return location;
	}

	@Override
 	public String toString(){
		return 
			"TableMastersItem{" + 
			"tableID = '" + tableID + '\'' + 
			",yCode = '" + yCode + '\'' + 
			",tableQRCodePath = '" + tableQRCodePath + '\'' + 
			",shapeTypeID = '" + shapeTypeID + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",companyID = '" + companyID + '\'' + 
			",staffID = '" + staffID + '\'' + 
			",scaleRatio = '" + scaleRatio + '\'' + 
			",updatedDate = '" + updatedDate + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",branchID = '" + branchID + '\'' + 
			",locationLang = '" + locationLang + '\'' + 
			",name = '" + name + '\'' + 
			",updatedBy = '" + updatedBy + '\'' + 
			",tableStatusID = '" + tableStatusID + '\'' + 
			",nameLang = '" + nameLang + '\'' + 
			",reservationID = '" + reservationID + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",iPAddress = '" + iPAddress + '\'' + 
			",sectionID = '" + sectionID + '\'' + 
			",xCode = '" + xCode + '\'' + 
			",noOfSeat = '" + noOfSeat + '\'' + 
			",location = '" + location + '\'' + 
			"}";
		}
}