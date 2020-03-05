package com.yangzk.abs;

/**
 * 抽象工厂模式
 */
public interface IPayment {

    public IAbroadPayment abroadPay();

    public IDomesticPayment domesticPay();
}
