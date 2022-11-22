import java.util.*;


class Myclass{
    public int add(int x , int y){
        return x+y;
    } 
    public int sub(int a, int b){
        return a-b;
    }
}

public class w13 {
    public static void main(String[] args) {
        Myclass obj = new Myclass();
        System.out.println(obj.add(1, 3));
        System.out.println(obj.sub(4, 7));
    }   
}
