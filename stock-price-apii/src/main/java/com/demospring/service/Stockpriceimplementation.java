package com.demospring.service;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.demospring.binding.Stockpriceresponse;
import com.demospring.repository.Stockkrepo;
@Service
public class Stockpriceimplementation implements Stockservice {
	@Autowired
	private Stockkrepo stkprice;
	@Autowired
	private Environment env;
	@Override
	public 	Stockpriceresponse  getstock(String companyname) {
		double sp= stkprice.findstockpricebycompanyname(companyname);
		Stockpriceresponse st=new Stockpriceresponse();
		String port = env.getProperty("server.port");
		st.setCompanyname(companyname);
	    st.setStockprice(sp);
	    st.setPort(Integer.parseInt(port));
	     return st;
}
}