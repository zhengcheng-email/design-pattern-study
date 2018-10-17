package com.zc.study.design.pattern.create.simple.factory;

/**
 * 简单工厂
 *
 * @author Daniel Zheng
 * @create 2018-10-14 下午1:22
 **/
public class ProductFactory {

    public static Product createProduct(String type){


        Product product = null;

        if("A".equals(type)){
            product = new ProductA();
        }else if("B".equals(type)){
            product = new ProductB();
        }

        return product;

    }

}
