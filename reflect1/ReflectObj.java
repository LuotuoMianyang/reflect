package com.qunar.reflect1;

import com.qunar.reflect1.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author liyonghui.li
 * @description
 * @create 2017-11-21 下午9:26
 */
public class ReflectObj {

    public static void main(String[] args) {
        Class clazz = null;
        try {
            //此方式一般用于new具有构造函数的实例
            clazz = Class.forName("com.qunar.reflect1.User");
            Constructor c = clazz.getConstructor(int.class, String.class);
            User user1 = (User) c.newInstance(12, "YH");

            //一般new无参构造函数的实例
            User user2 = (User) clazz.newInstance();
            user2.setAge(15);
            user2.setName("YH");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
