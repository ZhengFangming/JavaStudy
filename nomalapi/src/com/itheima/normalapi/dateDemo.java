package com.itheima.normalapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(str);
        System.out.println(date);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = sdf2.format(date);
        System.out.println(format);
    }
}
