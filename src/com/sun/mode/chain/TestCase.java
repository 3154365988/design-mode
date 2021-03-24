package com.sun.mode.chain;

public class TestCase {
    public static void main(String[] args) {
        // 构造责任链
        HandlerAbs handler1 = new FirstHandler();
        HandlerAbs handler2 = new SecondHandler();
        HandlerAbs handler3 = new ThirdHandler();
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        // 提交请求1
        ResponseAbs response = handler1.handleMessage(new No1Request());
        System.out.println(((TempResponse) response).info());
        // 提交请求2
        response = handler1.handleMessage(new No2Request());
        System.out.println(((TempResponse) response).info());
        /**
         * 可见，在一次构造责任链后，只需要每次传入不同的请求，责任链会在运行时找到处理该请求的处理者来返回响应信息
         */
    }
}
