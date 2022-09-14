package com.alibaba.tostring;

/**
 * 项目名：    chapter08
 * 文件名：    toString
 * 创建时间：   2022/8/22 16:28
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class toString {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "巡山的", 3000.0);
        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;
    private double salary;

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
}