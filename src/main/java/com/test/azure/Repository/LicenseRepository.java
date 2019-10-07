package com.test.azure.Repository;

import com.test.azure.Domain.Assets;
import com.test.azure.Domain.License;
import com.test.azure.Domain.LicenseKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository<License, LicenseKey> {

    License findOneByLicenseId(@Param("licenseId") String licenseId);


    @Query("select count(*) from License")
    int findLicenseCount();
}

