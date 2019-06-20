package com.yang.design.pattern.behavioral.chainofresponsibility;

public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover =new VideoApprover();

        Course course = new Course();
        course.setCourseName("Java设计模式");
        course.setArticle("Java手记");
        course.setVideo("Java视频");

        //顺序交由客户端空指
        articleApprover.setNext(videoApprover);
        articleApprover.deployCourse(course);

    }

}
