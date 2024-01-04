package final2;

import java.util.List;
// Interface

public interface MenuManager1 {
    void addCake(String name, double price, String flavor, String description, String size);
    void addTea(String name, double price, String description);
    void viewMenu();
    void purchaseItems(List<String> itemIDs);
}
