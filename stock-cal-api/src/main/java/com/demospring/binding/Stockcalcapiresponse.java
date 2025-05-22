package com.demospring.binding;

import lombok.Data;

@Data
public class Stockcalcapiresponse {
	private String companyname;
	private Double stockprice;
	private Integer port;
	private Double totalcost;
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Double getStockprice() {
		return stockprice;
	}
	public void setStockprice(Double stockprice) {
		this.stockprice = stockprice;
	}
	public Double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(Double totalcost) {
		this.totalcost = totalcost;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
}
