package com.alibaba.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 项目名：    chapter08
 * 文件名：    SmallChangeSysOOP
 * 创建时间：   2022/8/23 16:25
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class SmallChangeSysOOP {
    boolean loop = true;
    String details = "------------------零钱通明细------------------";
    Scanner scanner = new Scanner(System.in);
    String key = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";

    public void mainMenu() {
        do {
            System.out.println("\n======选择零钱通菜单======");
            System.out.println("\t1.零钱通明细");
            System.out.println("\t2.收益入账");
            System.out.println("\t3.消费");
            System.out.println("\t4.退     出");
            System.out.println("请选择(1-4):  ");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误！");
            }
        } while (loop);
    }

    public void detail() {
        System.out.println("零钱通明细");
        System.out.println("--------------------");
        System.out.println(details);
    }

    public void income() {
        System.out.println("输入收益入账金额：");
        money = scanner.nextDouble();
        if (money < 0) {
            System.out.println("金额范围 需要 大于 0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println("--------------------");
        System.out.println(details);
    }

    public void pay() {
        System.out.println("输入消费金额：");
        money = scanner.nextDouble();
        if (money < 0 || money > balance) {
            System.out.println("金额范围 需要在0—" + balance);
            return;
        }
        balance -= money;
        System.out.println("消费说明：");
        note = scanner.next();
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
        System.out.println("--------------------");
        System.out.println(details);
    }

    public void exit() {
        System.out.println("4. 退     出");
        String choice = "";
        while (true) {
            System.out.println("确定要退出吗?  y/n");
            choice = scanner.next();
            if (choice.equals("y") || choice.equals("n")) {
                break;
            }
        }
        if (choice.equals("y")) {
            //System.out.println(choice=="y");
            loop = false;
        }
    }
}
