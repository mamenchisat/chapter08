package com.alibaba.object_;


/**
 * 项目名：    chapter08
 * 文件名：    EqualsExercise
 * 创建时间：   2022/8/22 15:58
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class EqualsExercise {
    public static void main(String[] args) {
        person person1 = new person("mary", 8, '女');
        person person2 = new person("mary", 8, '女');
        System.out.println(person1.equals(person2));
    }
}

class person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private String name;
    private int age;
    private char gender;

    @Override
    public boolean equals(Object obj) {
        //如果两个对象是同一个
        if (this == obj) {
            return true;
        }
        if (obj instanceof person) {
            //进行向下转型
            person p = (person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}
