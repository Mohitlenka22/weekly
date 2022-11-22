import java.lang.*;
import java.io.*;
import java.util.*;

public class w1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //command line 
        System.out.println(args[0] + " and " + args[1]);
        System.out.println("Enter name1: ");
        String name1 = s.next();
        System.out.println("Enter name2: ");
        String name2 = s.next();
        System.out.println(name1 + " and " + name2);
    }
}