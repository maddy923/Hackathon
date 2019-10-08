package com.test.azure.Repository;

import com.test.azure.Domain.MaintenanceLogDTO;
import com.test.azure.Domain.MaintenanceLogKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceLogRepository extends JpaRepository<MaintenanceLogDTO, MaintenanceLogKey> {
}
