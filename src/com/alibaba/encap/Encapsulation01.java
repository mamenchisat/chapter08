package com.alibaba.encap;

import org.omg.Messaging.SyncScopeHelper;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.sql.SQLOutput;

/**
 * 项目名：    charpter08
 * 文件名：    Encapsulation01
 * 创建时间：   2022/8/20 20:48
 *
 * @author crazy Chen
 * 描述：   /*
 * 那么在 java 中如何实现这种类似的控制呢?
 * 请大家看一个小程序(com.hspedu.encap: Encapsulation01.java), 不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认
 * 年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间
 * *   TODO
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("sam", 854, 9000);
//        person.setName("jack");
//        person.setAge(125);
//        person.setSalary(3000);
        System.out.println(person.info());
    }
}

class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, int salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setAge(age);
        setName(name);
        setSalary(salary);
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("mingziguochang");
        }
    }

    public void setAge(int age) {
        if (age <= 120) {
            this.age = age;
        } else {
            System.out.println("错误的年龄,已设置为默认值18");
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String info() {
        return "信息为 name= " + this.name + "age= " + this.age + "salary= " + this.salary;
    }
}