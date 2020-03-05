package com.yangzk.facade;

/**
 *阿里巴巴前台
 */
public class AlibabaCompanyReception {

    /**
     * 运营部
     */
    private OperationDepartment operationDepartment = new OperationDepartment();
    /**
     * 研发部
     */
    private RDDepartment rdDepartment = new RDDepartment();
    /**
     * 测试部
     */
    private TestDepartment testDepartment = new TestDepartment();

    public void  queryVariousDepartments(){
        operationDepartment.getOpertionDepartment();
        rdDepartment.getRDDepartment();
        testDepartment.getTestDepartment();
    }

    public void  queryVariousOpertionDepartment(){
        operationDepartment.getOpertionDepartment();
    }

    public void  queryVariousRDDepartment(){
        rdDepartment.getRDDepartment();
    }

    public void  queryVariousTestDepartment(){
        testDepartment.getTestDepartment();
    }

}
