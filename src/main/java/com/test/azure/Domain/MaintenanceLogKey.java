package com.test.azure.Domain;

import javax.persistence.Column;
import java.io.Serializable;

public class MaintenanceLogKey implements Serializable {

    @Column(name="asset_id")
    private String asset_id;

    @Column(name="change_log_id")
    private String change_log_id;

    public String getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getChange_log_id() {
        return change_log_id;
    }

    public void setChange_log_id(String change_log_id) {
        this.change_log_id = change_log_id;
    }
}
