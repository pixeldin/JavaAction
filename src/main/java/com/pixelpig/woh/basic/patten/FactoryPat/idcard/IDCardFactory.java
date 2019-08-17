package com.pixelpig.woh.basic.patten.FactoryPat.idcard;

import com.pixelpig.woh.basic.patten.FactoryPat.framework.Factory;
import com.pixelpig.woh.basic.patten.FactoryPat.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by pixelpig
 * 2019/8/17
 */
public class IDCardFactory extends Factory {

    List IDNum = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        IDNum.add(((IDCard) product).getOwner());
    }

    public List getIDNum() {
        return IDNum;
    }
}
