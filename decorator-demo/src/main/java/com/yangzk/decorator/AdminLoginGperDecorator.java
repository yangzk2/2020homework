package com.yangzk.decorator;

import java.util.Set;

/**
 * 管理员登陆
 */
public class AdminLoginGperDecorator extends DecoratorGper{

    public AdminLoginGperDecorator(IGper gper) {
        super(gper);
    }

    @Override
    public Set<NavigateEnum> navigate() {
        Set<NavigateEnum> navigate = super.navigate();
        navigate.addAll(NavigateEnumUtils.getGperNavigate(3));
        return super.navigate();
    }

    @Override
    public Set<String> navigateName() {
        Set<String> navigateNameSet = super.navigateName();
        navigateNameSet.addAll(NavigateEnumUtils.getGperNavigateName(3));
        navigateNameSet.remove(NavigateEnum.VIP.getNavigateName());
        return navigateNameSet;
    }
}
