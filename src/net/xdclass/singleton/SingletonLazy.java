package net.xdclass.singleton;

import java.util.UUID;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description: 单例懒加载模式
 *                 DCL双重检测锁定 指令重排
 * @date ......: 2021-01-23
 */
public class SingletonLazy {

//    private static SingletonLazy instance;

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
    public static SingletonLazy getInstanceMethod03() {
        if (null == instance) {
            synchronized (SingletonLazy.class) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }

    /**
     * 双重检查锁定 Double-checked-locking DCL
     */
    public static SingletonLazy getInstanceMethod04() {
        // 第一重检测
        if (null == instance) {
            // 加锁
            synchronized (SingletonLazy.class) {
                // 第二重检测
                if (null == instance) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    /**
     * 指令重排：当在高并发的时候，会出现原子重排的情况
     * 比如，创建一个对应的顺序为1-2-3, 指令错乱的时候会是1-3-2,就出现了安全问题，可以通过在对象上添加volition关键字来解决这个问题
     * 1.分配空间给对象
     * 2.在空间内创建对象
     * 3.把对象赋值给引用
     */
    private static volatile SingletonLazy instance;
    public static SingletonLazy getInstance() {
        // 第一重检测
        if (null == instance) {
            // 对象加锁
            synchronized (SingletonLazy.class) {
                // 第二重检测
                if (null == instance) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

}
