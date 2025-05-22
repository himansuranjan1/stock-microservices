

        
        
        package com.demospring.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import com.demospring.binding.Stockcalcapiresponse;
        import com.demospring.binding.Stockpriceapiresponse;
        import com.demospring.client.Stockpriceclient;

        @Service
        public class Stksrvc {

            @Autowired
            private Stockpriceclient sp;

            public Stockcalcapiresponse getstockcost(String companyname, Integer quantity) {
                Stockcalcapiresponse stc = new Stockcalcapiresponse();

                Stockpriceapiresponse invprc = sp.invokestockprice(companyname);
                Double stockprice = invprc.getStockprice();

                double totalcost = stockprice * quantity;

                stc.setCompanyname(companyname);
                stc.setStockprice(stockprice);
                stc.setPort(invprc.getPort());
                stc.setTotalcost(totalcost);

                return stc;
            }
        }

    