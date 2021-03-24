package com.sun.mode.chain.kernel;

/**
 * 处理者--抽象类
 * 作者：mythSun
 * 时间：2021/3/24-21:52
 */
public abstract class HandlerAbs {
    // 当前处理者的下一个处理者【每个处理者都指向下一个处理者，自然就形成一条链了】
    private HandlerAbs next;

    public final MessageAbs handleMessage(MessageAbs msg) {
        // 检验上次处理是否成功，不成功，中断链，直接返回上次处理结果
        if (this.preWorkOut(msg)) {
            // 当前处理者处理处理之
            msg = this.workOut(msg);
        } else {
            return msg;
        }
        // 递交给下一个处理者尝试处理
        if (this.next != null)
            msg = this.next.handleMessage(msg);
        return msg;
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
     * 处理者处理前的校验
     *
     * @param msg 要处理的消息
     * @return 上次是否处理成功
     */
    protected abstract boolean preWorkOut(MessageAbs msg);

    /**
     * 处理者处理的逻辑
     *
     * @param msg 要处理的消息
     * @return 处理后的消息
     */
    protected abstract MessageAbs workOut(MessageAbs msg);

}
