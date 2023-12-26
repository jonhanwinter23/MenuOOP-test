package final2;

public class tea extends product {

    private String flavor;
    
    public tea(String name, double price, String description, String flavor) {
        super(name, price, description);
        this.flavor = flavor;
    }

    // Overloaded constructor
    public tea(String name, double price, String flavor) {
        super(name, price);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + flavor;
    }
    
   
    @Override
    public String getDetails() {
        return super.getDetails() + ", Flavor: " + flavor;
    }
}
