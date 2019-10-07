package com.test.azure.controller;

import com.test.azure.Domain.*;
import com.test.azure.Service.SharedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SharedController {


    private SharedService sharedService;

    @Autowired
    public SharedController( SharedService sharedService){
        this.sharedService=sharedService;
    }


    @RequestMapping("")
    public String welcome(){
        return "Welcome User!";
    }


    @GetMapping(value = "api/v1/users" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDTO userDetails(){
        return sharedService.getProducts();
    }

    @GetMapping(value = "/count" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CountDTO counts(){

        return sharedService.getCounts();
    }

    @GetMapping(value = "/maintenance/top2" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<MaintenanceDTO> activities(){

        List<MaintenanceDTO> maintenanceDTOList = new ArrayList();
        MaintenanceDTO maintenanceDTO = new MaintenanceDTO();
        maintenanceDTO.setAction("installed MySQL");
        maintenanceDTO.setAdminGroup("ADFTR-OUPY-567");
        maintenanceDTO.setAssetType("laptop");
        maintenanceDTO.setUserID("Madhu");
        maintenanceDTO.setChangeLogDate("09-18-2019");

        MaintenanceDTO maintenanceDTO2 = new MaintenanceDTO();
        maintenanceDTO2.setAction("Deleted MySQL");
        maintenanceDTO2.setAdminGroup("ADFTR-OUPY-568");
        maintenanceDTO2.setAssetType("mac");
        maintenanceDTO2.setUserID("Sai");
        maintenanceDTO2.setChangeLogDate("09-20-2019");

        maintenanceDTOList.add(maintenanceDTO);
        maintenanceDTOList.add(maintenanceDTO2);

        return maintenanceDTOList;
    }

  /*  @GetMapping(value = "/asset/1", produces = MediaType.APPLICATION_JSON_VALUE)
    public AssetDTO assetDetails(){

        Assets assets = new Assets();

        assets.setAssetId(1);
        assets.setAssetModelID("123");
        assets.setAssetModelType("Pro");
        assets.setAssetType("Mac");
        assets.setLastModified("05-05-2019");
        assets.setPurchaseCost("$999");
        assets.setPurchaseOrderNumber("1234");
        assets.setUserID("Madhu");

        List<License> licenseList = new ArrayList<>();
        License license1 = new License();
        license1.setLicenseName("abc");
        license1.setProductKey("123");
        license1.setStatus("A");

        License license2 = new License();
        license1.setLicenseName("abcd");
        license1.setProductKey("1234");
        license1.setStatus("I");

        licenseList.add(license1);
        licenseList.add(license2);

        List<Maintenancelog> maintenancelogList = new ArrayList<>();
        Maintenancelog maintenancelog1 = new Maintenancelog();
        Maintenancelog maintenancelog2 = new Maintenancelog();

        maintenancelog1.setAction("Update");
        maintenancelog1.setAdminGroup("abc");
        maintenancelog1.setAssetType("Mac");
        maintenancelog1.setChangeLogDate("2-12-2019");
        maintenancelog1.setUserID("Madhu");

        maintenancelog2.setAction("Add");
        maintenancelog2.setAdminGroup("xyz");
        maintenancelog2.setAssetType("Laptop");
        maintenancelog2.setChangeLogDate("05-05-2019");
        maintenancelog2.setUserID("Sai");

        maintenancelogList.add(maintenancelog1);
        maintenancelogList.add(maintenancelog2);

        AssetDTO assetDTO = new AssetDTO();

        assetDTO.setAssets(assets);
        assetDTO.setLicenses(licenseList);
        assetDTO.setMaintenancelogs(maintenancelogList);
        assetDTO.setAssets(assets);
        assetDTO.setAssetId(1);

        return assetDTO;

    }*/


}
