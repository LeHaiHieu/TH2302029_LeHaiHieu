package Exam;
import java.util.*;
public class LineItem {
    String products;
    int quantity;
    public LineItem(String products, int quantity) {
        this.products = products;
        this.quantity = quantity;
    }
    public String getProducts() {
        return products;
    }
    public void setProducts(String products){
        this.products = products;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
