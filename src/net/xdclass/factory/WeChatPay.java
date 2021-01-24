package net.xdclass.factory;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description:
 * @date ......: 2021-01-24
 */
public class WeChatPay implements Pay {
    @Override
    public void unifiedOrder() {
        System.out.println("微信支付，下单");
    }
}
