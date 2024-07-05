package com.example.demo;

public class Airplane extends HelloApplication{

    String shape;
    String material;
    String color;

    public Airplane() {
    }

    public Airplane(String shape,String material,String color) {
        this.material=material;
        this.color=color;
        this.shape=shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial() {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }
}
