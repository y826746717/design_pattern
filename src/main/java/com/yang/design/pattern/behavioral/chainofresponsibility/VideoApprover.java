package com.yang.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void deployCourse(Course course) {
        if(StringUtils.isNotBlank(course.getVideo())){
            System.out.println(course.getCourseName()+"含有视频，批准！");
            if(approver!=null){
                approver.deployCourse(course);
            }
        }else {
            System.out.println(course.getCourseName()+"不包含视频，不批准，流程结束！");
            return;
        }
    }
}
