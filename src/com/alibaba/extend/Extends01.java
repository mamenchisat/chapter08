package com.alibaba.extend;

/**
 * 项目名：    charpter08
 * 文件名：    Extends01
 * 创建时间：   2022/8/21 9:18
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name="mike";
        pupil.age=13;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();
        System.out.println("===========================");
        Graduate graduate = new Graduate();
        graduate.name="monkey";
        graduate.age=19;
        graduate.testing();
        graduate.setScore(61);
        graduate.showInfo();
    }
}
