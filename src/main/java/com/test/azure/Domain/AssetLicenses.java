package com.test.azure.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "AssetLicenses")
public class AssetLicenses  implements Serializable {

    @Id
    @Column(name="asset_id")
    private String asset_id;

    @Id
    @Column(name="license_id")
    private String license_id;

    public String getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getLicense_id() {
        return license_id;
    }

    public void setLicense_id(String license_id) {
        this.license_id = license_id;
    }
}
