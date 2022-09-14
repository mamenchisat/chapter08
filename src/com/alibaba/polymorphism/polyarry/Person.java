package com.alibaba.polymorphism.polyarry;

/**
 * 项目名：    charpter08
 * 文件名：    Person
 * 创建时间：   2022/8/21 20:43
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String say() {
        return "name= " + name + " age= " + age;
    }
}
