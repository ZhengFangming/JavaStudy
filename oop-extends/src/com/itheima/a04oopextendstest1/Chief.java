package com.itheima.a04oopextendstest1;

public class Chief extends Employee {

    public Chief() {
    }

    public Chief(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("炒菜");
    }



    public String toString() {
        return "Chief{}";
    }
}
