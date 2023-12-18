package final2;

public abstract class product {
    static int idCounter = 0;
    int id;
    String name;
    double price;
    String description;

    public product(String name, double price, String description) 
    {
        this.id = ++idCounter;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return id + "/" + name + "/" + price + "/" + description;
    }
    

    public abstract String getFlavor();
}
