package com.yangzk.parrent.prototype.deep;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.setName("Zhang3");
            student.setAge(18);
            List<String> hobbys = new ArrayList<>();
            hobbys.add("看电影");
            hobbys.add("打游戏");
            student.setHobbys(hobbys);
           // Student cloneStudent = (Student)student.deepClone();
            Student cloneStudent = (Student) student.jsonClone();
            cloneStudent.getHobbys().add("刷微信");
            System.out.println("原始对象："+student);
            System.out.println("克隆对象："+cloneStudent);
            System.out.println("比较对象是否相同："+(student==cloneStudent));
            System.out.println("比较对象中的集合对象是否是同一个："+(student.getHobbys()==cloneStudent.getHobbys()));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
