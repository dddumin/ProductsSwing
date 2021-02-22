package model;

import java.util.Arrays;
import model.Product;

public class SaleTransaction {

    private int saleCode;
    private Product[] items;
    private int ind;
    private double totalCost;

    public SaleTransaction(int saleCode) {
        this.saleCode = saleCode;
        this.items = new Product[3];
    }

    public int getCount() {
        return ind;
    }

    public Product[] getItems() {
        return Arrays.copyOf(this.items, this.ind);
    }
    
    

    public void addProduct(Product product){
        this.items[this.ind] = product;
        this.ind++;
        this.totalCost += product.getMinOrderQty()*product.getPrice();
    }

    public void deleteProduct(int n){
        this.totalCost -= this.items[n].getPrice()*this.items[n].getMinOrderQty();
        for (int i = n; i < this.ind - 1; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.items[this.ind - 1] = null;
        this.ind--;
    }
    
    public void deleteProduct(Product product){
        for (int i = 0; i < this.ind; i++) {
            
        }
    }

    public int countProduct(Product product){
        int count = product.getMinOrderQty();
        for (int i = 0; i < this.ind; i++) {
            if (product.equals(this.items[i]))
                count+= product.getMinOrderQty();
        }
        return count;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public boolean isFull(){
        return this.ind == this.items.length;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.ind; i++) {
            s += "Select Added Item " + (i + 1) + ":" + "\r\n" + this.items[i] + "\r\n";
        }
        return s;
    }

    public Product get(int i) {
        return this.items[i];
    }
}
