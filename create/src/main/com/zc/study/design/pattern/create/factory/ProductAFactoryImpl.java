package com.zc.study.design.pattern.create.factory;

import com.zc.study.design.pattern.create.Product;
import com.zc.study.design.pattern.create.ProductA;

/**
 * 产品A工厂
 *
 * @author Daniel Zheng
 * @create 2018-10-23 下午10:04
 **/
public class ProductAFactoryImpl implements ProductFactory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
