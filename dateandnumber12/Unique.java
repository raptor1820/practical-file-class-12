import java.util.Scanner;

class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            // check if digits of number are unique
            int temp = i;
            boolean[] digits = new boolean[10];
            boolean unique = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (digits[digit]) {
                    unique = false;
                    break;
                }
                digits[digit] = true;
                temp /= 10;
            }
            if (unique) {
                System.out.print(i + " ");
            }
        }
    }
}