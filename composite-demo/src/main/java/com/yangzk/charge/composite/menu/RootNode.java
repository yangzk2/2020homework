package com.yangzk.charge.composite.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 枝节点
 */
public class RootNode extends TreeNode {

    private Integer level;

    private List<TreeNode> nodes = new ArrayList<TreeNode>();

    public RootNode(String name, Integer level) {
        super(name);
        this.level = level;
    }

    public RootNode(String name) {
        super(name);
    }


    public void addNode(TreeNode node){
        nodes.add(node);
    }

    public void removeNode(TreeNode node){
        nodes.remove(node);
    }

    public void print(){
        System.out.println(this.getName());
        for (TreeNode node : nodes) {
            //控制显示格式
            if(this.level != null){
                for(int  i = 0; i < this.level; i ++){
                    System.out.print("  ");
                }
            }
            //打印名称
            node.print();
        }
    }

}

