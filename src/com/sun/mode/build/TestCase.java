package com.sun.mode.build;

public class TestCase {
    public static void main(String[] args) {
        // 产品1的构造
        BuilderAbs builder = new No1Builder();
        builder.setPart();
        builder.buildProduct();
        System.out.println("------------分割线-------------");
        // 产品2的构造
        builder = new No2Builder();
        builder.setPart();
        builder.buildProduct();
    }
}
