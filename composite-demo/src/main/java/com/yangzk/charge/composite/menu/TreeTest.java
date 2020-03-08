package com.yangzk.charge.composite.menu;

public class TreeTest {

    public static void main(String[] args) {
        RootNode group = new RootNode("ROOT",1);

        ElementNode element1 = new ElementNode("element1");
        ElementNode element2 = new ElementNode("element2");
        ElementNode element3 = new ElementNode("element3");

        RootNode rootNode1 = new RootNode("rootNode1",2);
        RootNode rootNode2 = new RootNode("rootNode2",2);
        RootNode rootElementNode1 = new RootNode("rootElementNode1",3);
        RootNode rootElementNode2 = new RootNode("rootElementNode2",3);
        ElementNode element4 = new ElementNode("element4");
        ElementNode element5 = new ElementNode("element5");

        rootNode1.addNode(rootElementNode1);
        rootNode2.addNode(rootElementNode2);
        rootElementNode2.addNode(element4);
        rootElementNode2.addNode(element5);
        group.addNode(element1);
        group.addNode(element2);
        group.addNode(element3);
        group.addNode(rootNode1);
        group.addNode(rootNode2);

        group.print();
    }
}
