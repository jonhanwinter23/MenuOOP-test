package final2;

public class cake extends product{
    private String flavor;
    private String size; // Added size attribute

    public cake(String name, double price, String flavor, String description, String size) { // Added size parameter
        super(name, price, description);
        this.flavor =  flavor;
        this.size = size; // Assign size
        this.price=0;
    }

    @Override
    public String toString() {
        return super.toString() + "/" + flavor + "/" + size; // Added size
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Flavor: " + flavor + ", Size: " + size; // Added size
    }
}
