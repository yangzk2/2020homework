package com.yangzk.charge.composite.menu;


import java.util.List;

/**
 * 定义顶级树节点
 */
public abstract class TreeNode {


    private String name;    //名称

    public TreeNode(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void print(){
        throw new UnsupportedOperationException("不支持打印！");
    }




}