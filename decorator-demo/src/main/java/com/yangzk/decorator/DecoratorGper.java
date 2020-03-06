package com.yangzk.decorator;

import java.util.Set;

public class DecoratorGper implements IGper {

    private IGper gper;

    public DecoratorGper(IGper gper) {
        this.gper = gper;
    }

    @Override
    public Set<NavigateEnum> navigate() {
        return this.gper.navigate();
    }

    @Override
    public Set<String> navigateName() {
        return this.gper.navigateName();
    }
}
