package com.sun.mode.build.kernel;

public class TestCase {
    public static void main(String[] args) {
        ProductBuilder builder = new ProductBuilder();
        Product p1 = builder.buildName("自由建造产品1")
                .buildFiled1("自由建造产品1的属性1")
                .buildFiled5("自由建造产品1的属性5").getProduct();
        System.out.println(p1.toString());
        System.out.println("------分割线--------");
        builder.clear();
        p1 = builder.buildOne().getProduct();
        System.out.println(p1.toString());
        System.out.println("------分割线--------");
        builder.clear();
        p1 = builder.buildTwo().buildFiled1("预置的我也要自由的加个属性1").getProduct();
        System.out.println(p1.toString());
        System.out.println("------分割线--------");
        builder.clear();

    }
}
