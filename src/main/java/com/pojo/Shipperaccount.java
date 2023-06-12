package com.pojo;

import lombok.Data;

@Data
public class Shipperaccount {

  private String contactname;
  private String createdat;
  private String id;
  private String address;
  private String password;


  public String getContactName() {
    return contactname;
  }

  public void setContactName(String contactname) {
    this.contactname = contactname;
  }


  public String getCreatedAt() {
    return createdat;
  }

  public void setCreatedAt(String createdat) {
    this.createdat = createdat;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
