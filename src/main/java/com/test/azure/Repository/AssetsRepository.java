package com.test.azure.Repository;

import com.test.azure.Domain.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends JpaRepository<Assets, String> {

    @Query("select a from Assets a where a.asset_id = :asset_id")
    Assets findOneByAssetID(@Param("asset_id") String asset_id);

    @Query("select count(*) from Assets")
    int findAssetCount();
}
