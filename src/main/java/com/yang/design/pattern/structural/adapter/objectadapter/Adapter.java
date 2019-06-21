package com.yang.design.pattern.structural.adapter.objectadapter;

/**
 * 适配者，与类适配器模式的最大不同
 */
public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
