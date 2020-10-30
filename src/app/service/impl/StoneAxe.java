package app.service.impl;

import app.service.Axe;

public class StoneAxe implements Axe {
    private int price;
    private String name;

    public StoneAxe(int price, String name) {
        this.price = price;
        this.name = name;
        System.out.println("名字："+ name + "价格：" + price);
    }

    @Override
    public String chop() {
        return "石斧砍柴好慢";
    }

    @Override
    public String toString() {
        return "StoneAxe{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
