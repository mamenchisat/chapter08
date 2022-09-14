package com.alibaba.polymorphism.polyarry;

/**
 * 项目名：    charpter08
 * 文件名：    Teacher
 * 创建时间：   2022/8/21 20:49
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Teacher extends Person {
    private double salary;

    public Teacher(int age, String name, double salary) {
        super(age, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " salary " + salary;
    }
    public void teach(){
        System.out.println("teacher "+getName()+" is teaching~");
    }
}
