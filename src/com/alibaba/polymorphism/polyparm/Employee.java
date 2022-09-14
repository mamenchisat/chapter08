package com.alibaba.polymorphism.polyparm;

/**
 * 项目名：    chapter08
 * 文件名：    Employee
 * 创建时间：   2022/8/21 21:25
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAnnual(){
        return 12 * salary;
    }
}
