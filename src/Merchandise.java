import java.util.*;
public class Merchandise {

    private double price;
    private String name;
    private int quantity;

    public Merchandise(){
        this.price = 0.0;
        this.name = " ";
        this.quantity = 0;

    }

    public Merchandise(double price, String name, int quantity){
        this.price = price;
        this.name = name;
        this.quantity = quantity;
    }//Merchandise

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString(){

        Formatter formatter = new Formatter();
        formatter.format("Product Name: %s  Price: $%.2f", getName(), getPrice());

        return formatter.toString();

    }

}//end Merchandise
