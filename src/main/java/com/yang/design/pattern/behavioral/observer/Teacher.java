package com.yang.design.pattern.behavioral.observer;


import java.util.Observable;
import java.util.Observer;

/**
 *  对于讲师来说，观察的是课程，而不是问题。问题是属于课程的，这个比较好理解；
 *  观察者：讲师，teacher
 *  被观察者，主题对象：课程，couser
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course couse = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName+"的"+couse.getCourseName()+"课程接收到一个"+
                question.getUserName()+"提交的问答："+question.getQuestionContent());
    }
}
