package com.test.azure.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Licenses")
public class Licenses implements Serializable {


    @Id
    @Column(name="license_id")
    private String license_id;

    @Column(name="product_key")
    private String product_key;

    @Column(name="expiration_date")
    private String expiration_date;

    @Column(name="total_licenses")
    private String total_licenses;

    @Column(name="manufacturer_id")
    private String manufacturer_id;

    @Column(name="software_id")
    private String software_id;

    public String getLicense_id()
    {
        return "License ID: " + license_id.trim();
    }

    public void setLicense_id(String license_id)
    {
        this.license_id = license_id;
    }

    public String getProduct_key()
    {
        return "Product Key: " + product_key.trim();
    }

    public void setProduct_key(String product_key)
    {
        this.product_key = product_key;
    }

    public String getExpiration_date()
    {
        return "Expiration Date: " + expiration_date.trim();
    }

    public void setExpiration_date(String expiration_date)
    {
        this.expiration_date = expiration_date;
    }

    public String getTotal_licenses()
    {
        return "Total Licenses: " + total_licenses.trim();
    }

    public void setTotal_licenses(String total_licenses)
    {
        this.total_licenses = total_licenses;
    }

    public String getManufacturer_id()
    {
        return "Manufacturer ID: " + manufacturer_id;
    }

    public void setManufacturer_id(String manufacturer_id)
    {
        this.manufacturer_id = manufacturer_id;
    }

    public String getSoftware_id()
    {
        return null==software_id ? "" : "Software ID: " + software_id.trim();
    }

    public void setSoftware_id(String software_id)
    {
        this.software_id = software_id;
    }
}
