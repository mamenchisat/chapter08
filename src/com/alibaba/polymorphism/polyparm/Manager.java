package com.alibaba.polymorphism.polyparm;

/**
 * 项目名：    chapter08
 * 文件名：    Manager
 * 创建时间：   2022/8/21 21:44
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage(){
        System.out.println("manager " + getName() + " is managing");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
