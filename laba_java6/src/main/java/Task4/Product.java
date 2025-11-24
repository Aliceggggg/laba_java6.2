package Task4;
public class Product {
    private double price;
    private String name;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public double getPrice() { 
        return price;
    }

    public String getName() { 
        return name;
    }
}