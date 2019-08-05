package com.pixelpig.woh.basic.Exp;

/**
 * Create by pixelpig
 * 2019/4/2
 */
public class ExpThrow {
    public void TestThrowExp(boolean th) throws Exception {
        if (th) {
//            try {
                throw new Exception();
//            } finally {
//                System.out.printf("No catch, but finally run.");
//            }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        }
        //Won't run here if throws Exp before
        System.out.println("Something after throw in ExpThrow, without finally block.");
    }
}
