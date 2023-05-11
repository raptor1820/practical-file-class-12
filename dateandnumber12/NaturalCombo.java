import java.util.Scanner; //importing Scanner class

public class NaturalCombo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int n = sc.nextInt();
        sc.close();

        int s, a = 1;
        // n/2 to prevent repeats
        while (a <= n / 2) {
            s = a;
            String combo = a + "";
            for (int i = a + 1; i <= n; i++) {
                s += i;
                combo += " + " + i;
                if (s == n) {
                    System.out.println(combo);
                    break;
                } else if (s > n) {
                    break;
                }
            }
            a++;
        }
    }
}
