package net.xdclass.factory.method;

import net.xdclass.factory.Pay;

/**
 * @author ....: WangQk
 * @project....: xdclass-design-pattern
 * @description: 工厂方法模式
 * 一个业务对应一个业务工厂，一个业务产品
 * @date ......: 2021-01-24
 */
public interface MethodFactory {

    Pay getPay();
}
