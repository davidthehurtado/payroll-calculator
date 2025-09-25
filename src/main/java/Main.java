import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.print("Enter your hours worked: ");
        double hoursWorked = Double.parseDouble(myScanner.nextLine());

        System.out.print("Enter your pay rate: ");
        double payRate = Double.parseDouble(myScanner.nextLine());

        double grossPay = hoursWorked * payRate;

        System.out.println("Payroll Summary for " + name);
        System.out.printf("Gross Pay: $%.2f%n", grossPay);

    }
}
