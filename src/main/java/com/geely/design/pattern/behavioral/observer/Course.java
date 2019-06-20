package com.geely.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * Observable: 可观察的，继承后成为被观察对象。
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public void produceQuestion(Course couse,Question question){
        System.out.println(question.getUserName()+"在"+couse.getCourseName()+"提出了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
