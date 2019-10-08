package com.test.azure.Repository;

import com.test.azure.Domain.Peripherals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PeripheralRepository extends JpaRepository<Peripherals, String> {

    @Query("select count(*) from Peripherals")
    int findPeripheralsCount();

}
