// package final2;

// import java.io.*;
// import java.text.SimpleDateFormat;
// import java.util.*;

// public class MenuManager{
//     private static final String MENU_FILE = "menu.txt";

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         List<String> itemIDs = new ArrayList<>();
//         while (true) {
//             System.out.println("1. Add cake");
//             System.out.println("2. Add tea");
//             System.out.println("3. View menu");
//             System.out.println("4. Purchase items");
//             System.out.println("5. Exit");
//             System.out.print("Enter your choice: ");
//             int choice = scanner.nextInt();
//             scanner.nextLine();  // consume newline

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter cake name: ");
//                     String cakeName = scanner.nextLine();
//                     System.out.print("Enter cake price: ");
//                     double cakePrice = scanner.nextDouble();
//                     scanner.nextLine();  // consume newline
//                     System.out.print("Enter cake description: ");
//                     String cakeDescription = scanner.nextLine();
//                     System.out.print("Enter cake flavor: ");
//                     String cakeFlavor = scanner.nextLine();
//                     cake cake = new cake(cakeName, cakePrice, cakeFlavor, cakeDescription);
//                     appendToFile(cake.toString());
//                     break;
//                 case 2:
//                     System.out.print("Enter tea name: ");
//                     String teaName = scanner.nextLine();
//                     System.out.print("Enter tea price: ");
//                     double teaPrice = scanner.nextDouble();
//                     scanner.nextLine();  // consume newline
//                     System.out.print("Enter tea description: ");
//                     String teaDescription = scanner.nextLine();
//                     System.out.print("Enter tea flavor: ");
//                     String teaFlavor = scanner.nextLine();
//                     tea tea = new tea(teaName, teaPrice, teaDescription, teaFlavor);
//                     appendToFile(tea.toString());
//                     break;
//                 case 3:
//                     printMenu();
//                     break;
//                 case 4:
//                     printMenu();
//                     String id;
//                     while (true) {
//                         System.out.print("Enter the ID of the item you want to purchase (or 'done' to finish): ");
//                         id = scanner.nextLine();
//                         if (id.equalsIgnoreCase("done")) {
//                             break;
//                         }
//                         itemIDs.add(id);
//                     }
//                     double total = calculateTotal(itemIDs.toArray(new String[0]));
//                     System.out.println("Your total is: " + total);
//                     printReceipt(itemIDs.toArray(new String[0]), total);
//                     break;
//                 case 5:
//                     System.out.println("Exiting...");
//                     scanner.close();
//                     System.exit(0);
//                 default:
//                     System.out.println("Invalid choice. Please try again.");
//             }
//         }
//     }



//     private static void appendToFile(String item) {
//         try (FileWriter fw = new FileWriter(MENU_FILE, true);
//              BufferedWriter bw = new BufferedWriter(fw);
//              PrintWriter out = new PrintWriter(bw)) {
//             out.println(item);
//         } catch (IOException e) {
//             System.out.println("An error occurred while writing to the file.");
//             e.printStackTrace();
//         }
//     }

//     private static void printMenu() {
//         try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 String[] parts = line.split("/");
//                 System.out.println("ID: " + parts[0] + " The product name is: " + parts[1] + " Price: " + parts[2] + " Description: " + parts[3] + " The flavor is: " + parts[4]);
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file.");
//             e.printStackTrace();
//         }
//     }
    

//     private static double calculateTotal(String[] itemIDs) {
//         double total = 0;
//         try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 for (String id : itemIDs) {
//                     if (line.startsWith("ID: " + id)) {
//                         int priceIndex = line.indexOf("Price: ") + 7;
//                         int endPriceIndex = line.indexOf(" ", priceIndex);
//                         double price = Double.parseDouble(line.substring(priceIndex, endPriceIndex));
//                         total += price;
//                     }
//                 }
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file.");
//             e.printStackTrace();
//         }
//         return total;
//     }
//    private static void printReceipt(String[] itemIDs, double total) {
//         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//         Date date = new Date();
//         System.out.println("Receipt");
//         System.out.println("Date: " + formatter.format(date));
//         System.out.println("Items purchased:");
//         for (String id : itemIDs) {
//             String itemDetails = getItemDetails(id);
//             System.out.println(itemDetails);
//         }
//         System.out.println("Total: " + total);
//     }

//     private static String getItemDetails(String id) {
//         try (BufferedReader br = new BufferedReader(new FileReader(MENU_FILE))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 if (line.startsWith("ID: " + id)) {
//                     return line;
//                 }
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading the file.");
//             e.printStackTrace();
//         }
//         return "Item not found";
//     }}


