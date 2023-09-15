package main;

public class Item {
    
    //private data fields
    private String item_Name;
    private int quantity;
    private double price;
    private double subtotal;
    private double total;
    
    //constructors
    public Item() {
        this.item_Name = item_Name;
        this.quantity = quantity;
        this.price = price;
        this.subtotal = subtotal;
        this.total = total;
    }

    //getters and setter method
    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    //custome methods
    public double calculateSubtotal() {
        subtotal = quantity * price;
        return subtotal;
    }

    @Override
    public String toString() {
        return item_Name + "\t\t" + quantity + "\t" + price + "\t" + subtotal;
    }
    
    
}
