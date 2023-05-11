import java.util.Scanner; //importing Scanner class

public class dateDiff {
    public static void main(String[] args) {
        // program to accept two dates in dd/mm/yyyy format and find the difference
        // between them in number of days
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first date in dd/mm/yyyy format");
        String s1 = sc.nextLine();
        System.out.println("enter the second date in dd/mm/yyyy format");
        String s2 = sc.nextLine();
        int d1 = Integer.parseInt(s1.substring(0, 2));
        int m1 = Integer.parseInt(s1.substring(3, 5));
        int y1 = Integer.parseInt(s1.substring(6));
        int d2 = Integer.parseInt(s2.substring(0, 2));
        int m2 = Integer.parseInt(s2.substring(3, 5));
        int y2 = Integer.parseInt(s2.substring(6));
        // checks for dates
        if (d1 > 31 || d2 > 31 || m1 > 12 || m2 > 12 || y1 < 0 || y2 < 0) {
            System.out.println("invalid date");
            System.exit(0);
        }
        int days = 0;
        int days1 = 0;
        int days2 = 0;
        int[] daysinmonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30,
                31, 30, 31 };
        for (int i = 0; i < m1 - 1; i++) {
            days1 += daysinmonth[i];
        }
        days1 += d1;
        for (int i = 0; i < m2 - 1; i++) {
            days2 += daysinmonth[i];
        }
        days2 += d2;
        for (int i = y1; i < y2; i++) {
            if (isLeap(i)) {
                days += 366;
            } else {
                days += 365;
            }
        }
        days += days2 - days1;
        System.out.println("the difference between the two dates is " + days + " days");
    }

    // check for leap year
    public static boolean isLeap(int y) {
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
