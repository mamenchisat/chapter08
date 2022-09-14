package com.alibaba.polymorphism;

/**
 * 项目名：    charpter08
 * 文件名：    Animal
 * 创建时间：   2022/8/21 11:23
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Animal {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
