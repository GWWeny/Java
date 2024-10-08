package com.GT.Day09;

public class Car {
    private String model;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String color, String model, int price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
