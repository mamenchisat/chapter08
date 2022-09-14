package com.alibaba.house_rent.house_service;

import com.alibaba.house_rent.house_entity.House;

/**
 * 项目名：    chapter08
 * 文件名：    HouseService
 * 创建时间：   2022/8/23 17:07
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class HouseService {
    private House[] houses;
    private int houseNums = 2;
    private int idCount = 2;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "112", "海淀区", 2000, "未出租");
        houses[1] = new House(2, "mark", "132", "海淀区", 3000, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        //判断是否可以继续添加
        if (houseNums == houses.length) {
            HouseService houseTemp = new HouseService(2 * houses.length);
            for (int i = 0; i < houseNums; i++) {
                houseTemp.houses[i] = houses[i];
            }
            newHouse.setId(++idCount);
            houseTemp.houses[houseNums++] = newHouse;
            houses = houseTemp.houses;
            return true;
        }
        idCount++;
        newHouse.setId(idCount);
        houses[houseNums] = newHouse;
        houseNums++;
        return true;
    }

    public boolean delete(int delId) {
        int index = -1;
        for (int i = 0; i < houses.length; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("没有找到该房屋!");
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[houseNums - 1] = null;
        houseNums--;
        return true;
    }

    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean modifyHouseById(int id, House house) {
        if (id > houseNums || id <= 0){
            System.out.println("查找失败！请输入正确的房屋ID");
            return false;
        }
        houses[id-1].setAddress(house.getAddress());
        houses[id-1].setPhone(house.getPhone());
        houses[id-1].setName(house.getName());
        houses[id-1].setRent(house.getRent());
        houses[id-1].setState(house.getState());
        return true;
    }

}
