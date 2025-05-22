package com.demospring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stock_price_dtls")
public class Dbtable {

    @Id
    @Column
    private Integer stockpriceid;

    @Column
    private String companyname;

    @Column
    private Double stockprice;

    // Constructors
    public Dbtable() {}

    public Dbtable(Integer stockpriceid, String companyname, Double stockprice) {
        this.stockpriceid = stockpriceid;
        this.companyname = companyname;
        this.stockprice = stockprice;
    }

    // Getters and Setters
    public Integer getStockpriceid() {
        return stockpriceid;
    }

    public void setStockpriceid(Integer stockpriceid) {
        this.stockpriceid = stockpriceid;
    }

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
}
