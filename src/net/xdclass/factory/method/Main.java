package net.xdclass.factory.method;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description:
 * @date ......: 2021-01-24
 */
public class Main {
    public static void main(String[] args) {
        MethodFactory aliPay = new AliMethodFactory();
        aliPay.getPay().unifiedOrder();
        MethodFactory weChatPay = new WeChatMethodPay();
        weChatPay.getPay().unifiedOrder();
    }
}
