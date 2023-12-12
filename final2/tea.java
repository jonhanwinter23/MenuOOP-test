package final2;

public class tea extends product {

    String flavor;
    public tea(String name, double price, String description, String flavor) {
        super(name, price, description);
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        String s = super.toString() + " The flavor is: " + this.flavor;
        return s;
    }

    @Override
    public String getFlavor() {
        return this.flavor;
    }
   
}