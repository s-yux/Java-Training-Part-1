package Week3.Day10.Hotel;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    List<MenuItem> menuItemList;
    List<BillItem> cartList = new ArrayList<>();

    Restaurant(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public void displayMenu() {
        System.out.println("======================================");
        System.out.println("Item Id\t\tItem Name\t\tItem Price");
        System.out.println("======================================");

        for (MenuItem menuItem : menuItemList) {
            System.out.println(menuItem.itemID + "\t\t\t" + menuItem.itemName + "\t\t\t" + menuItem.itemPrice);
        }
    }

    public void addMenuItem(int choice, int qty) {
        BillItem billItem = new BillItem(
                choice,
                menuItemList.get(choice).itemName,
                qty,
                (menuItemList.get(choice).itemPrice * qty)
        );
        cartList.add(billItem);
        printBillItem(billItem);
    }

    public void printBillItem(BillItem billItem) {
        System.out.println(billItem.itemID + 1 + "\t\t\t" + billItem.itemName + "\t\t\t" + billItem.quantity + "\t\t\t\t" + billItem.totalPrice);
    }

    public boolean hasMoreItems(char proceed) {
        return proceed == 'Y' || proceed == 'y';
    }

    public boolean isValidItem(int input) {
        if (!(input > 0 && input <= menuItemList.size())) {
            System.out.println("Invalid Menu Item");
            return false;
        } else {
            return true;
        }
    }

    public void printBill() {
        double total = 0.0;
        System.out.println("=================================================");
        System.out.println("Item Id\t\tItem Name\t\tQuantity\t\tTotal");
        System.out.println("=================================================");

        for (BillItem billItem : cartList) {
            printBillItem(billItem);
            total += billItem.totalPrice;
        }
        System.out.println("=================================================");
        System.out.println("TOTAL: \t\t\t\t\t\t\t\t\t\t" + total);
        System.out.println("=================================================");
    }
}
