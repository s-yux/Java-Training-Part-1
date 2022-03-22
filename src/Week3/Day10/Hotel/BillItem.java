package Week3.Day10.Hotel;

public class BillItem {

    int itemID;
    String itemName;
    int quantity;
    double totalPrice;

    BillItem(int choice, String itemName, int quantity, double totalPrice){
        this.itemID = choice;
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
}
