
// to print all the possible Boolean combinations for the given number of variables 
import java.util.Scanner;

public class booleancomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of variables");
        int n = sc.nextInt();
        int i = 0;
        while (i < Math.pow(2, n)) {
            // binary string method
            String s = Integer.toBinaryString(i);
            int l = s.length();
            if (l < n) {
                for (int j = 0; j < n - l; j++) {
                    s = "0" + s;
                }
            }
            System.out.println(s);
            i++;
        }
        sc.close();
    }
}
