package final2;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;

public class MenuManagerImp implements MenuManager1 {
    private static final String MENU_FILE = "menu.txt";

    @Override
    public void addCake(String name, double price, String flavor, String description) {
        cake cake = new cake(name, price, flavor, description);
        appendToFile(cake.toString());
    }

    @Override
    public void addTea(String name, double price, String flavor, String description) {
    if (description == null || description.isEmpty()) {
        tea tea = new tea(name, price, flavor);
        appendToFile(tea.toString());
    } else {
        tea tea = new tea(name, price, description, flavor);
        appendToFile(tea.toString());
    }
}


    @Override
    public void viewMenu() {
        printMenu();
    }

    @Override
    public void purchaseItems(List<String> itemIDs) {
        // Removed printMenu(); as it was causing the menu to be printed again
        double total = calculateTotal(itemIDs.toArray(new String[0]));
        System.out.println("Your total is: " + total);
        printReceipt(itemIDs.toArray(new String[0]), total);
    }

    private void appendToFile(String item) {
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
                String[] parts = line.split("/");
                String output = "ID: " + parts[0] + " The product name is: " + parts[1] + " Price: " + parts[2];
                if (parts.length > 3) {
                    output += " Description: " + parts[3];
                }
                if (parts.length > 4) {
                    output += " The flavor is: " + parts[4];
                }
                System.out.println(output);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
    
    private static double calculateTotal(String[] itemIDs) {
        double total = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String id : itemIDs) {
                    if (line.startsWith(id + "/")) { // Changed the startsWith check to match the format of your menu file
                        String[] parts = line.split("/");
                        double price = Double.parseDouble(parts[2]);
                        total += price;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        total = Math.round(total * 100.0) / 100.0; 
        return total;
    }
    

    private static void printReceipt(String[] itemIDs, double total) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        
        try (PrintWriter writer = new PrintWriter(new File("receipt.txt"))) {
            writer.println("Receipt");
            writer.println("Date: " + formatter.format(date));
            writer.println("Items purchased:");
            for (String id : itemIDs) {
                String itemDetails = getItemDetails(id);
                if (!itemDetails.equals("Item not found")) { // Only print item details if the item was found
                    writer.println(itemDetails);
                }
            }
            writer.println("Total: " + total);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the receipt.");
            e.printStackTrace();
        }
    }
    
private static String getItemDetails(String id) {
    try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE))) {
        String line;
        while ((line = br.readLine()) != null) {
            if (line.startsWith(id + "/")) { 
                return line;
            }
        }
    } catch (IOException e) {
        System.out.println("An error occurred while reading the file.");
        e.printStackTrace();
    }
    return "Item not found";
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MenuManagerImp menuManager = new MenuManagerImp();

    while (true) {
        System.out.println("1. Add cake");
        System.out.println("2. Add tea");
        System.out.println("3. View menu");
        System.out.println("4. Purchase items");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();  // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter cake name: ");
                String cakeName = scanner.nextLine();
                System.out.print("Enter cake price: ");
                double cakePrice = scanner.nextDouble();
                scanner.nextLine();  // consume newline
                System.out.print("Enter cake description: ");
                String cakeDescription = scanner.nextLine();
                System.out.print("Enter cake flavor: ");
                String cakeFlavor = scanner.nextLine();
                menuManager.addCake(cakeName, cakePrice, cakeFlavor, cakeDescription);
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
                menuManager.addTea(teaName, teaPrice, teaDescription, teaFlavor);
                break;
            case 3:
                menuManager.viewMenu();
                break;
                case 4:
                menuManager.viewMenu();  // This line prints the menu
                List<String> itemIDs = new ArrayList<>();
                String id;
                while (true) {
                    System.out.print("Enter the ID of the item you want to purchase (or 'done' to finish): ");
                    id = scanner.nextLine();
                    if (id.equalsIgnoreCase("done")) {
                        break;
                    }
                    itemIDs.add(id);
                }
                menuManager.purchaseItems(itemIDs);
                break;
            
            case 5:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

    

