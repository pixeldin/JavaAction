package com.pixelpig.woh.basic.patten.FactoryPat.idcard;

import com.pixelpig.woh.basic.patten.FactoryPat.framework.Product;

import java.util.HashMap;

/**
 * Create by pixelpig
 * 2019/8/17
 * 具体产品的行为
 */
public class IDCard extends Product {

    private Integer serNum;
    private String owner;
    //成员序列号映射
//    private HashMap<String,Integer> serOwn = new HashMap<>();

    public IDCard(String owner, Integer serial) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
        this.serNum = serial;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡, 序列号:"
                + serNum);
    }

    public String getOwner() {
        return owner;
    }

    public Integer getSerNum() {
        return serNum;
    }
}
