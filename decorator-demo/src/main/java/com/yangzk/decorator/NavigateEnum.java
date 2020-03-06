package com.yangzk.decorator;

/**
 * 定义导航栏枚举
 */
public enum NavigateEnum {

    WENDA("问答",1),
    WENZHANG("文章",1),
    JINGPINKE("精品课",1),
    WORK("作业",2),
    TIKU("题库",2),
    CHENGZHANGQIANG("成长墙",2),
    MAOPAO("冒泡",1),
    SHOPPING("商城",1),
    VIP("VIP学员",2),
    CEPING("测评",3),
    ADMIN("管理员",3);

    private String navigateName;
    private int level;

    public int getLevel() {
        return level;
    }

    public String getNavigateName() {
        return navigateName;
    }
    NavigateEnum(String navigateName,int level){
        this.navigateName = navigateName;
        this.level = level;
    }

}
