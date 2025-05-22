package com.demospring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demospring.binding.Stockpriceresponse;
import com.demospring.service.Stockservice;

@RestController
public class Stprcrestcontroller {

    @Autowired
    private Stockservice srv;

    @GetMapping("/price/{companyname}")
    public ResponseEntity<Stockpriceresponse> getStockPrice(@PathVariable String companyname) {
        Stockpriceresponse price = srv.getstock(companyname);

        if (price.getStockprice() == null) {
            // Return 404 if no stock price is found
            return ResponseEntity.notFound().build();
        }

        // Return 200 OK with the response body
        return ResponseEntity.ok(price);
    }
}
