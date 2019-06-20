package com.yang.design.pattern.creational.prototype.clone;

import com.yang.design.pattern.creational.singleton.HungrySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("佩奇",birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig1.getBirthday().setTime(666666666666L);
//
//        System.out.println(pig1);
//        System.out.println(pig2);

        //面试题：怎么破坏一个单例模式？
        //答： 使用clone可以进行破坏！



        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        //设置权限
        method.setAccessible(true);
        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingleton);
        System.out.println(cloneHungrySingleton);

    }
}
