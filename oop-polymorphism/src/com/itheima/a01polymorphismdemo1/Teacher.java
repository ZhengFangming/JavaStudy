package com.itheima.a01polymorphismdemo1;

public class Teacher extends Person implements work{
    @Override
    public void show(){
        System.out.println("老师的信息为: " + getName() + ", " + getAge());
    }

    @Override
    public void working() {
        System.out.println("老师正在工作");
    }
}
