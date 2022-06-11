package com.practical.rahul.model.response;

import com.google.gson.annotations.SerializedName;

public class OnlineOrderSettingsItem{

	@SerializedName("ReceiveOrdersEmailAddress")
	private String receiveOrdersEmailAddress;

	@SerializedName("EstimatedDeliveryTime")
	private String estimatedDeliveryTime;

	@SerializedName("EstimatedReadyForPickUp")
	private String estimatedReadyForPickUp;

	@SerializedName("TemporaryEstimatedReadyForPickupTime")
	private String temporaryEstimatedReadyForPickupTime;

	@SerializedName("DeliveryMinutes")
	private String deliveryMinutes;

	@SerializedName("OOURLQrCodePath")
	private String oOURLQrCodePath;

	@SerializedName("HideStartsAtForVariablePrice")
	private String hideStartsAtForVariablePrice;

	@SerializedName("CollapseOptionalModifierGroups")
	private String collapseOptionalModifierGroups;

	@SerializedName("DeliveryOrders")
	private String deliveryOrders;

	@SerializedName("IsDeliveryPickupTime")
	private String isDeliveryPickupTime;

	@SerializedName("PickupMinutes")
	private String pickupMinutes;

	@SerializedName("DeliveryPickupOrders")
	private String deliveryPickupOrders;

	@SerializedName("OrderThrottlingMode")
	private String orderThrottlingMode;

	@SerializedName("OrderSendToKitchenMode")
	private String orderSendToKitchenMode;

	@SerializedName("CustomerAdvisoryText")
	private String customerAdvisoryText;

	@SerializedName("OnlineOrderStation")
	private String onlineOrderStation;

	@SerializedName("UseTemporarayTimeUntill")
	private String useTemporarayTimeUntill;

	@SerializedName("PickupOrders")
	private String pickupOrders;

	@SerializedName("OnlineOrderPaused")
	private String onlineOrderPaused;

	@SerializedName("OrderAdvanceDay")
	private String orderAdvanceDay;

	@SerializedName("IsMinOrderForConcessionaire")
	private String isMinOrderForConcessionaire;

	@SerializedName("UseTemporaryTimes")
	private String useTemporaryTimes;

	@SerializedName("IsShowPicturesForModifiersAndVariation")
	private String isShowPicturesForModifiersAndVariation;

	@SerializedName("IsCollapsedCategory")
	private String isCollapsedCategory;

	@SerializedName("TemporaryEstimatedDeliveryTime")
	private String temporaryEstimatedDeliveryTime;

	@SerializedName("OOSID")
	private String oOSID;

	@SerializedName("IsShowCustomerNameForEachItem")
	private String isShowCustomerNameForEachItem;

	@SerializedName("BlockPickupOrders")
	private String blockPickupOrders;

	@SerializedName("IsIncludeTaxInPriceOO")
	private String isIncludeTaxInPriceOO;

	@SerializedName("OnlineOrderActive")
	private String onlineOrderActive;

	@SerializedName("BlockPickUpTime")
	private String blockPickUpTime;

	@SerializedName("ReceiveOrdersinEmail")
	private String receiveOrdersinEmail;

	public void setReceiveOrdersEmailAddress(String receiveOrdersEmailAddress){
		this.receiveOrdersEmailAddress = receiveOrdersEmailAddress;
	}

	public String getReceiveOrdersEmailAddress(){
		return receiveOrdersEmailAddress;
	}

	public void setEstimatedDeliveryTime(String estimatedDeliveryTime){
		this.estimatedDeliveryTime = estimatedDeliveryTime;
	}

	public String getEstimatedDeliveryTime(){
		return estimatedDeliveryTime;
	}

	public void setEstimatedReadyForPickUp(String estimatedReadyForPickUp){
		this.estimatedReadyForPickUp = estimatedReadyForPickUp;
	}

	public String getEstimatedReadyForPickUp(){
		return estimatedReadyForPickUp;
	}

	public void setTemporaryEstimatedReadyForPickupTime(String temporaryEstimatedReadyForPickupTime){
		this.temporaryEstimatedReadyForPickupTime = temporaryEstimatedReadyForPickupTime;
	}

	public String getTemporaryEstimatedReadyForPickupTime(){
		return temporaryEstimatedReadyForPickupTime;
	}

	public void setDeliveryMinutes(String deliveryMinutes){
		this.deliveryMinutes = deliveryMinutes;
	}

	public String getDeliveryMinutes(){
		return deliveryMinutes;
	}

	public void setOOURLQrCodePath(String oOURLQrCodePath){
		this.oOURLQrCodePath = oOURLQrCodePath;
	}

	public String getOOURLQrCodePath(){
		return oOURLQrCodePath;
	}

	public void setHideStartsAtForVariablePrice(String hideStartsAtForVariablePrice){
		this.hideStartsAtForVariablePrice = hideStartsAtForVariablePrice;
	}

	public String getHideStartsAtForVariablePrice(){
		return hideStartsAtForVariablePrice;
	}

	public void setCollapseOptionalModifierGroups(String collapseOptionalModifierGroups){
		this.collapseOptionalModifierGroups = collapseOptionalModifierGroups;
	}

	public String getCollapseOptionalModifierGroups(){
		return collapseOptionalModifierGroups;
	}

	public void setDeliveryOrders(String deliveryOrders){
		this.deliveryOrders = deliveryOrders;
	}

	public String getDeliveryOrders(){
		return deliveryOrders;
	}

	public void setIsDeliveryPickupTime(String isDeliveryPickupTime){
		this.isDeliveryPickupTime = isDeliveryPickupTime;
	}

	public String getIsDeliveryPickupTime(){
		return isDeliveryPickupTime;
	}

	public void setPickupMinutes(String pickupMinutes){
		this.pickupMinutes = pickupMinutes;
	}

	public String getPickupMinutes(){
		return pickupMinutes;
	}

	public void setDeliveryPickupOrders(String deliveryPickupOrders){
		this.deliveryPickupOrders = deliveryPickupOrders;
	}

	public String getDeliveryPickupOrders(){
		return deliveryPickupOrders;
	}

	public void setOrderThrottlingMode(String orderThrottlingMode){
		this.orderThrottlingMode = orderThrottlingMode;
	}

	public String getOrderThrottlingMode(){
		return orderThrottlingMode;
	}

	public void setOrderSendToKitchenMode(String orderSendToKitchenMode){
		this.orderSendToKitchenMode = orderSendToKitchenMode;
	}

	public String getOrderSendToKitchenMode(){
		return orderSendToKitchenMode;
	}

	public void setCustomerAdvisoryText(String customerAdvisoryText){
		this.customerAdvisoryText = customerAdvisoryText;
	}

	public String getCustomerAdvisoryText(){
		return customerAdvisoryText;
	}

	public void setOnlineOrderStation(String onlineOrderStation){
		this.onlineOrderStation = onlineOrderStation;
	}

	public String getOnlineOrderStation(){
		return onlineOrderStation;
	}

	public void setUseTemporarayTimeUntill(String useTemporarayTimeUntill){
		this.useTemporarayTimeUntill = useTemporarayTimeUntill;
	}

	public String getUseTemporarayTimeUntill(){
		return useTemporarayTimeUntill;
	}

	public void setPickupOrders(String pickupOrders){
		this.pickupOrders = pickupOrders;
	}

	public String getPickupOrders(){
		return pickupOrders;
	}

	public void setOnlineOrderPaused(String onlineOrderPaused){
		this.onlineOrderPaused = onlineOrderPaused;
	}

	public String getOnlineOrderPaused(){
		return onlineOrderPaused;
	}

	public void setOrderAdvanceDay(String orderAdvanceDay){
		this.orderAdvanceDay = orderAdvanceDay;
	}

	public String getOrderAdvanceDay(){
		return orderAdvanceDay;
	}

	public void setIsMinOrderForConcessionaire(String isMinOrderForConcessionaire){
		this.isMinOrderForConcessionaire = isMinOrderForConcessionaire;
	}

	public String getIsMinOrderForConcessionaire(){
		return isMinOrderForConcessionaire;
	}

	public void setUseTemporaryTimes(String useTemporaryTimes){
		this.useTemporaryTimes = useTemporaryTimes;
	}

	public String getUseTemporaryTimes(){
		return useTemporaryTimes;
	}

	public void setIsShowPicturesForModifiersAndVariation(String isShowPicturesForModifiersAndVariation){
		this.isShowPicturesForModifiersAndVariation = isShowPicturesForModifiersAndVariation;
	}

	public String getIsShowPicturesForModifiersAndVariation(){
		return isShowPicturesForModifiersAndVariation;
	}

	public void setIsCollapsedCategory(String isCollapsedCategory){
		this.isCollapsedCategory = isCollapsedCategory;
	}

	public String getIsCollapsedCategory(){
		return isCollapsedCategory;
	}

	public void setTemporaryEstimatedDeliveryTime(String temporaryEstimatedDeliveryTime){
		this.temporaryEstimatedDeliveryTime = temporaryEstimatedDeliveryTime;
	}

	public String getTemporaryEstimatedDeliveryTime(){
		return temporaryEstimatedDeliveryTime;
	}

	public void setOOSID(String oOSID){
		this.oOSID = oOSID;
	}

	public String getOOSID(){
		return oOSID;
	}

	public void setIsShowCustomerNameForEachItem(String isShowCustomerNameForEachItem){
		this.isShowCustomerNameForEachItem = isShowCustomerNameForEachItem;
	}

	public String getIsShowCustomerNameForEachItem(){
		return isShowCustomerNameForEachItem;
	}

	public void setBlockPickupOrders(String blockPickupOrders){
		this.blockPickupOrders = blockPickupOrders;
	}

	public String getBlockPickupOrders(){
		return blockPickupOrders;
	}

	public void setIsIncludeTaxInPriceOO(String isIncludeTaxInPriceOO){
		this.isIncludeTaxInPriceOO = isIncludeTaxInPriceOO;
	}

	public String getIsIncludeTaxInPriceOO(){
		return isIncludeTaxInPriceOO;
	}

	public void setOnlineOrderActive(String onlineOrderActive){
		this.onlineOrderActive = onlineOrderActive;
	}

	public String getOnlineOrderActive(){
		return onlineOrderActive;
	}

	public void setBlockPickUpTime(String blockPickUpTime){
		this.blockPickUpTime = blockPickUpTime;
	}

	public String getBlockPickUpTime(){
		return blockPickUpTime;
	}

	public void setReceiveOrdersinEmail(String receiveOrdersinEmail){
		this.receiveOrdersinEmail = receiveOrdersinEmail;
	}

	public String getReceiveOrdersinEmail(){
		return receiveOrdersinEmail;
	}

	@Override
 	public String toString(){
		return 
			"OnlineOrderSettingsItem{" + 
			"receiveOrdersEmailAddress = '" + receiveOrdersEmailAddress + '\'' + 
			",estimatedDeliveryTime = '" + estimatedDeliveryTime + '\'' + 
			",estimatedReadyForPickUp = '" + estimatedReadyForPickUp + '\'' + 
			",temporaryEstimatedReadyForPickupTime = '" + temporaryEstimatedReadyForPickupTime + '\'' + 
			",deliveryMinutes = '" + deliveryMinutes + '\'' + 
			",oOURLQrCodePath = '" + oOURLQrCodePath + '\'' + 
			",hideStartsAtForVariablePrice = '" + hideStartsAtForVariablePrice + '\'' + 
			",collapseOptionalModifierGroups = '" + collapseOptionalModifierGroups + '\'' + 
			",deliveryOrders = '" + deliveryOrders + '\'' + 
			",isDeliveryPickupTime = '" + isDeliveryPickupTime + '\'' + 
			",pickupMinutes = '" + pickupMinutes + '\'' + 
			",deliveryPickupOrders = '" + deliveryPickupOrders + '\'' + 
			",orderThrottlingMode = '" + orderThrottlingMode + '\'' + 
			",orderSendToKitchenMode = '" + orderSendToKitchenMode + '\'' + 
			",customerAdvisoryText = '" + customerAdvisoryText + '\'' + 
			",onlineOrderStation = '" + onlineOrderStation + '\'' + 
			",useTemporarayTimeUntill = '" + useTemporarayTimeUntill + '\'' + 
			",pickupOrders = '" + pickupOrders + '\'' + 
			",onlineOrderPaused = '" + onlineOrderPaused + '\'' + 
			",orderAdvanceDay = '" + orderAdvanceDay + '\'' + 
			",isMinOrderForConcessionaire = '" + isMinOrderForConcessionaire + '\'' + 
			",useTemporaryTimes = '" + useTemporaryTimes + '\'' + 
			",isShowPicturesForModifiersAndVariation = '" + isShowPicturesForModifiersAndVariation + '\'' + 
			",isCollapsedCategory = '" + isCollapsedCategory + '\'' + 
			",temporaryEstimatedDeliveryTime = '" + temporaryEstimatedDeliveryTime + '\'' + 
			",oOSID = '" + oOSID + '\'' + 
			",isShowCustomerNameForEachItem = '" + isShowCustomerNameForEachItem + '\'' + 
			",blockPickupOrders = '" + blockPickupOrders + '\'' + 
			",isIncludeTaxInPriceOO = '" + isIncludeTaxInPriceOO + '\'' + 
			",onlineOrderActive = '" + onlineOrderActive + '\'' + 
			",blockPickUpTime = '" + blockPickUpTime + '\'' + 
			",receiveOrdersinEmail = '" + receiveOrdersinEmail + '\'' + 
			"}";
		}
}