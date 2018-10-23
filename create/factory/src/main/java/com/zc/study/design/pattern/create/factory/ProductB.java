package com.zc.study.design.pattern.create.factory;

/**
 * 产品B
 *
 * @author Daniel Zheng
 * @create 2018-10-14 下午2:17
 **/
public class ProductB implements Product {
    @Override
    public String name() {
        return "我是产品B";
    }
}
