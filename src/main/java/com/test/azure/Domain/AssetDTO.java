package com.test.azure.Domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.USE_DEFAULTS)
@JsonPropertyOrder({
    "asset_id",
    "asset_details",
    "licenses",
    "maintenancelogs"
})
public class AssetDTO {

    @JsonProperty("asset_id")
    private Integer assetId;
    @JsonProperty("asset_details")
    private Assets assets;
    @JsonProperty("licenses")
    private List<License> licenses = null;
    @JsonProperty("maintenancelogs")
    private List<Maintenancelog> maintenancelogs = null;

    @JsonProperty("asset_id")
    public Integer getAssetId() {
        return assetId;
    }

    @JsonProperty("asset_id")
    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    @JsonProperty("asset_details")
    public Assets getAssets() {
        return assets;
    }

    @JsonProperty("asset_details")
    public void setAssets(Assets assets) {
        this.assets = assets;
    }

    @JsonProperty("licenses")
    public List<License> getLicenses() {
        return licenses;
    }

    @JsonProperty("licenses")
    public void setLicenses(List<License> licenses) {
        this.licenses = licenses;
    }

    @JsonProperty("maintenancelogs")
    public List<Maintenancelog> getMaintenancelogs() {
        return maintenancelogs;
    }

    @JsonProperty("maintenancelogs")
    public void setMaintenancelogs(List<Maintenancelog> maintenancelogs) {
        this.maintenancelogs = maintenancelogs;
    }

}
