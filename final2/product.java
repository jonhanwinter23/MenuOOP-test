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
        String s = "ID: " + this.id + " The product name is: " + this.name + " Price: " + this.price + " Description: " + this.description; 

        return s;
    }

    public abstract String getFlavor();
}
