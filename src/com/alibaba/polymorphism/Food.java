package com.alibaba.polymorphism;

/**
 * 项目名：    charpter08
 * 文件名：    Food
 * 创建时间：   2022/8/21 11:23
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Food {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Food(String name) {
        this.name = name;
    }
}
