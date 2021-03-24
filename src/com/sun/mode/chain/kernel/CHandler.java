package com.sun.mode.chain.kernel;

public class CHandler extends HandlerAbs {

    @Override
    protected boolean preWorkOut(MessageAbs msg) {
        System.out.println(this.getClass().getName() + "校验，此时MessageAbs.currentState = " + msg.currentState);
        if ("B".equals(msg.currentState)) {
            System.out.println(this.getClass().getName() + "校验通过");
            return true;
        }
        System.out.println(this.getClass().getName() + "校验不通过");
        return false;
    }

    @Override
    protected MessageAbs workOut(MessageAbs msg) {
        msg.currentState = "C";
        System.out.println(this.getClass().getName() + "处理了，此时MessageAbs.currentState = " + msg.currentState);
        System.out.println();
        return msg;
    }
}
