package com.geely.design.pattern.behavioral.observer;

public class Test {

    public static void main(String[] args) {
        Course course  = new Course("java设计模式");
        Teacher teacher = new Teacher("阳老师");

        //添加一个观察者
        course.addObserver(teacher);

        //todo 业务逻辑代码
        Question question = new Question();
        question.setUserName("菜鸡");
        question.setQuestionContent("你为什么这么菜？");
        course.produceQuestion(course,question);
        //
    }
}
