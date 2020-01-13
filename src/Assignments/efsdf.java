package Assignments;

public class efsdf {

    public static int sum(int numOne, int numTwo){
        int total = numOne + numTwo;

        return total;   //return data type determines public static int
    }

    public static void main(String[] args) {
        int total = sum(44,100);
        System.out.println(total);

        if (total>10){
            System.out.println("high");
        }



    }



}

