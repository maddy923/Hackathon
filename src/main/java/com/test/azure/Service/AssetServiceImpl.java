package com.test.azure.Service;

import com.test.azure.Domain.Assets;
import com.test.azure.Repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    private  final AssetsRepository assetsRepository;

    @Autowired
    public AssetServiceImpl(AssetsRepository assetsRepository){
        this.assetsRepository= assetsRepository;
    }


    @Override
    public List<Assets> getAssets() {
        return assetsRepository.findAll();
    }

    @Override
    public Assets getAssetById(String assetId) {
        return assetsRepository.findOneByAssetId(assetId);
    }


}
