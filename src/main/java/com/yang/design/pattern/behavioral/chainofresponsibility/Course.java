package com.yang.design.pattern.behavioral.chainofresponsibility;

public class Course {

    private String courseName;

    private String article;

    private String video;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", article='" + article + '\'' +
                ", video='" + video + '\'' +
                '}';
    }
}
