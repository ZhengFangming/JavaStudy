package com.itheima.String;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ","[","]");
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj.toString());
    }
}
