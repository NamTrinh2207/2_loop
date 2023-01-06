import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n = ");
        int numbers = scanner.nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", numbers);
        int count = 0;
        int n = 2;
        while (count < numbers) {
            if (isPrimeNumber(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

    //Hàm check số nguyên tố
    public static boolean isPrimeNumber(int i) {
        if (i < 2) {
            return false;
        }
        for (int j = 2; j <= i - 1; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
