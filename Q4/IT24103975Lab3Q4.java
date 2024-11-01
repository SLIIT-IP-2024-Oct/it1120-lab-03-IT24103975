import java.util.Scanner;

public class IT24103975Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        // Check if the number is five digits
        if (number < 10000 || number > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            // Convert number to string to separate digits
            String numberStr = Integer.toString(number);

            // Print the digits separated by a space
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i) + " ");
            }
            System.out.println(); // for a new line at the end
        }

        // Close the scanner
        scanner.close();
    }
}