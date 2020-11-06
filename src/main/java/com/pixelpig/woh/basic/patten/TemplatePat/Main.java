package com.pixelpig.woh.basic.patten.TemplatePat;

/**
 * Create by pixelpig
 * 2019/8/17
 */
public class Main {

    public static void main(String[] args) {
        StringDisplay stringDisplay = new StringDisplay("pixelpig");

        //父类变量保存之类示例, 可以无缝调用模板方法, 此处是里氏替换原则的体现.
        AbstractDistplay distplay = stringDisplay;

        //display()作为模板方法, 具体实现由抽象类的示例决定
        distplay.display();
    }

}
