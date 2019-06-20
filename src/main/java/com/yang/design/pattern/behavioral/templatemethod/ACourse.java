package com.yang.design.pattern.behavioral.templatemethod;

/**
 *  必须是抽象类
 */
public abstract class ACourse {

    protected final void makeCourse(){
        this.makePPT();
        this.makeVideo();
        //写手记并不是一个必须的方法，完全可以由子类决定（就是说子类的实现也就是模板方法的核心：
        // 抽离出相同的步骤，将可变的部分（可选的部分）变为由子类实现），所以可以用钩子方法。
        if(needWriteArticle()){
            this.writeArticle();
        }
        this.packageCourse();
    }

    //模板方法里面的固定流程，所有子类都要有的功能，所以声明成final的
    //一共有俩个方法： makePPT 和 makeVideo
    final void makePPT(){
        System.out.println("制作PPT");
    }
    final void makeVideo(){
        System.out.println("制作视频");
    }
    //
    final void writeArticle(){
        System.out.println("编写手记");
    }
    //钩子方法
    protected boolean needWriteArticle(){
        return false;
    }
    abstract void packageCourse();





}
