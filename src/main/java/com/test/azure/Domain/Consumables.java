package com.test.azure.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "Comsumables")
public class Consumables implements Serializable
{

    @Id
    @Column(name="consumable_id")
    private String consumable_id;

    @Column(name="name")
    private String name;

    @Column(name="model_no")
    private String model_no;

    @Column(name="item_no")
    private String item_no;

    @Column(name="manufacturer_id")
    private String manufacturer_id;

    @Column(name="total_consumables")
    private String total_consumables;

    public String getConsumable_id()
    {
        return "Consumable ID: "+consumable_id.trim();
    }

    public void setConsumable_id(String consumable_id)
    {
        this.consumable_id = consumable_id;
    }

    public String getName()
    {
        return "Name: "+name.trim();
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getModel_no()
    {
        return "Model No: "+model_no.trim();
    }

    public void setModel_no(String model_no)
    {
        this.model_no = model_no;
    }

    public String getItem_no()
    {
        return "Item No: "+item_no.trim();
    }

    public void setItem_no(String item_no)
    {
        this.item_no = item_no;
    }

    public String getManufacturer_id()
    {
        return "Manufaturer ID: "+manufacturer_id.trim();
    }

    public void setManufacturer_id(String manufacturer_id)
    {
        this.manufacturer_id = manufacturer_id;
    }

    public String getTotal_consumables()
    {
        return "Total Consumables: "+ total_consumables.trim();
    }

    public void setTotal_consumables(String total_consumables)
    {
        this.total_consumables = total_consumables;
    }
}
