import java.util.Scanner;

public class IT24103975Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: price of 1 kg of rice
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        // Input: number of kilograms to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // Calculate total amount
        double totalAmount = pricePerKg * quantity;

        // Calculate discount
        double discount = totalAmount * 0.10; // 10% discount
        double amountAfterDiscount = totalAmount - discount;

        // Output the total amount after discount
        System.out.printf("The total amount you have to pay after discount is: %.2f\n", amountAfterDiscount);

        // Close the scanner
        scanner.close();
    }
}