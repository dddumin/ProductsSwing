package model;

import java.util.Arrays;
import model.Product;

public class ProductList {

    private Product[] listOfProducts;
    private int ind;

    public ProductList() {
        this.listOfProducts = new Product[5];
    }

    public void addProduct(Product product) {
        this.listOfProducts[this.ind] = product;
        this.ind++;
    }

    public int getCount() {
        return ind;
    }

    public Product get(int n) {
        if (n >= this.listOfProducts.length || n < 0)
            return null;
        return this.listOfProducts[n];
    }

    public boolean isFull(){
        return this.ind == this.listOfProducts.length;
    }

    public boolean nameMatch(String name){
        for (int i = 0; i < ind; i++) {
            if (this.listOfProducts[i].getName().toLowerCase().equals(name.toLowerCase()))
                return false;
        }
        return true;
    }

    public void setQuantity(Product product){
        for (int i = 0; i < this.ind; i++) {
            if (product.equals(this.listOfProducts[i]))
                this.listOfProducts[i].setQtyOnHand(this.listOfProducts[i].getQtyOnHand() - this.listOfProducts[i].getMinOrderQty());
        }
    }

    public Product[] getListOfProducts() {
        return Arrays.copyOf(this.listOfProducts, this.ind);
    }
    
    

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.ind; i++) {
            s += "Product " + (i + 1) + ":" + "\r\n" + this.listOfProducts[i] + "\r\n";
        }
        return s;
    }
}
