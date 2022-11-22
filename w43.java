import java.util.*;

public class w43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        String s2 = s.next();
        if (s1.length() == s2.length()) {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            boolean flg = Arrays.equals(ch1, ch2);
            if (flg) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        } else {
            System.out.println("Not anangram");
        }

    }
}
