package net.xdclass.factory;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description:
 * @date ......: 2021-01-24
 */
public class AliPay implements Pay {
    @Override
    public void unifiedOrder() {
        System.out.println("支付宝支付，下单");
    }
}
