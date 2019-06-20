package com.yang.design.pattern.structural.proxy.dynamicproxy;

import com.yang.design.pattern.structural.proxy.IOrderService;
import com.yang.design.pattern.structural.proxy.Order;
import com.yang.design.pattern.structural.proxy.OrderServiceImpl;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        //参数是代理类，在OrderServiceDynamicProxy类中的bind方法的语句：
        // return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this); 中
        //直接返回
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
