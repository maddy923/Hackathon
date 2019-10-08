package com.test.azure.Service;

import com.test.azure.Domain.*;
import com.test.azure.Repository.AssetRepositoryCustom;
import com.test.azure.Repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private  final AssetsRepository assetsRepository;
    private final LicenseService licenseService;
    private final AssetRepositoryCustom assetRepositoryCustom;

    @Autowired
    public AssetServiceImpl(AssetsRepository assetsRepository, LicenseService licenseService, AssetRepositoryCustom assetRepositoryCustom){
        this.assetsRepository= assetsRepository;
        this.licenseService = licenseService;
        this.assetRepositoryCustom = assetRepositoryCustom;
    }


    @Override
    public List<Assets> getAssets() {
        return assetsRepository.findAll();
    }

    @Override
    public AssetDTO getAssetById(String assetId) {

        AssetDTO assetDTO = new AssetDTO();

        List<Licenses> licenseList = assetRepositoryCustom.findLicensesByAssetId(assetId);

        List<Peripherals> peripheralsList = assetRepositoryCustom.findPeripheralsByAssetId(assetId);

        List<Consumables> consumablesList = assetRepositoryCustom.findConsumablesByAssetId(assetId);

        List<MaintenanceLogDTO> maintenancelogList = assetRepositoryCustom.findMaintenanceLogDTOByAssetId(assetId);

        assetDTO.setAssetId(assetId);
        assetDTO.setAssets(Arrays.asList(assetsRepository.findOneByAssetID(assetId)));
        assetDTO.setMaintenancelogs(maintenancelogList);
        assetDTO.setLicenses(licenseList);
        assetDTO.setPeripherals(peripheralsList);
        assetDTO.setConsumables(consumablesList);

        return assetDTO;
    }

}
