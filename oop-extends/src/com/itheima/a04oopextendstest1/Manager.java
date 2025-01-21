package com.itheima.a04oopextendstest1;

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    @Override
    public void work(){
        System.out.println("管理其他人");
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    /**
     * 获取
     * @return bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * 设置
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String toString() {
        return "Manager{bonus = " + bonus + "}";
    }
}
