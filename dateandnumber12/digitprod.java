import java.util.Scanner;

public class digitprod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i = 9;
        int[] a = new int[10];
        int j = 0;
        while (i > 1) {
            if (n % i == 0) {
                a[j] = i;
                j++;
                n = n / i;
            } else {
                i--;
            }
        }
        if (n == 1) {
            for (int k = j - 1; k >= 0; k--) {
                System.out.print(a[k]);
            }
        } else {
            System.out.println("not possible");
        }

    }
}
