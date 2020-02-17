package com.zx4java.study.proxy;

/**
 * @author zhaoxu
 * @date 2020-01-06
 */
public class HKBank implements IBank{

    public void saveMoney(long amount) {
        System.out.println("HK save money " + amount);
    }

    public void drawMoney(long amount) {
        System.out.println("HK draw money " + amount);
    }
}
