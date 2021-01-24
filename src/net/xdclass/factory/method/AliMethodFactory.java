package net.xdclass.factory.method;

import net.xdclass.factory.AliPay;
import net.xdclass.factory.Pay;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description:
 * @date ......: 2021-01-24
 */
public class AliMethodFactory implements MethodFactory {

    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
