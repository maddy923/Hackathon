package com.test.azure.controller;

import com.test.azure.Domain.AssetDTO;
import com.test.azure.Domain.Licenses;
import com.test.azure.Service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class LicenseController {

    private LicenseService licenseService;

    @Autowired
    public LicenseController( LicenseService licenseService){
        this.licenseService=licenseService;
    }


    @GetMapping(value="/licenses",produces = MediaType.APPLICATION_JSON_VALUE)
    public AssetDTO licenses(){

        return licenseService.getLicenses();
    }

    @GetMapping(value="/licenses/{license_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Licenses license(@PathVariable("license_id") String licenseId){

        return licenseService.getLicense(licenseId);
    }
}
