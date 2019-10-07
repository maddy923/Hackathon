package com.test.azure.Domain;

import javax.persistence.Column;
import java.io.Serializable;

public class LicenseKey implements Serializable{

    @Column(name="LicenceID")
    private String licenseId;

    @Column(name="AssetID")
    private String assetID;

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }
}
