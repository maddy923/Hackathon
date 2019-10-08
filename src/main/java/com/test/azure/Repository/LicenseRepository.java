package com.test.azure.Repository;

import com.test.azure.Domain.Licenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository<Licenses, String> {

    @Query("select l from Licenses l where l.license_id = :license_id")
    Licenses findOneByLicenseId(@Param("license_id") String license_id);

    @Query("select count(*) from Licenses")
    int findLicenseCount();
}

