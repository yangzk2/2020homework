package com.yangzk.decorator;

import java.util.*;

/**
 * 枚举工具类
 */
public class NavigateEnumUtils {

    private NavigateEnumUtils() {
        if(NavigateHandler.enumSet != null){
            throw new RuntimeException("不允许创建多个实例");
        }
        if(NavigateNameHandler.enumSet != null){
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    /**
     * 动态扩容根据级别查询枚举值
     * @param level
     * @return
     */
    public static final Set<NavigateEnum> getGperNavigate(int level){
        NavigateEnum[] values = NavigateEnum.values();
        for (int i = 0; i < values.length; i++) {
            if (level == values[i].getLevel()) {
                EnumSet<NavigateEnum> value = EnumSet.of(values[i]);
                NavigateHandler.enumSet.addAll(value);
            }
        }
        return  NavigateHandler.enumSet;
    }
    /**
     * 动态扩容根据级别查询枚举值名称
     * @param level
     * @return
     */
    public static final Set<String> getGperNavigateName(int level){
        NavigateEnum[] values = NavigateEnum.values();
        for (int i = 0; i < values.length; i++) {
            if (level == values[i].getLevel()) {
                Set navigateName = new HashSet();
                navigateName.add(values[i].getNavigateName());
                NavigateNameHandler.enumSet.addAll(navigateName);
            }
        }
        return  NavigateNameHandler.enumSet;
    }
    /**
     * 懒加载
     */
    private static class NavigateHandler{
        private static final  Set<NavigateEnum> enumSet = new HashSet<>();

    }
    /**
     * 懒加载
     */
    private static class NavigateNameHandler{
        private static final  Set<String> enumSet = new HashSet<>();

    }
}
