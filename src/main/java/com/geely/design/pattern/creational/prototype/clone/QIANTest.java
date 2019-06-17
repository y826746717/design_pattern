package com.geely.design.pattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * 浅克隆
 */
public class QIANTest {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        QIANPig pig1 = new QIANPig("佩奇",birthday);
        QIANPig pig2 = (QIANPig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        /**
         *
         * 运行出这样的结果：
         * Pig{name='佩奇', birthday=Thu Jan 01 08:00:00 CST 1970}com.geely.design.pattern.creational.prototype.clone.Pig@34c45dca
         * Pig{name='佩奇', birthday=Thu Jan 01 08:00:00 CST 1970}com.geely.design.pattern.creational.prototype.clone.Pig@52cc8049
         * 说明这是两个对象
         */

        pig1.getBirthday().setTime(666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);

//        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
//        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
//        method.setAccessible(true);
//        HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
//        System.out.println(hungrySingleton);
//        System.out.println(cloneHungrySingleton);



    }
}
