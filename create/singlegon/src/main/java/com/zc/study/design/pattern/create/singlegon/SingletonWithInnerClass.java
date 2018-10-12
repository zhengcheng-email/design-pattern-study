package com.zc.study.design.pattern.create.singlegon;

/**
 * 使用内部类实现单例模式
 *
 * @author Daniel Zheng
 * @create 2018-10-12 下午11:42
 **/
public class SingletonWithInnerClass implements Singleton {

    /**
     * 获取对象
     * @return
     */
    public static SingletonWithInnerClass getInstance(){

        return SingletonHolder.INSTANCE;

    }


    public void action(){

        System.out.println("单例的一个方法");

    }


    /**
     * 持有单例对象的内部类
     */
    private static class SingletonHolder {

        private final static SingletonWithInnerClass INSTANCE = new SingletonWithInnerClass();

    }
}
