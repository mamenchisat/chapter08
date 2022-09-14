package com.alibaba.object_;

/**
 * 项目名：    chapter08
 * 文件名：    Finalize_
 * 创建时间：   2022/8/22 17:19
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马1000");
        //这时car对象就是一个垃圾，这时垃圾回收器就会回收对象，在回收前会调用该对象的finalize方法
        //程序员就可以在 finalize 中写自己的业务逻辑代码（比如释放资源：数据库连接，或者打开文件）
        bmw =null;
        System.gc();
        System.out.println("程序运行结束~");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁 汽车"+ name);
        System.out.println("释放了一些资源~");
        //super.finalize();
    }
}
