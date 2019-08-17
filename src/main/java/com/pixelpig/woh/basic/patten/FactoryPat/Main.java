package com.pixelpig.woh.basic.patten.FactoryPat;

import com.pixelpig.woh.basic.patten.FactoryPat.framework.Factory;
import com.pixelpig.woh.basic.patten.FactoryPat.framework.Product;
import com.pixelpig.woh.basic.patten.FactoryPat.idcard.IDCardFactory;

/**
 * Create by pixelpig
 * 2019/8/17
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product mike = factory.create("Mike");
        Product pixel = factory.create("Pixel");
        Product jack = factory.create("Jack");

        System.out.println("--------------");
        mike.use();
        pixel.use();
        jack.use();
    }
}
