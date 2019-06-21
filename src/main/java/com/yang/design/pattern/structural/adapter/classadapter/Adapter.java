package com.yang.design.pattern.structural.adapter.classadapter;

/**
 *  适配者
 */
public class Adapter extends Adaptee implements Target{
    @Override
    //这样通过Adapter把适配者的方法适配给了被适配者（target）
    public void request() {
        super.adapteeRequest();
        //...
    }
}
