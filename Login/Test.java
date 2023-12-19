package login;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Register a new barista");
        System.out.println("2. Register a new employee");
        System.out.println("3. Login with an existing account");

        int option = sc.nextInt();

        if (option == 1) {
            System.out.println("Enter barista username:");
            String username = sc.next();
            System.out.println("Enter barista password:");
            String password = sc.next();
            registerUser("Barista", username, password);
        } else if (option == 2) {
            System.out.println("Enter employee username:");
            String username = sc.next();
            System.out.println("Enter employee password:");
            String password = sc.next();
            registerUser("Employee", username, password);
        } else if (option == 3) {
            System.out.println("Enter username:");
            String username = sc.next();
            System.out.println("Enter password:");
            String password = sc.next();

            if (authenticateCredentials(username, password)) {
                System.out.println("Authentication successful!");
            } else {
                System.out.println("Authentication failed!");
            }
        } else {
            System.out.println("Invalid option!");
        }

        sc.close();
    }

    private static void registerUser(String userType, String username, String password) {
        try {
            FileWriter writer = new FileWriter("credentials.txt", true);
            writer.write(userType + ":");
            writer.write(username + "/");
            writer.write(password);
            writer.write("\n");
            writer.close();
            System.out.println("User registered successfully!");
        } catch (IOException e) {
            System.out.println("Failed to register user.");
            e.printStackTrace();
        }
    }

    private static boolean authenticateCredentials(String username, String password) {
        try {
            Scanner fileScanner = new Scanner(new File("credentials.txt"));
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.contains(username + "/")) {
                    String passwordLine = fileScanner.nextLine();
                    if (passwordLine.contains(password)) {
                        fileScanner.close();
                        return true;
                    }
                }
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failed to read credentials.");
            e.printStackTrace();
        }
        return false;
    }
}
