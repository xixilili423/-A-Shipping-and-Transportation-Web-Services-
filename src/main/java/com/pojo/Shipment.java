package com.pojo;


public class Shipment {


  private String returnto;
  private String shipfrom;
  private String shipto;
  private String servicetype;
  private String parcels;

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


  public String getServicetype() {
    return servicetype;
  }

  public void setServicetype(String servicetype) {
    this.servicetype = servicetype;
  }


  public String getParcels() {
    return parcels;
  }

  public void setParcels(String parcels) {
    this.parcels = parcels;
  }

}
