package com.test.azure.Service;

import com.test.azure.Domain.CountDTO;
import com.test.azure.Domain.ProductDTO;
import com.test.azure.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharedServiceImpl implements SharedService{

    private  final SharedServiceRepository sharedServiceRepository;

    private  final AssetsRepository assetsRepository;

    private  final LicenseRepository licenseRepository;

    private final PeripheralRepository peripheralRepository;

    private  final ConsumableRepository consumableRepository;

    @Autowired
    public SharedServiceImpl(SharedServiceRepository sharedServiceRepository, AssetsRepository assetsRepository, LicenseRepository licenseRepository, PeripheralRepository peripheralRepository, ConsumableRepository consumableRepository){
        this.sharedServiceRepository= sharedServiceRepository;
        this.assetsRepository = assetsRepository;
        this.licenseRepository = licenseRepository;
        this.peripheralRepository = peripheralRepository;
        this.consumableRepository = consumableRepository;
    }


    @Override
    public ProductDTO getProducts() {
        return sharedServiceRepository.findAll().get(0);
    }

    @Override
    public CountDTO getCounts() {

        CountDTO countDTO = new CountDTO();
        countDTO.setAssetCount(assetsRepository.findAssetCount());
        countDTO.setLicenseCount(licenseRepository.findLicenseCount());
        countDTO.setConsumableCount(consumableRepository.findConsumablesCount());
        countDTO.setAccessorieCount(peripheralRepository.findPeripheralsCount());
        return countDTO;
    }


}
