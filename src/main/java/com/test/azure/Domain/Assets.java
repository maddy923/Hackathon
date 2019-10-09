package com.test.azure.Domain;

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
    private String purchase_date;

    @Column(name="manufacturer_id")
    private String manufacturer_id;

    public String getAsset_id()
    {
        return "Asset ID: " + asset_id.trim();
    }

    public void setAsset_id(String asset_id)
    {
        this.asset_id =  asset_id;
    }

    public String getName()
    {
        return "Name: " + name.trim();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUser_id()
    {
        return "User ID: " + user_id.trim();
    }

    public void setUser_id(String user_id)
    {
        this.user_id = user_id;
    }

    public String getLocation()
    {
        return "Location: " + location.trim();
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getHardware_status()
    {
        return "Hardware Status: " + hardware_status.trim();
    }

    public void setHardware_status(String hardware_status)
    {
        this.hardware_status = hardware_status;
    }

    public String getAssignment_group()
    {
        return "Assignment Group:" + assignment_group.trim();
    }

    public void setAssignment_group(String assignment_group)
    {
        this.assignment_group = assignment_group;
    }

    public String getNetwork_connected()
    {
        return "Network Connection: "+network_connected.trim();
    }

    public void setNetwork_connected(String network_connected)
    {
        this.network_connected = network_connected;
    }

    public String getFda_state()
    {
        return "FDA State: "+fda_state.trim();
    }

    public void setFda_state(String fda_state)
    {
        this.fda_state = fda_state;
    }

    public String getPoid()
    {
        return "Purchase Order ID:" + poid.trim();
    }

    public void setPoid(String poid)
    {
        this.poid = poid;
    }

    public String getSerial_no()
    {
        return "Serial No: " + serial_no.trim();
    }

    public void setSerial_no(String serial_no)
    {
        this.serial_no = serial_no;
    }

    public String getModel_no()
    {
        return "Model No:" + model_no.trim();
    }

    public void setModel_no(String model_no)
    {
        this.model_no = model_no;
    }

    public String getCategory()
    {
        return "Category: " + category.trim();
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getPurchase_date()
    {
        return "Purchase Date: " + purchase_date.trim();
    }

    public void setPurchase_date(String purchase_date)
    {
        this.purchase_date = purchase_date;
    }

    public String getManufacturer_id()
    {
        return "Manufacturer ID: "+ manufacturer_id.trim();
    }

    public void setManufacturer_id(String manufacturer_id)
    {
        this.manufacturer_id = manufacturer_id;
    }
}
