package com.test.azure.Service;

import com.test.azure.Domain.Peripherals;
import com.test.azure.Repository.PeripheralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeripheralsService {
    private  final PeripheralRepository peripheralRepository;

    @Autowired
    public PeripheralsService(PeripheralRepository peripheralRepository) {
        this.peripheralRepository = peripheralRepository;
    }

    public List<Peripherals> getPeripherals() {
        return peripheralRepository.findAll();
    }


}
