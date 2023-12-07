package final2;

public class testing {
    public static void main(String[] args) {
        product p = new product("Sting", 3.3, "Is an energy drink");
        System.out.println(p);

        tea t = new tea("matcha", 5.6, "Very bitter", "Bitter Nas");
        System.out.println(t);

        cake c = new cake("Butter Cake", 20.8, "Chocoloate", "Homemade-Chocolate");
        System.out.println(c);

        cake d = new cake("Cream cake", 23.4, "Strawberry", "Very creamy");
        System.out.println(d);

        tea t1 = new tea("Oolong",6.5,"Very bitter", "Leaf");
        System.out.println(t1);

        cake d1 = new cake("Orange",34.3,"Orange","Orange cake");
        System.out.println(d1);

    }
    
    
    
}
