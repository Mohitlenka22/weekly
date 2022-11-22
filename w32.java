class Calc{
    int count = 0;
    Calc(){
        count++;
        System.out.println("count: " + count);
    }
    static int powerInt(int num1, int num2){
        int pow = 1;
        for(int i = 0; i < num2; i++ ){
            pow *= num1;
        }
        return pow;
    }
    static double powerDouble(double num1, double num2){
        double pow = num1;
        for(int i = 1; i < num2; i++){
            pow *= num1;
        }
        return pow;
    }
}


public class w32 {
    public static void main(String[] args) {
        System.out.println(Calc.powerInt(2, 3));
        System.out.println(Calc.powerDouble(1.1, 3));
    }
}
