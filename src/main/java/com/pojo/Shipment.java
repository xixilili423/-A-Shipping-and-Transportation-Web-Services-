package com.pojo;


public class Shipment {

  private String deliveryinstructions;
  private String returnto;
  private String shipfrom;
  private String shipto;
  private String type;
  private String parcels;


  public String getDeliveryInstructions() {
    return deliveryinstructions;
  }

  public void setDeliveryInstructions(String deliveryinstructions) {
    this.deliveryinstructions = deliveryinstructions;
  }


  public String getReturnTo() {
    return returnto;
  }

  public void setReturnTo(String returnTo) {
    this.returnto = returnto;
  }


  public String getShipFrom() {
    return shipfrom;
  }

  public void setShipFrom(String shipFrom) {
    this.shipfrom = shipfrom;
  }


  public String getShipTo() {
    return shipto;
  }

  public void setShipTo(String shipTo) {
    this.shipto = shipto;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getParcels() {
    return parcels;
  }

  public void setParcels(String parcels) {
    this.parcels = parcels;
  }

}
