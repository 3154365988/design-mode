package com.sun.mode.build.kernel;

public class Product {
    private String name;
    private String filed1;
    private String filed2;
    private String filed3;
    private String filed4;
    private String filed5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    public String getFiled2() {
        return filed2;
    }

    public void setFiled2(String filed2) {
        this.filed2 = filed2;
    }

    public String getFiled3() {
        return filed3;
    }

    public void setFiled3(String filed3) {
        this.filed3 = filed3;
    }

    public String getFiled4() {
        return filed4;
    }

    public void setFiled4(String filed4) {
        this.filed4 = filed4;
    }

    public String getFiled5() {
        return filed5;
    }

    public void setFiled5(String filed5) {
        this.filed5 = filed5;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", filed1='" + filed1 + '\'' +
                ", filed2='" + filed2 + '\'' +
                ", filed3='" + filed3 + '\'' +
                ", filed4='" + filed4 + '\'' +
                ", filed5='" + filed5 + '\'' +
                '}';
    }
}
