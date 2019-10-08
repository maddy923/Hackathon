package com.test.azure.Repository;

import com.test.azure.Domain.Consumables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumableRepository   extends JpaRepository<Consumables, String> {

    @Query("select count(*) from Consumables")
    int findConsumablesCount();
}
