package com.test.azure.Repository;

import com.test.azure.Domain.Consumables;
import com.test.azure.Domain.Licenses;
import com.test.azure.Domain.MaintenanceLogDTO;
import com.test.azure.Domain.Peripherals;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AssetRepositoryImpl implements AssetRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Licenses> findLicensesByAssetId(String assetId) {

        String query = "SELECT a.asset_id , l.* FROM AssetLicenses a JOIN Licenses  l " +
                " ON a.license_id = l.license_id and a.asset_id='" + assetId + "' ";

        Query query1 = entityManager.createNativeQuery(query,Licenses.class) ;

        return query1.getResultList();
    }

    @Override
    public List<Peripherals> findPeripheralsByAssetId(String assetId) {
        String query = "SELECT a.asset_id , p.* FROM AssetPeripherals a JOIN Peripherals  p " +
                " ON a.peripheral_id = p.peripheral_id and a.asset_id='" + assetId + "' ";

        Query query1 = entityManager.createNativeQuery(query,Peripherals.class) ;

        return query1.getResultList();
    }

    @Override
    public List<Consumables> findConsumablesByAssetId(String assetId) {
        String query = "SELECT a.asset_id , c.* FROM AssetConsumables a JOIN Comsumables  c " +
                " ON a.consumable_id = c.consumable_id and a.asset_id='" + assetId + "' ";

        Query query1 = entityManager.createNativeQuery(query,Consumables.class) ;

        return query1.getResultList();
    }

    @Override
    public List<MaintenanceLogDTO> findMaintenanceLogDTOByAssetId(String assetId) {
        String query = "SELECT * FROM MaintenanceLog m where m.asset_id='" + assetId + "' ";

        Query query1 = entityManager.createNativeQuery(query,MaintenanceLogDTO.class) ;

        return query1.getResultList();
    }
}
