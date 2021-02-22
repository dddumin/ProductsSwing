package model;

import java.util.Objects;

public class Product {
    private String name;
    private String desc;
    private double price;
    private int qtyOnHand;
    private int minOrderQty;

    public Product() {
        this.name = "";
        this.desc = "";
    }

    public Product(String name, String desc, double price, int qtyOnHand, int minOrderQty) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
        this.minOrderQty = minOrderQty;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    
 

    public double getPrice() {
        return price;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int newQty) {
        this.qtyOnHand = newQty;
    }

    public int getMinOrderQty() {
        return minOrderQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                qtyOnHand == product.qtyOnHand &&
                minOrderQty == product.minOrderQty &&
                Objects.equals(name, product.name) &&
                Objects.equals(desc, product.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, price, qtyOnHand, minOrderQty);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\r\n" +
                "Description: " + this.desc + "\r\n" +
                "Quantity: " + this.qtyOnHand + "\r\n" +
                "Price: " + this.price + "" + "\r\n" +
                "Min Order Quantity: " + this.minOrderQty + "\r\n";
    }
}
