package com.test.azure.Service;

import com.test.azure.Domain.AssetDTO;
import com.test.azure.Domain.Consumables;
import com.test.azure.Repository.ConsumableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumableService {

    private  final ConsumableRepository consumableRepository;

    @Autowired
    public ConsumableService(ConsumableRepository consumableRepository) {
        this.consumableRepository = consumableRepository;
    }

    public AssetDTO getConsumables() {
        AssetDTO a = new AssetDTO();
        a.setConsumables(consumableRepository.findAll());
        return a;
    }

}
