package com.test.azure.Domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonPropertyOrder({
    "changeLogDate",
    "action",
    "adminGroup",
    "assetType",
    "userID"
})
public class Maintenancelog {

    @JsonProperty("changeLogDate")
    private String changeLogDate;
    @JsonProperty("action")
    private String action;
    @JsonProperty("adminGroup")
    private String adminGroup;
    @JsonProperty("assetType")
    private String assetType;
    @JsonProperty("userID")
    private String userID;

    @JsonProperty("changeLogDate")
    public String getChangeLogDate() {
        return changeLogDate;
    }

    @JsonProperty("changeLogDate")
    public void setChangeLogDate(String changeLogDate) {
        this.changeLogDate = changeLogDate;
    }

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("adminGroup")
    public String getAdminGroup() {
        return adminGroup;
    }

    @JsonProperty("adminGroup")
    public void setAdminGroup(String adminGroup) {
        this.adminGroup = adminGroup;
    }

    @JsonProperty("assetType")
    public String getAssetType() {
        return assetType;
    }

    @JsonProperty("assetType")
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    @JsonProperty("userID")
    public String getUserID() {
        return userID;
    }

    @JsonProperty("userID")
    public void setUserID(String userID) {
        this.userID = userID;
    }

}
