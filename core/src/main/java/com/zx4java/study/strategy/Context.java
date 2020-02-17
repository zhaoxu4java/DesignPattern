package com.zx4java.study.strategy;

/**
 * @author zhaoxu
 * @date 2019-12-30
 * 使用策略
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void oprate(){
        this.strategy.operate();
    }

    public static void main(String[] args) {
        Context context = new Context(new CommonStrategy());
        context.oprate();
        context = new Context(new VipStrategy());
        context.oprate();
        context = new Context(new SVIPStrategy());
        context.oprate();
    }

}
