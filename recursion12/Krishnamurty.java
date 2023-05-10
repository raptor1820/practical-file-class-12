import java.util.*;

public class Krishnamurty {
    int M, N;

    public Krishnamurty(int mm, int nn) {
        M = mm;
        N = nn;
    }

    int factorial(int X) {
        if (X == 0) {
            return 1;
        } else {
            return X * factorial(X - 1);
        }
    }

    boolean isKrishnamurty(int X) {
        boolean flag = false;
        int sum = 0;
        if (X == 0) {
            flag = false;
            return flag;
        }
        for (int i = X; i != 0; i /= 10) {
            int dig = i % 10;
            sum += factorial(dig);
        }
        if (sum == X) {
            flag = true;
        }
        return flag;
    }

    void printAll() {
        for (int i = M; i <= N; i++) {
            if (isKrishnamurty(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Krishnamurty k = new Krishnamurty(m, n);
        k.printAll();
    }
}
