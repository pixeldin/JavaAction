package com.pixelpig.woh.basic.patten.FactoryPat.idcard;

import com.pixelpig.woh.basic.patten.FactoryPat.framework.Product;

/**
 * Create by pixelpig
 * 2019/8/17
 * 具体产品的行为
 */
public class IDCard extends Product {

    private String owner;

    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
