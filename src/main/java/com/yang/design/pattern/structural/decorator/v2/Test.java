package com.yang.design.pattern.structural.decorator.v2;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
    //aa git
        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

    }
}
