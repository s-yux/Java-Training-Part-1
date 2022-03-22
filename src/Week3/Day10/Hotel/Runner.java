package Week3.Day10.Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        List<MenuItem> menuItemList = new ArrayList<>();
        menuItemList.add(new MenuItem(1, "water", 2.5));
        menuItemList.add(new MenuItem(2, "coke", 3));
        menuItemList.add(new MenuItem(3, "pizza", 5.5));
        menuItemList.add(new MenuItem(4, "burger", 4.5));
        menuItemList.add(new MenuItem(5, "fries", 2));

        int choice, qty;
        char proceed;
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
        Restaurant restaurant = new Restaurant(menuItemList);

        System.out.println("Welcome to Marina Bay Sands!");
        System.out.println("Enter your name:");
        customer.name = sc.nextLine();

        System.out.println("Here is the menu to order your food:");
        restaurant.displayMenu();

        do {
            do {
                System.out.println("Enter the itemID:");
                choice = sc.nextInt();
            } while (!restaurant.isValidItem(choice));

            System.out.println("Enter the Qty:");
            qty = sc.nextInt();
            restaurant.addMenuItem(choice - 1, qty);
            System.out.println("Do you want to continue ordering? (y/n)");
            proceed = sc.next().toUpperCase().charAt(0);
        } while (restaurant.hasMoreItems(proceed));

        System.out.println(customer.name + ", thank you for ordering, here is your bill: ");
        restaurant.printBill();
    }
}
