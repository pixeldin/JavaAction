package com.pixelpig.woh.basic.Exp;

/**
 * Create by pixelpig
 * 2019/4/1
 */
public class ExpCatch {

    private static Integer a;

    public static void main(String[] args) {

        try {
            if (a == 1) {
                System.out.println("a is 1");
            }
            //won't go here if catch exp
            System.out.println("a looks well.");
        } catch (NullPointerException e) {
            System.out.println("a is null, catch exp: " + e);
        }

        System.out.println("Something else");

        ExpThrow et = new ExpThrow();
        try {
            et.TestThrowExp(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
