package com.zx4java.study.proxy;

/**
 * @author zhaoxu
 * @date 2020-01-06
 */
public class RichMan {

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.saveMoney(10000);
        atm.drawMoney(2000);
        atm = new ATM(new HKBank());
        atm.saveMoney(100000);
        atm.drawMoney(20000);
    }
}
