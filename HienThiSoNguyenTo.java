import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố:");
        int number = input.nextInt();
        int count = 0;
        int N = 2;

        while (count < number) {
            if (isPrime(N)) {
                System.out.println(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}