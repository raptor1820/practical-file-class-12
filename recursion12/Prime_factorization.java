import java.util.Scanner;

public class Prime_factorization {
    int M;
    int N;

    Prime_factorization(int mm, int nn) {
        M = mm;
        N = nn;
    }

    void printPrimeFactors(int a, int b) {
        if (a == 1) {
            return;
        }
        if (a % b == 0) {
            System.out.print(b + " ");
            printPrimeFactors(a / b, b);
        } else {
            printPrimeFactors(a, b + 1);
        }
    }

    void display() {
        for (int i = M + 1; i < N; i++) {
            System.out.print(i + ": ");
            printPrimeFactors(i, 2);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Prime_factorization p = new Prime_factorization(m, n);
        p.display();
    }
}
