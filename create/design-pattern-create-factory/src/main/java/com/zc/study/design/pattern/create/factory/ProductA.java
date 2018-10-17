package com.zc.study.design.pattern.create.factory;

/**
 * 产品A
 *
 * @author Daniel Zheng
 * @create 2018-10-14 下午2:16
 **/
public class ProductA implements Product{
    @Override
    public String name() {
        return "我是产品A";
    }
}
