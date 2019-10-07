package com.test.azure.Service;

import com.test.azure.Domain.CountDTO;
import com.test.azure.Domain.ProductDTO;
import com.test.azure.Repository.AssetsRepository;
import com.test.azure.Repository.LicenseRepository;
import com.test.azure.Repository.SharedServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharedServiceImpl implements SharedService{

    private  final SharedServiceRepository sharedServiceRepository;

    private  final AssetsRepository assetsRepository;

    private  final LicenseRepository licenseRepository;

    @Autowired
    public SharedServiceImpl(SharedServiceRepository sharedServiceRepository, AssetsRepository assetsRepository, LicenseRepository licenseRepository){
        this.sharedServiceRepository= sharedServiceRepository;
        this.assetsRepository = assetsRepository;
        this.licenseRepository = licenseRepository;
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
        countDTO.setConsumableCount(10);
        countDTO.setAccessorieCount(25);
        return countDTO;
    }


}
