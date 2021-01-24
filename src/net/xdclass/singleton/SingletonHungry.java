package net.xdclass.singleton;

import java.awt.*;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description: 创建型-单例模式-饿汉模式
 * @date ......: 2021-01-24
 */
public class SingletonHungry {

    /** step01 私有化单例对象：并且在类加载的时候初始化实例 */
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {}

    /** step01 提供供外部访问实例对象的方法 */
    public static SingletonHungry getInstance() {
        return instance;
    }

    public void process() {
        System.out.println(System.currentTimeMillis());
    }

}
