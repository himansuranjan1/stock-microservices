package com.demospring.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demospring.binding.Stockpriceapiresponse;

@FeignClient(name="stock-price-apii")
public interface Stockpriceclient {
	@GetMapping("/price/{companyname}")
	public Stockpriceapiresponse invokestockprice(@PathVariable String companyname);
	
}
