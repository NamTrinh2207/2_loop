public class Main {
    public static void main(String[] args) {
        System.out.print("Các số nguyên tố nhỏ hơn 100 là : ");
        int n = 100;
        int i = 2;

        while (i <= n) {
            if (checkSnt(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    //Hàm check số nguyên tố
    public static boolean checkSnt(int i) {
        if (i < 2) {
            return false;
        }
        double square = Math.sqrt(i);
        for (int j = 2; j <= square; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
