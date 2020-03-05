package com.yangzk.facade;

/**
 * 阿里巴巴
 */
public class AlibabaCompany {

    /**
     * 找到阿里前台
     * @return
     */
 public AlibabaCompanyReception getRecption(){
     return new AlibabaCompanyReception();
 }

}
