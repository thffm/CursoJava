package entities;

public class Product {
    public String name;
    public double price;
    public  int quantity;

    public  Product(String name,double price, int quantity){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double totalValueInstock(){
        return price*quantity;
    }
    public void addProducts(int quantity){
        this.quantity += quantity;

    }
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name+", $ "+String.format("%.2f",price)+", "+quantity+" unitis, Total: $"+
                String.format("%.2f",totalValueInstock());
    }
}
