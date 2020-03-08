package com.yangzk.charge.composite.xpath;

public class XPathTest {
    public static void main(String[] args) {

        XPath bookstore = new NextXPath("/bookstore");

        XPath book = new NextXPath("/book");
        XPath bookFilter = new FilterXPath("price>35.00");
        book.addFilter(bookFilter);

        XPath title = new NextXPath("/title");
        book.addNext(title);

        bookstore.addNext(book);
        bookstore.print();
    }
}
