package com.pixelpig.woh.basic.patten.IteratorPat.pix;

/**
 * Create by pixelpig
 * 2019/8/5
 */
public class Bus {
    private String code;

    //construct for every bus's code
    public Bus(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Bus " + code ;
    }
}
