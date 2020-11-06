package com.pixelpig.woh.basic.patten.TemplatePat;

/**
 * Create by pixelpig
 * 2019/8/17
 */
public class CharDisplay extends AbstractDistplay{
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
