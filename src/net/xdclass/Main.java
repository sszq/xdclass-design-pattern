package net.xdclass;

import net.xdclass.singleton.SingletonLazy;

public class Main {

    public static void main(String[] args) {

        SingletonLazy.getInstance().process();
    }
}
