package com.pixelpig.woh.basic.Enum;

import java.util.Scanner;

/**
 * Create by pixelpig
 * 2019/8/25
 */
public class EnumTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size:");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("Size= " + size);
        System.out.println("abb=" + size.getAbb());
        System.out.println("code= " + size.getCode());
    }
}

enum Size {
    SMALL("S", 0), MEDIUM("M", 1), LARGE("L", 2);

    private String abb;
    private int code;

    Size(String abb, int code) {
        this.abb = abb;
        this.code = code;
    }

    public String getAbb() {
        return abb;
    }

    public int getCode() {
        return code;
    }
}
