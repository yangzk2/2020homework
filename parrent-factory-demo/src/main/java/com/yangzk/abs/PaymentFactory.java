package com.yangzk.abs;

public class PaymentFactory implements IPayment {

    @Override
    public IAbroadPayment abroadPay() {
        return new AbroadPaymentFactory();
    }

    @Override
    public IDomesticPayment domesticPay() {
        return new DomesticPaymentFactory();
    }
}
