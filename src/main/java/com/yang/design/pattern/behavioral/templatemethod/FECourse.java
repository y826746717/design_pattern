package com.yang.design.pattern.behavioral.templatemethod;

/**
 *  写了构造器，是为了满足不同的前端课程，比如有的前端课程需要写手记
 *  而有的前端课程并不需要制作手机
 */
public class FECourse extends ACourse {
    private boolean needWriteArticleFlag = false;
    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    public FECourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    @Override
    protected boolean needWriteArticle() {
        return this.needWriteArticleFlag;
    }
}
