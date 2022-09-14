package com.alibaba.house_rent.house_view;

import com.alibaba.house_rent.house_entity.House;
import com.alibaba.house_rent.house_service.HouseService;
import com.alibaba.house_rent.house_utils.Utility;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 项目名：    chapter08
 * 文件名：    HouseView
 * 创建时间：   2022/8/23 17:07
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(2);


    public void listHouses() {
        System.out.println("--------------------------房屋列表-------------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-----------------------房屋列表显示完毕---------------------");
    }

    public void addHouse(){
        System.out.println("--------------------------添加房屋-------------------------");
        System.out.println("姓名:");
        String name = Utility.readString(8);
        System.out.println("电话:");
        String phone = Utility.readString(12);
        System.out.println("地址:");
        String address = Utility.readString(16);
        System.out.println("月租:");
        int rent = Utility.readInt();
        System.out.println("状态(未出租/已出租):");
        String state = Utility.readString(3);
        House house = new House(0, name, phone, address, rent, state);
        if(houseService.add(house)){
            System.out.println("---------------------添加房屋成功!------------------------");
        }else {
            System.out.println("---------------------添加房屋失败!------------------------");
        }
    }

    public void delHouse(){
        System.out.println("---------------------删除房屋失败------------------------");
        System.out.println("请输入要删除的房屋ID(-1退出):");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("---------------------已放弃删除------------------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if(houseService.delete(delId)){
                System.out.println("---------------------删除成功！------------------------");
            }
        }else {
            System.out.println("---------------------已放弃删除------------------------");
        }
    }

    public void findHouse(){
        System.out.println("---------------------查找房屋信息------------------------");
        System.out.println("请输入要查找的ID:");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println("--------------------查找的房屋信息如下--------------------");
            System.out.println(house);
        }else {
            System.out.println("--------------------查找的房屋ID不存在--------------------");
        }
    }

    public void modifyHouse(){
        System.out.println("---------------------修改房屋信息------------------------");
        System.out.println("请输入要修改的ID:");
        int modifyId = Utility.readInt();
        System.out.println("修改后的姓名:");
        String name = Utility.readString(8);
        System.out.println("修改后的电话:");
        String phone = Utility.readString(12);
        System.out.println("修改后的地址:");
        String address = Utility.readString(16);
        System.out.println("修改后的月租:");
        int rent = Utility.readInt();
        System.out.println("修改后的状态(未出租/已出租):");
        String state = Utility.readString(3);
        House house = new House(0, name, phone, address, rent, state);
        Boolean c = houseService.modifyHouseById(modifyId,house);
        if(c){
            System.out.println("已成功修改房屋信息!");
        }
    }

    public void mainMenu() {
        do {
            System.out.println("\n------------------------房屋租赁系统-----------------------");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退 出 系 统");
            System.out.println("请输入你的选择(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    modifyHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    char c = Utility.readConfirmSelection();
                    if (c == 'Y'){
                        loop =false;
                    }
                    break;
            }

        } while (loop);
    }
}
