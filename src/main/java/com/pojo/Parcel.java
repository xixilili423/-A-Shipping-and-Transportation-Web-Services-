package com.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("parcel")
public class Parcel {

  private String boxtype;
  private String description;
  private String dimension;
  private String itemsid;
  private String weight;

  public String getBoxType() {
    return boxtype;
  }

  public void setBoxType(String boxtype) {
    this.boxtype = boxtype;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }


  public String getItemsid() {
    return itemsid;
  }

  public void setItemsid(String items) {
    this.itemsid = items;
  }


  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

}
