package com.sun.mode.build.kernel;

public class ProductBuilder {
    private Product product = new Product();

    public ProductBuilder buildName(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder buildFiled1(String name) {
        product.setFiled1(name);
        return this;
    }

    public ProductBuilder buildFiled2(String name) {
        product.setFiled2(name);
        return this;
    }

    public ProductBuilder buildFiled5(String name) {
        product.setFiled5(name);
        return this;
    }

    public ProductBuilder buildOne() {
        product.setName("buildOne的预置产品名");
        product.setFiled1("buildOne的预置产品1属性");
        product.setFiled2("buildOne的预置产品2属性");
        return this;
    }

    public ProductBuilder buildTwo() {
        product.setName("buildTwo的预置产品名");
        product.setFiled4("buildOne的预置产品4属性");
        product.setFiled5("buildOne的预置产品5属性");
        product.setFiled2("buildOne的预置产品2属性");
        return this;
    }

    public Product getProduct() {
        return product;
    }

    public void clear() {
        product = new Product();
    }
}
