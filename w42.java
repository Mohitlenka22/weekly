import java.util.Scanner;

public class w42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = s.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i< n; i++){
            arr[i] = s.next();
        }
        for(String y : arr){
            int v=0,c=0;
            char ch[] = y.toCharArray();
            for(char x:ch){
                if(x == 'a' || x == 'e' || x =='o'|| x == 'i' || x == 'u'){
                    v++;
                }
                else{
                    c++;
                }
            }
            System.out.println(y + " " + v + " " + c);
        }
    }
}
