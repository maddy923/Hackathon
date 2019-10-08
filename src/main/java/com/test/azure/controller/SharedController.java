package com.test.azure.controller;

import com.test.azure.Domain.CountDTO;
import com.test.azure.Domain.ProductDTO;
import com.test.azure.Service.SharedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SharedController {


    private SharedService sharedService;

    @Autowired
    public SharedController( SharedService sharedService){
        this.sharedService=sharedService;
    }


    @RequestMapping("")
    public String welcome(){
        return "Welcome User!";
    }


    @GetMapping(value = "api/v1/users" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductDTO userDetails(){
        return sharedService.getProducts();
    }

    @GetMapping(value = "/count" , produces = MediaType.APPLICATION_JSON_VALUE)
    public CountDTO counts(){

        return sharedService.getCounts();
    }

}
