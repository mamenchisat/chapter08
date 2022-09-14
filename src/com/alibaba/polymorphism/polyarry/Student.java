package com.alibaba.polymorphism.polyarry;

/**
 * 项目名：    charpter08
 * 文件名：    Student
 * 创建时间：   2022/8/21 20:47
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Student extends Person {


    private double score;

    public Student(int age, String name, double score) {
        super(age, name);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + " score= " + score;
    }

    public void study(){
        System.out.println("student "+getName()+" is studying");
    }
}
