package com.yangzk.decorator;

import java.util.Set;

/**
 * 基础导航栏
 */
public class BaseGper implements IGper {


    @Override
    public Set<NavigateEnum> navigate() {
        return NavigateEnumUtils.getGperNavigate(1);
    }

    @Override
    public Set<String> navigateName() {
        return NavigateEnumUtils.getGperNavigateName(1);
    }
}
