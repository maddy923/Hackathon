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
    @Column(name="asset_id")
    private String asset_id;

    @Column(name="name")
    private String name;

    @Column(name="user_id")
    private String user_id;

    @Column(name="location")
    private String location;

    @Column(name="hardware_status")
    private String hardware_status;

    @Column(name="assignment_group")
    private String assignment_group;

    @Column(name="network_connected")
    private String network_connected;

    @Column(name="fda_state")
    private String fda_state;

    @Column(name="poid")
    private String poid;

    @Column(name="serial_no")
    private String serial_no;

    @Column(name="model_no")
    private String model_no;

    @Column(name="category")
    private String category;

    @Column(name="purchase_date")
    private Date purchase_date;

    @Column(name="manufacturer_id")
    private String manufacturer_id;

    public String getAsset_ad()
    {
        return asset_id;
    }

    public void setAsset_ad(String asset_ad)
    {
        this.asset_id = asset_ad;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUser_id()
    {
        return user_id;
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getHardware_status()
    {
        return hardware_status;
    }

    public void setHardware_status(String hardware_status)
    {
        this.hardware_status = hardware_status;
    }

    public String getAssignment_group()
    {
        return assignment_group;
    }

    public void setAssignment_group(String assignment_group)
    {
        this.assignment_group = assignment_group;
    }

    public String getNetwork_connected()
    {
        return network_connected;
    }

    public void setNetwork_connected(String network_connected)
    {
        this.network_connected = network_connected;
    }

    public String getFda_state()
    {
        return fda_state;
    }

    public void setFda_state(String fda_state)
    {
        this.fda_state = fda_state;
    }

    public String getPoid()
    {
        return poid;
    }

    public void setPoid(String poid)
    {
        this.poid = poid;
    }

    public String getSerial_no()
    {
        return serial_no;
    }

    public void setSerial_no(String serial_no)
    {
        this.serial_no = serial_no;
    }

    public String getModel_no()
    {
        return model_no;
    }

    public void setModel_no(String model_no)
    {
        this.model_no = model_no;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public Date getPurchase_date()
    {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date)
    {
        this.purchase_date = purchase_date;
    }

    public String getManufacturer_id()
    {
        return manufacturer_id;
    }

    public void setManufacturer_id(String manufacturer_id)
    {
        this.manufacturer_id = manufacturer_id;
    }
}
