package com.demospring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demospring.binding.Stockcalcapiresponse;
import com.demospring.service.Stksrvc;

@RestController
public class Stockrestcntrlr {
	@Autowired
	private Stksrvc stcl;
	@GetMapping("/calc/{companyname}/{quantity}")
	public Stockcalcapiresponse getStockCost( @PathVariable String companyname,@PathVariable Integer quantity) {
		return stcl.getstockcost( companyname,  quantity);
	}

}
