import java.util.Scanner;

public class Kaprekar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int count = 0;
        for (int i = p; i <= q; i++) {
            int square = i * i;
            int digits = 0;
            int temp = square;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            int pow = (int) Math.pow(10, digits / 2);
            if (i != 1 && square % pow == 0)
                continue;
            int sum = square / pow + square % pow;
            if (sum == i && sum % 10 != 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("total number of kaprekar numbers are " + count);
    }
}
