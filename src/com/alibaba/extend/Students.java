package com.alibaba.extend;

/**
 * 项目名：    charpter08
 * 文件名：    Students
 * 创建时间：   2022/8/21 9:34
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Students {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo() {
        System.out.println("学生名字 " + name + " 年龄 " + age + " 成绩 " + score);
    }
}
