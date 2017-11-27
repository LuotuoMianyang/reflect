package com.qunar.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liyonghui.li
 * @description
 * @create 2017-11-27 下午5:46
 */
public class TestStudentWithReflect {


    private static void constructStudent() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.qunar.reflect.Student");
        Constructor constructor = c.getConstructor(int.class, String.class, String.class, int.class);
        Student student = (Student) constructor.newInstance(12, "LYH", "030", 16);
        System.out.println(student);

        //获取私有方法
        Method say= c.getDeclaredMethod("saySth", String.class);
        say.setAccessible(true);
        say.invoke(student, "invoker?");

        //访问私有变量用Class.getDeclaredField(String name)或者Class.getDeclaredFields()方法

        //获取全部共有的方法
        Method[] methods = c.getMethods();
        for(int i=0;i<methods.length;i++){
            System.out.println(methods[i]);
        }
    }

    public static void main(String[] args) {
        try {
            constructStudent();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
