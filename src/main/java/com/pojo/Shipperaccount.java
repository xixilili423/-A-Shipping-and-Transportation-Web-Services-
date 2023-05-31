package com.pojo;

import lombok.Data;

@Data
public class Shipperaccount {

  private String contactname;
  private String createdat;
  private String description;
  private String id;
  private String settings;
  private String slug;
  private String timezone;
  private String type;
  private String updatedat;
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


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getSettings() {
    return settings;
  }

  public void setSettings(String settings) {
    this.settings = settings;
  }


  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }


  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getUpdatedAt() {
    return updatedat;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedat = updatedAt;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
