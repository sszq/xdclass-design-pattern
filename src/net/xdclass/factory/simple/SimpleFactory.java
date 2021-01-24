package net.xdclass.factory.simple;

import net.xdclass.factory.AliPay;
import net.xdclass.factory.Pay;
import net.xdclass.factory.WeChatPay;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description: 执行步骤：
 * 1-产品接口类
 * 2-产品实现类
 * 3-工厂选择类
 * 4-实现调用
 * @date ......: 2021-01-24
 */
public class SimpleFactory {

    public static Pay payType(String type) {
        if (null != type) {
            if ("WECHAT_PAY".equals(type)) {
                return new WeChatPay();
            } else if ("ALI_PAY".equals(type)) {
                return new AliPay();
            } else {
                return null;
            }
        }

        return null;
    }
}
