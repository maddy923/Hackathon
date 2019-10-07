package com.test.azure.Service;

import com.test.azure.Domain.License;
import com.test.azure.Repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {

    private  final LicenseRepository licenseRepository;

    @Autowired
    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository= licenseRepository;
    }

    public List<License> getLicenses() {
        return licenseRepository.findAll();
    }

    public License getLicense(String licenseId) {
        return licenseRepository.findOneByLicenseId(licenseId);
    }
}
