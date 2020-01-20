package Assignments;

public class methods {
    public static void main(String[] args) {
        sayHi();
        cube(2);
        System.out.println(cube(4));

    }

    public static void sayHi(){
        System.out.println("Hello");
    }

    public static int cube(int x){
        return x*x*x;
    }
}
