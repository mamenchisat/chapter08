package com.alibaba.polymorphism;

/**
 * 项目名：    charpter08
 * 文件名：    Cat
 * 创建时间：   2022/8/21 11:30
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }
    public void catchMouse(){
        System.out.println( getName() +" 抓老鼠~ ");
    }
}
