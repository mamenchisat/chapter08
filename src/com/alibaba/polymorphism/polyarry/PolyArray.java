package com.alibaba.polymorphism.polyarry;

/**
 * 项目名：    charpter08
 * 文件名：    PolyArray
 * 创建时间：   2022/8/21 20:43
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class PolyArray {
    public static void main(String[] args) {
        //2个student对象和两个teacher对象，统一用一个数组接收，并调用每个对象的say方法
        Person[] persons = new Person[5];
        persons[0] = new Student(20, "mike", 59);
        persons[1] = new Student(19, "jeffy", 38);
        persons[2] = new Teacher(21, "jack", 1800);
        persons[3] = new Teacher(16, "mary", 2000);
        persons[4] = new Person(16, "pike");

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {
                ((Student) persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                ((Teacher) persons[i]).teach();
            } else if (persons[i] instanceof Person) {

            } else {
                System.out.println("wrong type");
            }
        }
    }
}
