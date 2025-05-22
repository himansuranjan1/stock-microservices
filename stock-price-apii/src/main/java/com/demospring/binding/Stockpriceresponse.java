package com.demospring.binding;
public class Stockpriceresponse {
	
	private String companyname;
	private Double stockprice;
	private Integer port;
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
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
}