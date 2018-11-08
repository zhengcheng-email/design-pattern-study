package com.zc.study.design.pattern.create.factory;

/**
 * 工厂模式客户端
 *
 * @author Daniel Zheng
 * @create 2018-10-23 下午10:02
 **/
public class FactoryClient {

    public ProductFactory factory;

    public FactoryClient(ProductFactory factory) {
        this.factory = factory;
    }

    private void doSomething() {

        System.out.println(factory.create().name());

    }

    public static void main(String... args) {

        new FactoryClient(new ProductAFactoryImpl()).doSomething();

    }

}
