package com.sun.mode.chain;

/**
 * 要处理的请求的抽象类，必须实现“等级”
 * 可在该类中封装业务所需要处理的信息
 * 作者：mythSun
 * 时间：2021/3/24-22:12
 */
public abstract class RequestAbs {
    /**
     * 返回“等级”用于匹配和该等级相符的处理者处理该请求
     *
     * @return “等级”
     */
    protected abstract int getLevel();
}
