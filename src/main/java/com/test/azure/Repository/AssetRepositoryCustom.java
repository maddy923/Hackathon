package com.test.azure.Repository;

import com.test.azure.Domain.Consumables;
import com.test.azure.Domain.Licenses;
import com.test.azure.Domain.MaintenanceLogDTO;
import com.test.azure.Domain.Peripherals;

import java.util.List;

public interface AssetRepositoryCustom {

    List<Licenses> findLicensesByAssetId(String assetId);

    List<Peripherals> findPeripheralsByAssetId(String assetId);

    List<Consumables> findConsumablesByAssetId(String assetId);

    List<MaintenanceLogDTO> findMaintenanceLogDTOByAssetId(String assetId);


}
