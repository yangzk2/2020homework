package com.yangzk.simple;

import com.yangzk.AliPay;
import com.yangzk.IChinaPay;
import com.yangzk.WechatPay;

/**
 * 简单工厂模式
 */
public class SimplePaymentFactory {
    /**
     *第一种简单工厂实现方式 根据支付名称进行选择支付方式
     * @param name
     * @return
     */
    public IChinaPay creatPay(String name){

        if("Ali".equals(name)){
            return new AliPay();
        }else if("Wechat".equals(name)){
            return new WechatPay();
        }else{
            throw new RuntimeException("暂不支持该种支付业务");
        }
    }

    public IChinaPay createPay(Class<? extends IChinaPay> clazz){

        try {
            if(null != clazz){
                return clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
