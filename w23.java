import java.util.Scanner;

public class w23 {
 public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter n: ");
    int n = s.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = s.nextInt();
    }
    for(int i = 0; i < n; i++){
        boolean flag = false;
        for(int j = 0; j < i; j++){
            if(arr[i] == arr[j])
                flag = true;
        }
        if(flag == true)
            continue;
        int freq = 1;
        for(int j = i+1; j<n; j++){
            if(arr[i] == arr[j])
                freq++;
        }
        System.out.println(arr[i] + " " + freq);
    }

 }   
}
