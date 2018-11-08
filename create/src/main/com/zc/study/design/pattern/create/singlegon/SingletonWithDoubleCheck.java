package com.zc.study.design.pattern.create.singlegon;

/**
 * 双重检查实现的线程安全的单例模式
 *
 * @author Daniel Zheng
 * @create 2018-10-14 上午9:12
 **/
public class SingletonWithDoubleCheck {


    private static SingletonWithDoubleCheck instance;

    public static SingletonWithDoubleCheck getInstance(){

        //乐观思维
        if(instance == null){
            //没有被实例化，加锁实例化对象
            synchronized (SingletonWithDoubleCheck.class){

                if(instance == null){

                    instance = new SingletonWithDoubleCheck();

                }

            }

        }

        return instance;

    }

    /**
     * 私有构造器
     */
    private SingletonWithDoubleCheck(){
    }

}
