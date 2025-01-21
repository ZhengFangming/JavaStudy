package com.itheima.a01polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("zhangsan");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("建国");
        t.setAge(35);

        Admin a = new Admin();
        a.setName("管理员");
        a.setAge(55);

        register(s);
        register(t);
        register(a);

        t.working();

    }

    public static void register(Person p) {
        p.show();
    }
}
