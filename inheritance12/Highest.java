import java.util.Scanner;

//superclass defined to test the program
class Record { // This is the superclass
    String[] n;
    int[] m;
    int size;

    Record(int cap) {
        size = cap;
        n = new String[size];
        m = new int[size];

    }

    void readarray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter marks and name");
            n[i] = sc.next();
            m[i] = sc.nextInt();
        }

    }

    void display() {
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + "got" + m[i] + "marks");
        }
    }
}

public class Highest extends Record { // This is the subclass
    int ind;

    Highest(int cap) {
        // call to superclass constructor
        super(cap);
        ind = 0;
    }

    void find() {
        int max = m[0];
        for (int i = 1; i < size; i++) {
            if (m[i] > max) {
                max = m[i];
                ind = i;
            }
        }
    }

    void display() {
        // call to superclass method
        super.display();
        int high = m[ind];
        for (int i = 0; i < size; i++) {
            if (m[i] == high) {
                System.out.println(n[i] + " " + m[i]);
            }
        }
    }
}
