package com.zx4java.study.proxy;

/**
 * @author zhaoxu
 * @date 2020-01-06
 */
public interface IBank {

    /**
     * 存钱
     * @param amount 金额
     */
    void saveMoney(long amount);
    /**
     * 取钱
     * @param amount 金额
     */
    void drawMoney(long amount);
}
