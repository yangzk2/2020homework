package com.yangzk.charge.composite.xpath;

public abstract class XPath  {
    protected String text;

    public XPath(String text) {
        this.text = text;
    }

    public void addFilter(XPath filter) {
        throw new UnsupportedOperationException("不支持加过滤");
    }

    public void addNext(XPath next) {
        throw new UnsupportedOperationException("不支持加子节点");
    }

    public void print() {
        if (text != null && text.length() > 0) {
            System.out.print(text);
        }
    }
}
