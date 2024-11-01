import java.util.Scanner;

public class IT24103975Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: amount in rupees
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        // Define denominations
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] notesCount = new int[denominations.length];

        // Calculate number of notes and coins for each denomination
        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                notesCount[i] = amount / denominations[i];
                amount %= denominations[i];
            }
        }

        // Output the number of notes and coins
        System.out.println("Denominations:");
        for (int i = 0; i < denominations.length; i++) {
            if (notesCount[i] > 0) {
                System.out.println(denominations[i] + " : " + notesCount[i]);
            }
        }

        // Close the scanner
        scanner.close();
    }
}