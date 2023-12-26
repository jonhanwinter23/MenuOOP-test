package final2;

public class cake extends product{
    private String flavor;

    public cake(String name, double price, String flavor, String description) {
        super(name, price, description);
        this.flavor =  flavor;
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