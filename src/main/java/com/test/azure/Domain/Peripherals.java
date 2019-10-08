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
        return peripheral_id;
    }

    public void setPeripheral_id(String peripheral_id)
    {
        this.peripheral_id = peripheral_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getModel_no()
    {
        return model_no;
    }

    public void setModel_no(String model_no)
    {
        this.model_no = model_no;
    }

    public String getTotal_peripherals()
    {
        return total_peripherals;
    }

    public void setTotal_peripherals(String total_peripherals)
    {
        this.total_peripherals = total_peripherals;
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
