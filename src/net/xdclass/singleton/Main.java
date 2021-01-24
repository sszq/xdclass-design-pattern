package net.xdclass.singleton;

import net.xdclass.singleton.SingletonHungry;
import net.xdclass.singleton.SingletonLazy;

public class Main {

    public static void main(String[] args) {

        // 单例模式-懒汉模式
//        SingletonLazy.getInstance().process();
        // 单例模式-饿汉模式
        SingletonHungry.getInstance().process();
    }
}
