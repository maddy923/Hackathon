package com.test.azure.Domain;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class AssetDTO {

    @JsonProperty("asset_details")
    private Assets assets;

    @JsonProperty("licenses")
    private List<License> licenses = null;

    @JsonProperty("maintenancelogs")
    private List<Maintenancelog> maintenancelogs = null;


    public Assets getAssets()
    {
        return assets;
    }

    public void setAssets(Assets assets)
    {
        this.assets = assets;
    }

    public List<License> getLicenses()
    {
        return licenses;
    }

    public void setLicenses(List<License> licenses)
    {
        this.licenses = licenses;
    }

    public List<Maintenancelog> getMaintenancelogs()
    {
        return maintenancelogs;
    }

    public void setMaintenancelogs(List<Maintenancelog> maintenancelogs)
    {
        this.maintenancelogs = maintenancelogs;
    }
}
