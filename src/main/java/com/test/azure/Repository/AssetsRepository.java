package com.test.azure.Repository;

import com.test.azure.Domain.Assets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetsRepository extends JpaRepository<Assets, String> {

    Assets findOneByAssetId(@Param("assetId") String assetId);

    @Query("select count(*) from Assets")
    int findAssetCount();
}
