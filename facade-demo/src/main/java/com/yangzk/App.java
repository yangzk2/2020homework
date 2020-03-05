package com.yangzk;

import com.yangzk.facade.AlibabaCompany;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        AlibabaCompany alibabaCompany = new AlibabaCompany();
        //alibabaCompany.getRecption().queryVariousDepartments();
        alibabaCompany.getRecption().queryVariousOpertionDepartment();
        alibabaCompany.getRecption().queryVariousRDDepartment();
        alibabaCompany.getRecption().queryVariousTestDepartment();
    }
}
