package com.demospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demospring.entity.Dbtable;

@Repository
public interface Stockkrepo extends JpaRepository<Dbtable, Integer> {
    
    @Query("SELECT d.stockprice FROM Dbtable d WHERE d.companyname = :companyname")
    Double findstockpricebycompanyname(String companyname);
}
