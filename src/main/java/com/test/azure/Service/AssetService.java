package com.test.azure.Service;

import com.test.azure.Domain.AssetDTO;
import com.test.azure.Domain.Assets;

import java.util.List;

public interface AssetService {
    List<Assets>  getAssets();
    AssetDTO getAssetById(String assetId);
}
