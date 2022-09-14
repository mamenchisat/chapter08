package com.alibaba.polymorphism.polyparm;

/**
 * 项目名：    chapter08
 * 文件名：    Worker
 * 创建时间：   2022/8/21 21:40
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Worker extends Employee {

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work(){
        System.out.println("Worker " + getName() + " is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
