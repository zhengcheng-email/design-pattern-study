package com.zc.study.design.pattern.create.simplefactory;


import com.zc.study.design.pattern.create.Product;

/**
 * 简单工厂客户端
 *
 * @author Daniel Zheng
 * @create 2018-10-14 下午1:32
 **/
public class SimpleFactoryClient {

    private Product product;

    public void doSomething(){

        this.product = ProductFactory.createProduct("A");

        System.out.println(this.product.name());

    }

    public static void main(String... args){

        new SimpleFactoryClient().doSomething();

    }

}
