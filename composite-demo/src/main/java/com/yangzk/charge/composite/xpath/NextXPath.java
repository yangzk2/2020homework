package com.yangzk.charge.composite.xpath;

public class NextXPath extends XPath {
    protected XPath next;

    protected XPath filter;

    public NextXPath(String text) {
        super(text);
    }

    @Override
    public void addFilter(XPath filter) {
        this.filter = filter;
    }

    @Override
    public void addNext(XPath next) {
        this.next = next;
    }

    @Override
    public void print() {
        super.print();
        if (filter != null) {
            System.out.print("[");
            filter.print();
            System.out.print("]");
        }
        if (next != null) {
            next.print();
        }
    }

}
