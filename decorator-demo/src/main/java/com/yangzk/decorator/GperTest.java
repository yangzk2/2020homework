package com.yangzk.decorator;

import java.util.Set;

/**
 * 测试
 */
public class GperTest {

    public static void main(String[] args) {
        //未登录菜单状态
        IGper gper = new BaseGper();
        System.out.println("未登录菜单状态枚举值："+gper.navigate());
        System.out.println("未登录菜单状态枚举值名称: "+gper.navigateName());
        //Vip登录菜单状态
        gper = new VipLoginGperDecorator(gper);
        System.out.println("Vip登录菜单状态枚举值："+gper.navigate());
        System.out.println("Vip登录菜单状态枚举值名称: "+gper.navigateName());
        //管理员登录菜单状态
        gper = new AdminLoginGperDecorator(gper);
        System.out.println("管理员登录菜单状态枚举值："+gper.navigate());
        //管理员删除vip学员
        System.out.println("管理员登录菜单状态枚举值名称: "+gper.navigateName());
    }
}
