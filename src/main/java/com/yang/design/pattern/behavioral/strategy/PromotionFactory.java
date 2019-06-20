package com.yang.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {

    private static Map<String,PromotionStrategy> map = new HashMap<String,PromotionStrategy>();


    static{
        map.put(strategyKey.FAXIAN,new FanXianPromotionStrategy());
        map.put(strategyKey.LIJIAN,new LiJianPromotionStrategy());
        map.put(strategyKey.MANJIAN,new ManJianPromotionStrategy());
    }

    public static PromotionStrategy createFactory(String activityKey){
        PromotionStrategy strategy = map.get(activityKey);
        return strategy == null ? new EmptyPromotionStrategy():strategy;
    }

    private interface strategyKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FAXIAN = "FAXIAN";
    }

    public static void main(String[] args) {
        PromotionFactory factory = new PromotionFactory();
        createFactory("LIJIAN").doPromotion();
    }


}
