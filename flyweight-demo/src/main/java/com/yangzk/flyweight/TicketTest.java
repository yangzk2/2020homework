package com.yangzk.flyweight;

public class TicketTest {
    public static void main(String[] args) {
        ITicket ticket = TrainTicketFactory.queryTicket("北京", "菏泽");
        ticket.showInfo("硬卧");
        ITicket ticket1 = TrainTicketFactory.queryTicket("北京", "菏泽");
        ticket1.showInfo("硬座");
        ITicket ticket2 = TrainTicketFactory.queryTicket("北京西", "菏泽");
        ticket1.showInfo("软卧");
    }
}
