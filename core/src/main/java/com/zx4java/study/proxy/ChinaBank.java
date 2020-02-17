package com.zx4java.study.proxy;

/**
 * @author zhaoxu
 * @date 2020-01-06
 */
public class ChinaBank implements IBank{

    public void saveMoney(long amount) {
        System.out.println("save money " + amount);
    }

    public void drawMoney(long amount) {
        System.out.println("draw money " + amount);
    }
}
