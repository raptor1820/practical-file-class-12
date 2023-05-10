import java.util.Scanner;

public class Test {
    String sentence;

    Test(String s) {
        sentence = s;
    }

    String revWord(String s, int i) {
        if (i == s.length() - 1) {
            return s.charAt(i) + "";
        }
        return revWord(s, i + 1) + s.charAt(i);
    }

    int countPalindromicWords() {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (word.equals(revWord(word, 0))) {
                count++;
            }
        }
        return count;
    }

    void printSentenceInReverse() {
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Test t = new Test(s);
        System.out.println(t.countPalindromicWords());
        t.printSentenceInReverse();
    }
}
