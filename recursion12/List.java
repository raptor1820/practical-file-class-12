import java.util.Scanner;

public class List {
    int arr[];
    int N;

    List(int m) {
        N = m;
        arr = new int[N];
    }

    void readArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
    }

    boolean isSorted(int a[], int n) {
        if (n == 1) {
            return true;
        }
        if (a[n - 1] < a[n - 2]) {
            return false;
        }
        return isSorted(a, n - 1);
    }

    int binarySearch(int first, int last, int X) {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;
        if (arr[mid] == X) {
            return mid;
        }
        if (arr[mid] > X) {
            return binarySearch(first, mid - 1, X);
        }
        return binarySearch(mid + 1, last, X);
    }

    void find() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (isSorted(arr, N)) {
            int index = binarySearch(0, N - 1, X);
            if (index == -1) {
                System.out.println("Not found");
            } else {
                System.out.println("Found at index " + index);
            }
        } else {
            System.out.println("Not found");
        }
    }

}
