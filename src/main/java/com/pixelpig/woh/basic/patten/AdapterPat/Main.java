package com.pixelpig.woh.basic.patten.AdapterPat;

import java.io.IOException;

/**
 * Create by pixelpig
 * 2019/8/8
 */
public class Main {
    public static void main(String[] args) {
        /*
            以下A或者B的实例化都可以完成后面的功能,不过使用A可以表面着重使用FileIO
            这个接口的功能, 而不是引入具体的FileProperties实现类, 因为它有可能还
            具备其他的方法.
         */
        //A
        FileIO f = new FileProperties();
        //B
//        FileProperties f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2019");
            f.setValue("month", "8");
            f.setValue("day", "8");
            System.out.printf("Get name's value: " + f.getValue("name"));
            f.writeToFile("newFile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
