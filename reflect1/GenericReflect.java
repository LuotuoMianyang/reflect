package com.qunar.reflect1;

import com.google.common.collect.Lists;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author liyonghui.li
 * @description
 * @create 2017-11-22 上午11:28
 */
public class GenericReflect {

     /*
         * 在编译器的时候，泛型会限制集合内元素类型保持一致，但是编译器结束进入
         * 运行期以后，泛型就不再起作用了，即使是不同类型的元素也可以插入集合。
         */

    public static void main(String[] args) {
        List listIntegers = Lists.newArrayList();
        List<String> listStrings = Lists.newArrayList();

        Class c1 = listIntegers.getClass();
        Class c2 = listStrings.getClass();

        System.out.println(c1 == c2);//相等，说明并不因为加了范型就不一致

        try {
            Method method = c2.getMethod("add", Object.class);
            method.invoke(listStrings, 10);//委托，实际执行为相应class执行
            System.out.println(listStrings.size());//长度增加
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
