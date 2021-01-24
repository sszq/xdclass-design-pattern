package net.xdclass.factory.method;

import net.xdclass.factory.Pay;
import net.xdclass.factory.WeChatPay;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description:
 * @date ......: 2021-01-24
 */
public class WeChatMethodPay implements MethodFactory {

    @Override
    public Pay getPay() {
        return new WeChatPay();
    }
}
