import java.util.Scanner;

public class ITxxxxxxxxLab3Q1A {
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

        // Output the total amount
        System.out.printf("The total amount you have to pay is: %.2f\n", totalAmount);

        // Close the scanner
        scanner.close();
    }
}