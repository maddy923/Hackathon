package com.test.azure.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Assets")
public class Assets implements Serializable{

    @Id
    @JsonProperty("assetId")
    @Column(name="AssetID")
    private String assetId;

    @Column(name="AssetName")
    private String assetName;

    @JsonProperty("serial")
    @Column(name="Serial")
    private String serial;

    @JsonProperty("model")
    @Column(name="Model")
    private String model;

    @JsonProperty("category")
    @Column(name="Category")
    private String category;

   /* @Column(name="Purchase Date")
    private Date purchaseDate;*/

    @Column(name="Manufacturer")
    private String manufacturer;


    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   /* public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }*/

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
