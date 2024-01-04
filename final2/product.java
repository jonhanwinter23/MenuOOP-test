package final2;

public abstract class product {
    private static int idCounter = 0;
    private int id;
    protected String name;
    protected double price;
    protected String description;

    public product(String name, double price, String description) 
    {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Overloaded constructor
    public product(String name, double price) 
    {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
        this.description = "No description available";
    }

    public String getDetails() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price + ", Description: " + description;
    }

    @Override
    public String toString() {
        return id + "/" + name + "/" + price + "/" + description;
    }
}
    
