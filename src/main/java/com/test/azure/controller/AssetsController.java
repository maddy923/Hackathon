package com.test.azure.controller;

import com.test.azure.Domain.AssetDTO;
import com.test.azure.Domain.Assets;
import com.test.azure.Service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssetsController {

    private AssetService assetService;


    @Autowired
    public AssetsController( AssetService assetService){
        this.assetService=assetService;
    }


    @GetMapping(value="/assets",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Assets> assets(){

        return assetService.getAssets();
    }

    @GetMapping(value="/assets/{asset_id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public AssetDTO assets(@PathVariable("asset_id") String assetId){


        return assetService.getAssetById(assetId);
    }


}
