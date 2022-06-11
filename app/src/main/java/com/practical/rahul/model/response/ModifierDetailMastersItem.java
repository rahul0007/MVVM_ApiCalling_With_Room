package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class ModifierDetailMastersItem{

	@SerializedName("Countable")
	private String countable;

	@SerializedName("IsDefault")
	private String isDefault;

	@SerializedName("MaxQty")
	private String maxQty;

	@SerializedName("IsShowOnPOS")
	private String isShowOnPOS;

	@SerializedName("DisplayOrder")
	private String displayOrder;

	@SerializedName("IngredientID")
	private String ingredientID;

	@SerializedName("PortionCount")
	private String portionCount;

	@SerializedName("IsPremium")
	private String isPremium;

	@SerializedName("IsActive")
	private String isActive;

	@SerializedName("ModifierDetailID")
	private String modifierDetailID;

	@SerializedName("ExtraPrice")
	private String extraPrice;

	@SerializedName("Quantity")
	private String quantity;

	@SerializedName("ModifierColor")
	private String modifierColor;

	@SerializedName("IsShowOnOnlineOrder")
	private String isShowOnOnlineOrder;

	@SerializedName("IsShowOnKiosk")
	private String isShowOnKiosk;

	@SerializedName("UnitTypeID")
	private String unitTypeID;

	@SerializedName("KOTKDSDisplayOrder")
	private String kOTKDSDisplayOrder;

	@SerializedName("ModifierID")
	private String modifierID;

	public void setCountable(String countable){
		this.countable = countable;
	}

	public String getCountable(){
		return countable;
	}

	public void setIsDefault(String isDefault){
		this.isDefault = isDefault;
	}

	public String getIsDefault(){
		return isDefault;
	}

	public void setMaxQty(String maxQty){
		this.maxQty = maxQty;
	}

	public String getMaxQty(){
		return maxQty;
	}

	public void setIsShowOnPOS(String isShowOnPOS){
		this.isShowOnPOS = isShowOnPOS;
	}

	public String getIsShowOnPOS(){
		return isShowOnPOS;
	}

	public void setDisplayOrder(String displayOrder){
		this.displayOrder = displayOrder;
	}

	public String getDisplayOrder(){
		return displayOrder;
	}

	public void setIngredientID(String ingredientID){
		this.ingredientID = ingredientID;
	}

	public String getIngredientID(){
		return ingredientID;
	}

	public void setPortionCount(String portionCount){
		this.portionCount = portionCount;
	}

	public String getPortionCount(){
		return portionCount;
	}

	public void setIsPremium(String isPremium){
		this.isPremium = isPremium;
	}

	public String getIsPremium(){
		return isPremium;
	}

	public void setIsActive(String isActive){
		this.isActive = isActive;
	}

	public String getIsActive(){
		return isActive;
	}

	public void setModifierDetailID(String modifierDetailID){
		this.modifierDetailID = modifierDetailID;
	}

	public String getModifierDetailID(){
		return modifierDetailID;
	}

	public void setExtraPrice(String extraPrice){
		this.extraPrice = extraPrice;
	}

	public String getExtraPrice(){
		return extraPrice;
	}

	public void setQuantity(String quantity){
		this.quantity = quantity;
	}

	public String getQuantity(){
		return quantity;
	}

	public void setModifierColor(String modifierColor){
		this.modifierColor = modifierColor;
	}

	public String getModifierColor(){
		return modifierColor;
	}

	public void setIsShowOnOnlineOrder(String isShowOnOnlineOrder){
		this.isShowOnOnlineOrder = isShowOnOnlineOrder;
	}

	public String getIsShowOnOnlineOrder(){
		return isShowOnOnlineOrder;
	}

	public void setIsShowOnKiosk(String isShowOnKiosk){
		this.isShowOnKiosk = isShowOnKiosk;
	}

	public String getIsShowOnKiosk(){
		return isShowOnKiosk;
	}

	public void setUnitTypeID(String unitTypeID){
		this.unitTypeID = unitTypeID;
	}

	public String getUnitTypeID(){
		return unitTypeID;
	}

	public void setKOTKDSDisplayOrder(String kOTKDSDisplayOrder){
		this.kOTKDSDisplayOrder = kOTKDSDisplayOrder;
	}

	public String getKOTKDSDisplayOrder(){
		return kOTKDSDisplayOrder;
	}

	public void setModifierID(String modifierID){
		this.modifierID = modifierID;
	}

	public String getModifierID(){
		return modifierID;
	}

	@Override
 	public String toString(){
		return 
			"ModifierDetailMastersItem{" + 
			"countable = '" + countable + '\'' + 
			",isDefault = '" + isDefault + '\'' + 
			",maxQty = '" + maxQty + '\'' + 
			",isShowOnPOS = '" + isShowOnPOS + '\'' + 
			",displayOrder = '" + displayOrder + '\'' + 
			",ingredientID = '" + ingredientID + '\'' + 
			",portionCount = '" + portionCount + '\'' + 
			",isPremium = '" + isPremium + '\'' + 
			",isActive = '" + isActive + '\'' + 
			",modifierDetailID = '" + modifierDetailID + '\'' + 
			",extraPrice = '" + extraPrice + '\'' + 
			",quantity = '" + quantity + '\'' + 
			",modifierColor = '" + modifierColor + '\'' + 
			",isShowOnOnlineOrder = '" + isShowOnOnlineOrder + '\'' + 
			",isShowOnKiosk = '" + isShowOnKiosk + '\'' + 
			",unitTypeID = '" + unitTypeID + '\'' + 
			",kOTKDSDisplayOrder = '" + kOTKDSDisplayOrder + '\'' + 
			",modifierID = '" + modifierID + '\'' + 
			"}";
		}
}