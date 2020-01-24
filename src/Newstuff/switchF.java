package Newstuff;

import java.util.Scanner;

public class switchF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String Name = scanner.nextLine();

        switch(Name){
            case "Ani":
            case "Rana":
                System.out.println("Soccer");
                break;
            case "Deepak":
                System.out.println("Football");
                break;
            case "Ferdaous":
            case "Delwar":
            case "Ahsan":
                System.out.println("cricket");
                break;
            case "Ahmed":
            case "Bob":
                System.out.println("Not a fan of sports");
                break;
            default:
                System.out.println("Don't know");



        }






    }
}
