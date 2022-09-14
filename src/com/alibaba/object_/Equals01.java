package com.alibaba.object_;

/**
 * 项目名：    chapter08
 * 文件名：    Equals01
 * 创建时间：   2022/8/22 15:15
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Equals01 {
    public static void main(String[] args) {
//        A a = new A();
//        A b = a;
//        A c = b;
//        B obj = a;
//        System.out.println(a == b);
//        System.out.println(b == c);
//        System.out.println(a==obj);
        int num1 = 10;
        double num2 =10.0;
        //equals方法
        "hello".equals("abc");
        System.out.println(num1 == num2);
        System.out.println("===============");
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1==integer2);
    }
}

class A extends B {

}
class B{

}
