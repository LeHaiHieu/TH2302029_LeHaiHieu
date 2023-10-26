package Exam;


public class Product {
    private String SKU;
    private String name;
    private String Category;
    private int price;
    private int quantity;

    public Product(String SKU, String name, String Category , int price , int quantity) {
        this.SKU = SKU;
        this.name = name;
        this.Category = Category;
        this.price = price;
        this.quantity = quantity;
    }
    public String getSKU() {
        return SKU;
    }
    public void setSKU(String SKU){
        this.SKU = SKU;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String Category) {
        this.Category = Category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{ " + "SKU :" + SKU + "Category: " + Category + "Name: " + name + "Price: " + price + "Quantity: "+ quantity + "}";
    }
}
