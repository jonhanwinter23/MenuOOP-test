package final2;

public class Testp {
    public static void main(String[] args) {
        product tea = new tea("Green Tea", 2.5, "Refreshing", "Green") {
            @Override
            public String getDetails() {
                return super.getDetails() + ", Special Note: This is a special edition!"; //Anonymous Inner class implementation
            }
        };

        System.out.println(tea.getDetails());
    }
}
    