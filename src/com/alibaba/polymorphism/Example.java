package com.alibaba.polymorphism;

/**
 * 项目名：    charpter08
 * 文件名：    Example
 * 创建时间：   2022/8/21 11:24
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Example {
    public static void main(String[] args) {
        Master jeffy = new Master("jeffy");
        Animal cat = new Cat("tom");
        Animal dog = new Dog("hans");
        Bone bone= new Bone("骨头");
        Fish fish = new Fish("小黄鱼");
        Animal pig = new Animal("flowerPig");
        Food rice = new Food("米饭");
        jeffy.feed(cat,fish);
        jeffy.feed(dog,bone);
        jeffy.feed(pig,rice);
        Cat cat1 = (Cat) cat;
        ((Cat) cat).catchMouse();
        System.out.println("==========");
        cat1.catchMouse();
    }
}
