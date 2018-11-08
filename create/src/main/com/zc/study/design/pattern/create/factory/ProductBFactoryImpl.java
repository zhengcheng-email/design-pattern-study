package com.zc.study.design.pattern.create.factory;

import com.zc.study.design.pattern.create.Product;
import com.zc.study.design.pattern.create.ProductB;

/**
 * 产品B工厂
 *
 * @author Daniel Zheng
 * @create 2018-10-23 下午10:06
 **/
public class ProductBFactoryImpl implements ProductFactory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
