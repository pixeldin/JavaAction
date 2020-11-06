package com.pixelpig.woh.basic.alg;

import com.pixelpig.woh.basic.utils.StdIn;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Create by pixeldin
 * 2020/11/6
 */
public class Evaluate {
    public void localTest() {
        double dv = 2 + 3 * 5;
        System.out.println(dv);
    }

    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        List<String> opt = new ArrayList<>();
        // {"+", "-", "*", "/", "sqrt"}
        opt.add("+");
        opt.add("-");
        opt.add("*");
        opt.add("/");
        opt.add("sqrt");

        String input = StdIn.readString();
        for(int i=0;i < input.length();i++) {
            String s = input.substring(i,i+1);
            if (s.equals("(")) {
                // do nothing
            } else if (opt.contains(s)) {
                ops.push(s);
            } else if (s.equals(")")) {
                // 遇到右括号则拿出来算
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                }
                vals.push(v);
            } else {
                // val 压入值栈
                vals.push(Double.parseDouble(s));
            }
        }
        System.out.println(vals.pop());
    }
}