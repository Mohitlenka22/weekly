import java.util.Scanner;

class Student {
    String name;
    int roll;

    Student() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = s.next();
        System.out.println("Enter roll: ");
        roll = s.nextInt();
        System.out.println(name + " and " + roll);

    }

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    void get(){
        System.out.println(name + " " + roll);
    }
}

public class w21{
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj2 = new Student("Mohit", 22);
        obj2.get();
    }
}
