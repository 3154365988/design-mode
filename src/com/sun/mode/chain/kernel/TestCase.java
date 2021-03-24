package com.sun.mode.chain.kernel;

public class TestCase {
    public static void main(String[] args) {
        // 构造链
        HandlerAbs handlerA = new AHandler();
        HandlerAbs handlerB = new BHandler();
        HandlerAbs handlerC = new CHandler();
        HandlerAbs handlerD = new DHandler();
        HandlerAbs handlerE = new EHandler();
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);
        handlerC.setNext(handlerD);
        handlerD.setNext(handlerE);
        // 构造消息
        MessageAbs msg = new Message();
        // 处理
        handlerA.handleMessage(msg);

        // 去掉链中的C，直接到D，模拟C处理失败，导致链直接终端
        System.out.println("----------分界线-------------");
        handlerB.setNext(handlerD);
        // 重置消息
        msg.currentState = "";
        handlerA.handleMessage(msg);

    }
}
