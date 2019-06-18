package com.geely.design.pattern.structural.proxy.dynamicproxy;

import com.geely.design.pattern.structural.proxy.Order;
import com.geely.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by geely
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    // target ; 目标对象，通过构造器注入的
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        // cls ： 目标类的class
        Class cls = target.getClass();

        //这句话表示把被代理对象直接返回！
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }




    @Override
    // method : 要被增强的方法对象
    // args：具体的method的参数
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj){
        int userId = 0;
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
