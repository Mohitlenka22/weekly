import java.util.*;

public class w12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = Double.parseDouble(args[0]);
        System.out.println("area: " + Math.PI * r * r);
        System.out.println("Enter radius: ");
        double rad = s.nextDouble();
        System.out.println("Area: " + Math.PI * rad * rad);

    }
}
