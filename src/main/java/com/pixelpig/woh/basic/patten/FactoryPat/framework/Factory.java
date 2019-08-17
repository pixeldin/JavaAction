package com.pixelpig.woh.basic.patten.FactoryPat.framework;

/**
 * Create by pixelpig
 * 2019/8/17
 * 基于模板模式的工厂, 职责: 生产+注册
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    //抽象方法由子类去实现,模板负责规范
    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
