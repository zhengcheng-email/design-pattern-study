package com.zc.study.design.pattern.create.singlegon;

/**
 * 通过Java枚举实现单例模式
 *
 * @author Daniel Zheng
 * @create 2018-10-12 下午11:40
 **/
public enum SinglegonWithEnum implements Singleton{

    /**
     * 单例对象
     */
    INSTANCE;


    public void action(){

        System.out.println("单例的一个方法");

    }
}
