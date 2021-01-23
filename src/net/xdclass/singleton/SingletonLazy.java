package net.xdclass.singleton;

import java.util.UUID;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description: 单例懒加载模式
 * @date ......: 2021-01-23
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {

    }

    public void process() {
        System.out.println(UUID.randomUUID().toString());
    }

    /**
     * 第一种方式：存在线程安全
     * 如果不存在实例就创建，如果已经存在实例就直接返回
     * @return
     */
    public static SingletonLazy getInstanceMethod01() {
        if (null == instance) {
            instance = new SingletonLazy();
        }

        return instance;
    }

    /**
     * 对方法加锁
     * 第二种方式：此方法依然存在线程安全
     * @return
     */
    public static synchronized SingletonLazy getInstanceMethod02() {
        return null == instance ? new SingletonLazy() : instance;
    }

    /**
     * 减小加锁的颗粒度
     * 第3种方式，开销太大
     * @return
     */
    public static SingletonLazy getInstance() {
        if (null == instance) {
            synchronized (SingletonLazy.class) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}
