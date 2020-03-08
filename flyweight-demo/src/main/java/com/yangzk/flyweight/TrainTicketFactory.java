package com.yangzk.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 查询车票工厂
 */
public class TrainTicketFactory {

    private static Map<String,ITicket> ticketMap = new ConcurrentHashMap<>();

    /**
     * 查询车票信息
     * @param from
     * @param to
     * @return
     */
    public static ITicket queryTicket(String from,String to){
        String key = from + "->" + to;
        if(ticketMap.containsKey(key)){
            System.out.println("使用缓存："+ key);
            return TrainTicketFactory.ticketMap.get(key);
        }else {
            System.out.println("创建对象：" + key);
            ITicket ticket = new TrainTicket(from, to);
            ticketMap.put(key,ticket);
            return ticket;
        }

    }
}
