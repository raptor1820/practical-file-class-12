import java.util.Scanner;

class Iscscores {
    int number[][];

    Iscscores() {
        Scanner sc = new Scanner(System.in);
        number = new int[6][2];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter the marks and subject code");
            number[i][0] = sc.nextInt();
            number[i][1] = sc.nextInt();
        }
    }

    int point(int marks) {
        if (marks >= 90) {
            return 1;
        }
        if (marks >= 80) {
            return 2;
        }
        if (marks >= 70) {
            return 3;
        }
        if (marks >= 60) {
            return 4;
        }
        if (marks >= 50) {
            return 5;
        }
        if (marks >= 40) {
            return 6;
        }
        return 7;
    }

}

public class bestfour extends Iscscores {
    void bestsubjects() {
        int[] points = new int[6];
        for (int i = 0; i < number.length; i++) {
            points[i] = point(number[i][0]);
        }
        int[] best = new int[4];
        for (int i = 0; i < best.length; i++) {
            int max = points[0];
            int ind = 0;
            for (int j = 1; j < points.length; j++) {
                if (points[j] > max) {
                    max = points[j];
                    ind = j;
                }
            }
            best[i] = ind;
            points[ind] = 0;
        }
        for (int i = 0; i < best.length; i++) {
            System.out.println(number[best[i]][0] + " " + number[best[i]][1]);
        }
    }

}
