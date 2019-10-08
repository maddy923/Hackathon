package com.test.azure.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class AssetDTO {

    @JsonProperty("asset_id")
    private String assetId;

    @JsonProperty("asset_details")
    private List<Assets> assets;

    @JsonProperty("licenses")
    private List<Licenses> licenses = new ArrayList<>();

    @JsonProperty("maintenance_logs")
    private List<MaintenanceLogDTO> maintenancelogs = new ArrayList<>();

    @JsonProperty("peripherals")
    private List<Peripherals> peripherals = new ArrayList<>();

    @JsonProperty("consumables")
    private List<Consumables> consumables = new ArrayList<>();


    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }
    
    public List<Assets> getAssets()
    {
        return assets;
    }

    public void setAssets(List<Assets> assets)
    {
        this.assets = assets;
    }

    public List<Licenses> getLicenses()
    {
        return licenses;
    }

    public void setLicenses(List<Licenses> licenses)
    {
        this.licenses = licenses;
    }

    public List<MaintenanceLogDTO> getMaintenancelogs()
    {
        return maintenancelogs;
    }

    public void setMaintenancelogs(List<MaintenanceLogDTO> maintenancelogs)
    {
        this.maintenancelogs = maintenancelogs;
    }

    public List<Peripherals> getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(List<Peripherals> peripherals) {
        this.peripherals = peripherals;
    }

    public List<Consumables> getConsumables() {
        return consumables;
    }

    public void setConsumables(List<Consumables> consumables) {
        this.consumables = consumables;
    }
}
