package com.sun.mode.chain;

public class ThirdHandler extends HandlerAbs {
    @Override
    protected int getCurrentLevel() {
        return 3;
    }

    @Override
    protected ResponseAbs workOut(RequestAbs req) {
        System.out.println("我是第三个处理者，我处理了“等级”为3的请求");
        // 下面的返回值根据业务需要返回ResponseAbs的子类
        return new TempResponse("我是被第三个处理者处理的“等级”为3的请求的回复");
    }
}
