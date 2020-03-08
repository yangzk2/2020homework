package com.yangzk.flyweight;

import java.math.BigDecimal;
import java.util.Random;

/**
 * 火车票
 */
public class TrainTicket implements ITicket {

    private String from;
    private String to;
    private BigDecimal price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        this.price = BigDecimal.valueOf(new Random().nextInt(500));
        System.out.println(String.format("%s->%s：%s 价格：%s 元", this.from, this.to, bunk, this.price));
    }
}
