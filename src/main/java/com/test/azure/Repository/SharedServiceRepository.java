package com.test.azure.Repository;

import com.test.azure.Domain.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SharedServiceRepository extends JpaRepository<ProductDTO, Integer> {
}
