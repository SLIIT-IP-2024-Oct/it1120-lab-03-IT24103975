import java.util.Scanner;

public class IT24103975Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // Input: number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();

        // Input: OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate OT amount
        double otAmount = otHours * otHourlyRate;

        // Calculate total salary
        double totalSalary = monthlySalary + otAmount;

        // Output the total salary
        System.out.printf("The total salary is: %.2f\n", totalSalary);

        // Close the scanner
        scanner.close();
    }
}