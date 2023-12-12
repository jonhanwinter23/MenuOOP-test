package login;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee("Employee1", "employee01", 300);
        Barista b1 = new Barista("Barista1", "barista01", 200);
        Employee e2 = new Employee("Employee2", "employee02", 200);
        Barista b2 = new Barista("Barista2", "barista02", 300);

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Add a new username and password");
        System.out.println("2. Login with an existing account");

        int option = sc.nextInt();

        if (option == 1) {
            System.out.println("Enter username:");
            String username = sc.next();
            System.out.println("Enter password:");
            String password = sc.next();
            saveCredentials(username, password);
        } else if (option == 2) {
            // Test authentication for barista
            System.out.println("Enter username:");
            String username = sc.next();
            System.out.println("Enter password:");
            String password = sc.next();

            if (b1.authenticate(password)) {
                System.out.println("Authentication successful for Barista1!");
            } else if (b2.authenticate(password)) {
                System.out.println("Authentication successful for Barista2!");
            } else {
                System.out.println("Authentication failed!");
            }
        } else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }

    private static void saveCredentials(String username, String password) {
        try {
            FileWriter writer = new FileWriter("credentials.txt");
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n");
            writer.close();
            System.out.println("Credentials saved successfully!");
        } catch (IOException e) {
            System.out.println("Failed to save credentials.");
            e.printStackTrace();
        }
    }
}
