package com.test.azure.Domain;

public class MaintenanceDTO {


    private String changeLogDate;
    private String action;
    private String adminGroup;
    private String assetType;
    private String userID;

    public String getChangeLogDate() {
        return changeLogDate;
    }

    public void setChangeLogDate(String changeLogDate) {
        this.changeLogDate = changeLogDate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAdminGroup() {
        return adminGroup;
    }

    public void setAdminGroup(String adminGroup) {
        this.adminGroup = adminGroup;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
