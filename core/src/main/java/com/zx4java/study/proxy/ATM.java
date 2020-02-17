package com.zx4java.study.proxy;

/**
 * @author zhaoxu
 * @date 2020-01-06
 */
public class ATM implements IBank{

    private IBank iBank;

    public ATM() {
        this.iBank = new ChinaBank();
    }

    public ATM(IBank iBank) {
        this.iBank = iBank;
    }

    public void saveMoney(long amount) {
        iBank.saveMoney(amount);
    }

    public void drawMoney(long amount) {
        iBank.drawMoney(amount);
    }
}
