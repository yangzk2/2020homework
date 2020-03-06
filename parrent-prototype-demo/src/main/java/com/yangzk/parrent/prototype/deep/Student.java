package com.yangzk.parrent.prototype.deep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.io.*;
import java.util.*;

/**
 * 学生类
 */
@Data
public class Student implements Cloneable, Serializable {
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
    //json方式实现深度克隆
    protected Object jsonClone(){
        try {
            JSONObject jsonObject = JSONObject.parseObject(JSON.toJSONString(this));
           return JSONObject.toJavaObject((JSON) jsonObject,this.getClass());
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //序列化方式深克隆
    protected  Object deepClone(){
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }

}
