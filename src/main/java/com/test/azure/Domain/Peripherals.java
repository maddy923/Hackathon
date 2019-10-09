package com.test.azure.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Peripherals")
public class Peripherals implements Serializable
{

    @Id
    @Column(name="peripheral_id")
    private String peripheral_id;

    @Column(name="name")
    private String name;

    @Column(name="category")
    private String category;

    @Column(name="model_no")
    private String model_no;

    @Column(name="total_peripherals")
    private String total_peripherals;

    @Column(name="manufacturer_id")
    private String manufacturer_id;

    public String getPeripheral_id()
    {
        return "Peripheral ID: "+peripheral_id.trim();
    }

    public void setPeripheral_id(String peripheral_id)
    {
        this.peripheral_id = peripheral_id;
    }

    public String getName()
    {
        return "Name: "+name.trim();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCategory()
    {
        return "Category: "+category.trim();
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getModel_no()
    {
        return "Model No: "+model_no.trim();
    }

    public void setModel_no(String model_no)
    {
        this.model_no = model_no;
    }

    public String getTotal_peripherals()
    {
        return "Total Peripherals: "+total_peripherals.trim();
    }

    public void setTotal_peripherals(String total_peripherals)
    {
        this.total_peripherals = total_peripherals;
    }

    public String getManufacturer_id()
    {
        return "Manufacturer ID: "+manufacturer_id.trim();
    }

    public void setManufacturer_id(String manufacturer_id)
    {
        this.manufacturer_id = manufacturer_id;
    }
}
