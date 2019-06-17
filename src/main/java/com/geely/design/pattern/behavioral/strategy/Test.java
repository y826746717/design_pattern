package com.geely.design.pattern.behavioral.strategy;

/**
 *
 */
public class Test {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();

        //使用工厂模式+策略模式
        PromotionActivity activity = new PromotionActivity(PromotionFactory.createFactory("aaa"));
        activity.executePromotionStrategy();

    }
}
