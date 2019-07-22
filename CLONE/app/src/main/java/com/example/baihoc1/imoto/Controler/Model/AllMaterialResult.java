package com.example.baihoc1.imoto.Controler.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AllMaterialResult implements Serializable {

@SerializedName("materialID")
@Expose
public String materialID;
@SerializedName("materialName")
@Expose
public String materialName;
@SerializedName("unit")
@Expose
public String unit;
@SerializedName("price")
@Expose
public Integer price;
@SerializedName("maxKm")
@Expose
public Integer maxKm;

    public String getMaterialID() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID = materialID;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(Integer maxKm) {
        this.maxKm = maxKm;
    }
}