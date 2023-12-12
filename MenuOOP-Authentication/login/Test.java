package login;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Employee1", "employee01", 300);
        Barista b1 = new Barista("Barista1", "barista01", 200);
        Employee e2 = new Employee("Employee2", "employee02", 200);
        Barista b2 = new Barista("Barista2", "barista02", 300);

        Scanner sc = new Scanner(System.in);

        // Test authentication for barista
        System.out.println("Enter password for Barista1:");
        String password = sc.next();

        if (b1.authenticate(password)) {
            System.out.println("Authentication successful for Barista1!");
        } else {
            System.out.println("Authentication failed for Barista1!");
            System.out.println("Enter password for Barista2:");
            password = sc.next();
            if (b2.authenticate(password)) {
                System.out.println("Authentication successful for Barista2!");
            } else {
                System.out.println("Authentication failed for Barista2!");
            }
        }

        sc.close();
    }
}
