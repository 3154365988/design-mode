package com.sun.mode.build;

/**
 * 抽象建造者
 * 作者：mythSun
 * 时间：2021/3/25-21:58
 */
public abstract class BuilderAbs {
    // 设置产品的不同部分，以获得不同的产品【让产品通过不同的构造顺序变成不同的产品】
    public abstract void setPart();

    // 建造产品
    public abstract Product buildProduct();
}
