package com.yangzk.parrent.prototype.shallow;

import lombok.Data;

import java.util.List;

/**
 * 学生类
 */
@Data
public class Student implements Cloneable{
    private String name;
    private Integer age;
    private List<String> hobbys;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbys=" + hobbys +
                '}';
    }
    //浅克隆
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
