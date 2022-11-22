import java.util.Scanner;

public class w22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0 && arr[i] % 2 != 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
