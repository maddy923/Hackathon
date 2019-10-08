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
        return license_id;
    }

    public void setLicense_id(String license_id)
    {
        this.license_id = license_id;
    }

    public String getProduct_key()
    {
        return product_key;
    }

    public void setProduct_key(String product_key)
    {
        this.product_key = product_key;
    }

    public String getExpiration_date()
    {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date)
    {
        this.expiration_date = expiration_date;
    }

    public String getTotal_licenses()
    {
        return total_licenses;
    }

    public void setTotal_licenses(String total_licenses)
    {
        this.total_licenses = total_licenses;
    }

    public String getManufacturer_id()
    {
        return manufacturer_id;
    }

    public void setManufacturer_id(String manufacturer_id)
    {
        this.manufacturer_id = manufacturer_id;
    }

    public String getSoftware_id()
    {
        return software_id;
    }

    public void setSoftware_id(String software_id)
    {
        this.software_id = software_id;
    }
}
