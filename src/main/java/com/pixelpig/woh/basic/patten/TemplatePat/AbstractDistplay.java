package com.pixelpig.woh.basic.patten.TemplatePat;

/**
 * Create by pixelpig
 * 2019/8/17
 * Template Pattern
 * 模板模式:
 * 1. 通用操作保留在父类
 * 2. 具体实现可替换由子类覆写, 做到里氏替换
 */
public abstract class AbstractDistplay {
    //由子类实现
    public abstract void open();

    public abstract void print();

    public abstract void close();

    /*
        display()作为模板方法, 具体实现由抽象类的示例决定
        通用模板自己实现,不可覆写
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
