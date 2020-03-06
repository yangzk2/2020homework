package com.yangzk.decorator;

import java.util.EnumSet;
import java.util.Set;

/**
 * vip学员登录
 */
public class VipLoginGperDecorator extends DecoratorGper{

    public VipLoginGperDecorator(IGper gper) {
        super(gper);
    }

    @Override
    public Set<NavigateEnum> navigate() {
        Set<NavigateEnum> enumSet = super.navigate();
        enumSet.addAll(NavigateEnumUtils.getGperNavigate(2));
        return enumSet;
    }

    @Override
    public Set<String> navigateName() {
        Set<String> navigateNameSet = super.navigateName();
        navigateNameSet.addAll(NavigateEnumUtils.getGperNavigateName(2));
        return navigateNameSet;
    }
}
