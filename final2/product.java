package final2;

public class product {
    String name;
    double price;
    String description;

    public product(String name, double price, String description) 
    {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        String s = "The product name is: " + this.name + "Price: " + this.price + " Description: " + this.description; 

        return s;
    }

    
}
