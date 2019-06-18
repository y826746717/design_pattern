package com.geely.design.pattern.structural.proxy.staticproxy;

import com.geely.design.pattern.structural.proxy.Order;

/**
 *  1) 不适用静态代理，输出：
 *  Service层调用Dao层添加Order
 *  Dao层添加Order成功
 *
 *  2）使用静态代理，输出：
 *  静态代理分配到【db0】处理数据
 *  静态代理 before code
 *  Service层调用Dao层添加Order
 *  Dao层添加Order成功
 *  静态代理 after code
 *
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        //不使用静态代理
//        OrderServiceImpl impl  = new OrderServiceImpl();
//        impl.saveOrder(order);


        //使用静态代理的方式
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
