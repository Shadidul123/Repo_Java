package Assignments;


import java.sql.SQLOutput;
import java.util.Scanner;

public class blahhhh {
    public static void main(String[] args) {

       //#1
        double score = 16;
        double maxScore = 20;
        double percent = score/maxScore * 100;

        if (percent >= 90 && percent <=100 ){
            System.out.println("A");
        }
        else if (percent >= 80 && percent <= 89){
            System.out.println("B");
        }
        else if (percent <= 79 && percent >= 70){
            System.out.println("C");
        }
        else if (percent <= 69 && percent >=60){
            System.out.println("D");
        }
        else
            System.out.println("F");


        //#2

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.println(num*i);
        }

        //#3

        Scanner Number = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int NUM = Number.nextInt();

        if (NUM != 2 && NUM % 2 == 0){
            System.out.println("not prime");
        }
        else if (NUM != 3 && NUM % 3 == 0){
            System.out.println("not prime");
        }
        else if (NUM != 5 && NUM % 5 == 0) {
            System.out.println("not prime");
        }
        else if (NUM !=7 && NUM % 7 == 0){
            System.out.println("not prime");
        }
        else
            System.out.println("prime");








    }
}
