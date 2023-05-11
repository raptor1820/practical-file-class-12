import java.util.Scanner; //importing Scanner class

public class Convert {
    int n, d, m, y;

    // constructor
    Convert() {
        n = 0;
        d = 0;
        m = 1;
        y = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number and year");
        n = sc.nextInt();
        y = sc.nextInt();
    }

    void dayToDate() {
        int[] daysinmonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30,
                31, 30, 31 };
        // checks for leap year
        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    daysinmonth[1] = 29;
                } else {
                    daysinmonth[1] = 28;
                }
            } else {
                daysinmonth[1] = 29;
            }
        } else {
            daysinmonth[1] = 28;
        }

        int n_c = n;
        // adding months and days
        for (int i = 0; i < daysinmonth.length && daysinmonth[i] < n_c; i++) {
            n_c -= daysinmonth[i];
            m++;
        }
        d += n_c;
    }

    void display() {
        // switch case for month
        String s = "";
        switch (m) {
            case 1:
                s = "January";
                break;
            case 2:
                s = "February";
                break;
            case 3:
                s = "March";
                break;
            case 4:
                s = "April";
                break;
            case 5:
                s = "May";
                break;
            case 6:
                s = "June";
                break;
            case 7:
                s = "July";
                break;
            case 8:
                s = "August";
                break;
            case 9:
                s = "September";
                break;
            case 10:
                s = "October";
                break;
            case 11:
                s = "November";
                break;
            case 12:
                s = "December";
                break;
        }
        System.out.println("the date is " + s + " " + d + ", " + y);
    }

    public static void main(String[] args) {
        Convert c = new Convert();
        c.accept();
        c.dayToDate();
        c.display();
    }
}
