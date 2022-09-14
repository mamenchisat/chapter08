package com.alibaba.polymorphism.polyparm;

/**
 * 项目名：    charpter08
 * 文件名：    PolyParm
 * 创建时间：   2022/8/21 21:25
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class PolyParm {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 3000);
        Manager jeffy = new Manager("jeffy",6000,20000);
        PolyParm polyParm = new PolyParm();
        polyParm.showEmpAnnual(tom);
        polyParm.showEmpAnnual(jeffy);
        polyParm.testWork(tom);
        polyParm.testWork(jeffy);
    }

    public void showEmpAnnual(Employee employee){
        System.out.println(employee.getAnnual());
    }

    public void testWork(Employee employee){
        if(employee instanceof Worker){
            ((Worker) employee).work();
        }else if (employee instanceof Manager){
            ((Manager) employee).manage();
        }else {
            System.out.println("wrong");
        }
    }
}
