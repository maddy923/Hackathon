package com.test.azure.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MaintenanceLog")
@IdClass(MaintenanceLogKey.class)
public class MaintenanceLogDTO implements Serializable {

    @Id
    @Column(name="asset_id")
    private String asset_id;

    @Id
    @Column(name="change_log_id")
    private String change_log_id;

    @Column(name="description")
    private String description;

    @Column(name="modified_date")
    private String modified_date;

    public String getAsset_id() {
        return "Asset ID: " + asset_id.trim();
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }

    public String getChange_log_id() {
        return "Change Log ID: "+change_log_id.trim();
    }

    public void setChange_log_id(String change_log_id) {
        this.change_log_id = change_log_id;
    }

    public String getDescription() {
        return "Description: "+description.trim();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified_date() {
        return "Modified Date: "+modified_date.trim();
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }
}
