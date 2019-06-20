package com.yang.design.pattern.behavioral.chainofresponsibility;

/**
 * 批准者
 */
public abstract class Approver {

    //关键步骤： 必须包含一个自己，要声明一个自己类型的对象。
    protected  Approver approver;

    //设置下一个处理人
    public void setNext(Approver approver){
        this.approver = approver;
    }

    //发布课程
    public abstract void deployCourse(Course course);
}
