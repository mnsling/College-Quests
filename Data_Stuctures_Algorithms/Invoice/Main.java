package invoice;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static String partNumber;
    static String partDescription;
    static int quantity;
    static double pricePerItem;
    public static void main(String[] args) {

    partNumber = scanner.nextLine();
    partDescription = scanner.nextLine();
    quantity = scanner.nextInt();
    pricePerItem = scanner.nextDouble();

     Invoice get = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        System.out.printf("invoice amount is: %.2f", get.getInvoiceAmount(quantity, pricePerItem));
    }
}
