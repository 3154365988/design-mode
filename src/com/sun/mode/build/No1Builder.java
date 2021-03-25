package com.sun.mode.build;

public class No1Builder extends BuilderAbs {
    private Product product = new Product();
    @Override
    public void setPart() {
        // 对上面product做处理
        System.out.println("产品1的构造顺序A");
        System.out.println("产品1的构造顺序B");
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
