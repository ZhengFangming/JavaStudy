package com.itheima.a04oopextendstest1;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("heima001","zhangsan",12999.99,25000);
        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.eat();
        m.work();
        System.out.println();

        Chief c = new Chief("heima002","lisi",1500.00);
        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.eat();
        c.work();
    }
}
