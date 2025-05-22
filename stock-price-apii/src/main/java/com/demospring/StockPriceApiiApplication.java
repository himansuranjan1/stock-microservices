package com.demospring;

import com.demospring.entity.Dbtable;
import com.demospring.repository.Stockkrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Arrays;

@EnableDiscoveryClient
@SpringBootApplication
public class StockPriceApiiApplication implements CommandLineRunner {

    @Autowired
    private Stockkrepo stockkrepo; 

    public static void main(String[] args) {
        SpringApplication.run(StockPriceApiiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Insert records into the database automatically on startup
        Dbtable stock1 = new Dbtable();
        stock1.setStockpriceid(1);
        stock1.setCompanyname("Tata Motors");
        stock1.setStockprice(850.75);

        Dbtable stock2 = new Dbtable();
        stock2.setStockpriceid(2);
        stock2.setCompanyname("Reliance Industries");
        stock2.setStockprice(2600.00);

        Dbtable stock3 = new Dbtable();
        stock3.setStockpriceid(3);
        stock3.setCompanyname("Infosys");
        stock3.setStockprice(1500.25);

        Dbtable stock4 = new Dbtable();
        stock4.setStockpriceid(4);
        stock4.setCompanyname("Wipro");
        stock4.setStockprice(550.00);

        Dbtable stock5 = new Dbtable();
        stock5.setStockpriceid(5);
        stock5.setCompanyname("HDFC Bank");
        stock5.setStockprice(1700.50);

        // Save all the records using JPA repository
        stockkrepo.saveAll(Arrays.asList(stock1, stock2, stock3, stock4, stock5));
    }
}
