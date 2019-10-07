package com.test.azure.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CountDTO implements Serializable{

    @JsonProperty("asset_count")
    private int assetCount;

    @JsonProperty("license_count")
    private int licenseCount;

    @JsonProperty("accessori_count")
    private int accessorieCount;

    @JsonProperty("consumable_count")
    private int consumableCount;

    public int getAssetCount() {
        return assetCount;
    }

    public void setAssetCount(int assetCount) {
        this.assetCount = assetCount;
    }

    public int getLicenseCount() {
        return licenseCount;
    }

    public void setLicenseCount(int licenseCount) {
        this.licenseCount = licenseCount;
    }

    public int getAccessorieCount() {
        return accessorieCount;
    }

    public void setAccessorieCount(int accessorieCount) {
        this.accessorieCount = accessorieCount;
    }

    public int getConsumableCount() {
        return consumableCount;
    }

    public void setConsumableCount(int consumableCount) {
        this.consumableCount = consumableCount;
    }
}

