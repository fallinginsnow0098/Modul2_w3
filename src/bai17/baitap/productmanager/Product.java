package bai17.baitap.productmanager;

import java.io.Serializable;

public class Product implements Serializable {
    private int code;
    private String name;
    private String brand;
    private double price;
    private String type;
    private static int value = 0;

    public Product() {
    }

    public Product(String name, String brand, double price, String type) {
        this.code = ++value;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}
