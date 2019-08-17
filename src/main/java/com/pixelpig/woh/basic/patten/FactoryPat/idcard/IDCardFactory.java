package com.pixelpig.woh.basic.patten.FactoryPat.idcard;

import com.pixelpig.woh.basic.patten.FactoryPat.framework.Factory;
import com.pixelpig.woh.basic.patten.FactoryPat.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Create by pixelpig
 * 2019/8/17
 */
public class IDCardFactory extends Factory {

//    List IDNum = new ArrayList<>();
    HashMap<Integer, String> idMap = new HashMap<>();

    //名片工厂起始ID
    private Integer basicNum = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, basicNum++);
    }

    @Override
    protected void registerProduct(Product product) {
//        IDNum.add(((IDCard) product).getOwner());
        IDCard idCard = (IDCard) product;
        idMap.put(idCard.getSerNum(), idCard.getOwner());
    }

    public HashMap<Integer, String> getIdMap() {
        return idMap;
    }
}
