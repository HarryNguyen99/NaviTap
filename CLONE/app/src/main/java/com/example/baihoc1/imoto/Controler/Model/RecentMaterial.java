package com.example.baihoc1.imoto.Controler.Model;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RecentMaterial implements Serializable {

@SerializedName("status")
@Expose
public Integer status;
@SerializedName("code")
@Expose
public Integer code;
@SerializedName("result")
@Expose
public List<RecentMaterialResult> RecentMaterialResult = null;
@SerializedName("message")
@Expose
public String message;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<com.example.baihoc1.imoto.Controler.Model.RecentMaterialResult> getRecentMaterialResult() {
        return RecentMaterialResult;
    }

    public void setRecentMaterialResult(List<com.example.baihoc1.imoto.Controler.Model.RecentMaterialResult> recentMaterialResult) {
        RecentMaterialResult = recentMaterialResult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}