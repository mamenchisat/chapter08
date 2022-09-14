package com.alibaba.polymorphism.objPoly;

/**
 * 项目名：    charpter08
 * 文件名：    PolyRunExample
 * 创建时间：   2022/8/21 11:56
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class PolyRunExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Cat cat1 = new Cat();
        animal.cry();
        dog.cry();
        cat.cry();
        System.out.println("=============");
        cat1.cry();
    }
}
