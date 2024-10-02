package test;

public class Test4 {
    //需求：使用方法重载的思想，设计比较两个整数是否相同的方法
    //要求：兼容全整数类型（byte，short，int，long）

    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;
        compare(a,b);

    }
    public static void compare(int a, int b) {
        System.out.println("int");
        System.out.println(a == b);
    }
    public static void compare(byte a, byte b) {
        System.out.println("byte");
        System.out.println(a == b);
    }
    public static void compare(short a, short b) {
        System.out.println("short");
        System.out.println(a == b);
    }
    public static void compare(long a, long b) {
        System.out.println("long");
        System.out.println(a == b);
    }

}
