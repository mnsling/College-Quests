package main;
// Import necessary libraries
import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class Main {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);

        // Create an ArrayList to store items
        ArrayList<Item> itemlist = new ArrayList<>();

        // Initialize a variable to store the total cost
        double total = 0;

        // Declare a variable for user response (Y or N)
        char response;

        // Start a loop to input items
        do {
            // Create a new Item object for each item
            Item i = new Item();

            // Prompt the user to input the item name
            System.out.print("Item Name: ");
            i.setItem_Name(in.nextLine());

            // Prompt the user to input the quantity
            System.out.print("Quantity: ");
            i.setQuantity(in.nextInt());

            // Prompt the user to input the price
            System.out.print("Price: ");
            i.setPrice(in.nextDouble());

            // Calculate the subtotal for the current item
            i.calculateSubtotal();

            // Add the current item to the ArrayList
            itemlist.add(i);

            // Update the total with the current item's subtotal
            total += i.getSubtotal();

            // Prompt the user to continue or stop adding items
            System.out.print("Type 'Y' if you want to keep adding, and 'N' if you want to check out: ");
            response = in.next().charAt(0);

            // Consume the newline character to prevent issues with nextLine() later
            in.nextLine();

        } while (response == 'Y' || response == 'y'); // Continue loop if the response is 'Y' or 'y'

        // Check if items were added
        if (!itemlist.isEmpty()) {
            // Display headers for item details
            System.out.println("Item Name\tQuantity\tPrice\tSubtotal");
            // Iterate through the items in the list and print their details
            for (Item item : itemlist) {
                System.out.println(item.toString());
            }
            
            // Display the total cost of all items
            System.out.println("Total: " + total);
        } else {
            // Display a message if no items were added
            System.out.println("No items were added.");
        }
    }
}
