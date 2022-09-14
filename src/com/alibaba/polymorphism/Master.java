package com.alibaba.polymorphism;

/**
 * 项目名：    charpter08
 * 文件名：    Master
 * 创建时间：   2022/8/21 11:23
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }

    //多态机制统一管理喂食
    public void feed(Animal animal, Food food) {
        System.out.println("主人 " + name + " 给 " + animal.getName() + " 喂 " + food.getName());
    }
}
