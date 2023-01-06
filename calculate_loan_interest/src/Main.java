import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double money = input.nextDouble();

        System.out.print("Enter investment month: ");
        int month = input.nextInt();

        System.out.print("Enter investment interestRate: ");
        double interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest = money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}