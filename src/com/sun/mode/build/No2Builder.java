package com.sun.mode.build;

public class No2Builder extends BuilderAbs {
    private Product product = new Product();
    @Override
    public void setPart() {
        // 对上面product做处理
        System.out.println("产品2的构造顺序X");
        System.out.println("产品2的构造顺序Z");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
