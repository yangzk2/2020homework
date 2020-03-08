package com.yangzk.charge.composite.menu;

/**
 * 叶子节点
 */
public class ElementNode extends TreeNode {

    public ElementNode(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println(super.getName());
    }
}
