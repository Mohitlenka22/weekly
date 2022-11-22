class Box{
    double w, h, d;
    Box(double wid, double hei, double dep){
        w = wid;
        h = hei;
        d = dep;
    }
    double volume(){
        return w*h*d;
    }
}
public class w31 {
    public static void main(String[] args) {
        Box obj = new Box(2.3, 10, 11);
        System.out.println(obj.volume());
    }
}
