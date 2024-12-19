package com.noeteric.jpa.jpademo.jpaconnection2.jpainheritance;

import java.util.Date;

public class StockTest {
    public static void main(String[] args) {

       StockService stockService = new StockService();

        RestrictedStockEntity restrictedStockEntity = new RestrictedStockEntity();
        restrictedStockEntity.setPrice(200.5);
        restrictedStockEntity.setDuration(24);
        restrictedStockEntity.setLockInPeriod(12);

        OptionalStockEntity optionalStockEntity = new OptionalStockEntity();
        optionalStockEntity.setPrice(150.3);
        optionalStockEntity.setDuration(48);
        optionalStockEntity.setStrikePrice(200.5);

        FutureStockEntity futureStockEntity = new FutureStockEntity();
        futureStockEntity.setPrice(300.0);
        futureStockEntity.setDuration(36);
        futureStockEntity.setDeliveryDate(new Date());

        stockService.savestocks(restrictedStockEntity);
        stockService.savestocks(optionalStockEntity);
        stockService.savestocks(futureStockEntity);



    }
}
