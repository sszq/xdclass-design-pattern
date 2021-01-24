package net.xdclass.factory.simple;

import net.xdclass.factory.Pay;
import net.xdclass.factory.simple.SimpleFactory;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description:
 * @date ......: 2021-01-24
 */
public class Main {
    public static void main(String[] args) {
        Pay pay = SimpleFactory.payType("WECHAT_PAY");
        pay.unifiedOrder();
    }
}
