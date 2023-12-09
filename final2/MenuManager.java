package final2;

import java.io.*;
import java.util.*;

public class MenuManager {
    private static final String MENU_FILE = "menu.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. Add tea");
            System.out.println("3. View menu");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter product description: ");
                    String productDescription = scanner.nextLine();
                    product product = new product(productName, productPrice, productDescription);
                    appendToFile(product.toString());
                    break;
                case 2:
                    System.out.print("Enter tea name: ");
                    String teaName = scanner.nextLine();
                    System.out.print("Enter tea price: ");
                    double teaPrice = scanner.nextDouble();
                    scanner.nextLine();  // consume newline
                    System.out.print("Enter tea description: ");
                    String teaDescription = scanner.nextLine();
                    System.out.print("Enter tea flavor: ");
                    String teaFlavor = scanner.nextLine();
                    tea tea = new tea(teaName, teaPrice, teaDescription, teaFlavor);
                    appendToFile(tea.toString());
                    break;
                case 3:
                    printMenu();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void appendToFile(String item) {
        try (FileWriter fw = new FileWriter(MENU_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(item);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void printMenu() {
        try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
