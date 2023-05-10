import java.util.Scanner;

public class Amicable {
    int m, n;

    Amicable(int mm, int nn) {
        m = mm;
        n = nn;
    }

    int sumOf_Divisor(int n, int x) {
        if (x < n) {
            if (n % x == 0) {
                return x + sumOf_Divisor(n, x + 1);
            } else {
                return sumOf_Divisor(n, x + 1);
            }
        }
        return 0;

    }

    void checkAmicable() {
        int s1 = sumOf_Divisor(n, 1);
        int s2 = sumOf_Divisor(m, 1);
        if (s1 == m && s2 == n) {
            System.out.println("Amicable number");
        } else
            System.out.println("Not an Amicable number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Amicable a = new Amicable(m, n);
        a.checkAmicable();
    }
}
