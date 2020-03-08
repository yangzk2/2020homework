package com.yangzk.charge.composite.xpath;

public class FilterXPath extends XPath{

    protected XPath next;

    public FilterXPath(String text) {
        super(text);
    }

    @Override
    public void addNext(XPath next) {
        this.next = next;
    }

    @Override
    public void print() {
        super.print();
        if (next != null) {
            next.print();
        }
    }
}
