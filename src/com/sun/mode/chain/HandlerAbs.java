package com.sun.mode.chain;

/**
 * 处理者--抽象类
 * 作者：mythSun
 * 时间：2021/3/24-21:52
 */
public abstract class HandlerAbs {
    // 当前处理者的下一个处理者【每个处理者都指向下一个处理者，自然就形成一条链了】
    private HandlerAbs next;

    public final ResponseAbs handleMessage(RequestAbs req) {
        ResponseAbs res = null;
        if (this.getCurrentLevel() == req.getLevel())
            // 是当前处理者处理该请求，处理之
            res = this.workOut(req);
        else if (this.next != null)
            // 不是当前处理者并且下一个处理者存在，递交给下一个处理者尝试处理
            res = this.next.handleMessage(req);
        return res;
    }

    /**
     * 设置下一个处理者
     *
     * @param next 处理者
     */
    public void setNext(HandlerAbs next) {
        this.next = next;
    }

    /**
     * 获得当前处理者的“等级”，用于匹配处理者处理相同等级的请求
     *
     * @return “等级”
     */
    protected abstract int getCurrentLevel();

    /**
     * 处理者处理的逻辑
     *
     * @param req 要处理的请求
     * @return 处理后的回复
     */
    protected abstract ResponseAbs workOut(RequestAbs req);

}
