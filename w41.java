import java.util.*;

public class w41 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = s.nextInt();
        System.out.println("Enter str: ");
        String str = s.next();
        String[] arr = new String[n];
        int part = str.length() / n;
        int x = 0;
        int c = 1;
        for (int i = 1; i < str.length() + 1; i++) {
            if (i % part == 0) {
                arr[x] = str.substring(c - 1, i);
                x++;
                c = i + 1;
            } else {
                continue;
            }
        }
        for (String y : arr) {
            char ch[] = y.toCharArray();
            Arrays.sort(ch);
            System.out.println(ch);

        }

    }
}
