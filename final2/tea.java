package final2;

public class tea extends product {
    
    public tea(String name, double price, String description) {
        super(name, price, description);
    }

    // Overloaded constructor
    public tea(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
   
    @Override
    public String getDetails() {
        return super.getDetails();
    }
}
