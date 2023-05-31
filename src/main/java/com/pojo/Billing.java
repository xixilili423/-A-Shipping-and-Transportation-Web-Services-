package com.pojo;


public class Billing {

  private String accountnumber;
  private String country;
  private String postalcode;
  private String type;
  private String paidby;


  public String getAccountNumber() {
    return accountnumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountnumber = accountnumber;
  }


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  public String getPostalcode() {
    return postalcode;
  }

  public void setPostalCode(String postalCode) {
    this.postalcode = postalcode;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getPaidBy() {
    return paidby;
  }

  public void setPaidBy(String paidby) {
    this.paidby = paidby;
  }

}
