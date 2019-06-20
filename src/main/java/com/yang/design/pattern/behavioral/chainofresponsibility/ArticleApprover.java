package com.yang.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class ArticleApprover extends  Approver {

    @Override
    public void deployCourse(Course course) {
        if(StringUtils.isNotBlank(course.getArticle())){
            System.out.println(course.getCourseName()+"含有手记，批准！");
            if(approver!=null){
                approver.deployCourse(course);
            }
        }else {
            System.out.println(course.getCourseName()+"不包含手记，不批准，流程结束！");
            return;
        }
    }
}
