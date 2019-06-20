package com.yang.design.pattern.behavioral.strategy;

public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有促销活动");
    }
}
