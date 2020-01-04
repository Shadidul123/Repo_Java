package Assignments;

import java.util.Scanner;

public class ifstatementhw {

    public static void main(String[] args) {

        //#1.
        boolean isGuestOneVegan = false;
        boolean isGuestTwoVegan = false;
        String menu = "allfooditems";
        String veganFood = "veganFood";
        String  strictVegan = "strictlyVegan";

        if (isGuestOneVegan == true && isGuestOneVegan == true){
            System.out.println(strictVegan);
        }

        else if (isGuestOneVegan == true || isGuestTwoVegan == true) {
            System.out.println(veganFood);
        }
        else{
            System.out.println(menu);
        }



        // if both vegan -> only vegan
        //if one vegan -> offer vegan
        //If neither vegan -> offer everything

        //#2 Car mode

        String mode = "P";
        String parkingType = "parallel";
        String invalidMode = "Invalid mode type, please check your car mode.";

        if (mode.equals("P") && parkingType.equals("parallel")) {
            System.out.println("You can park between two cars.");
        }
        else if (mode.equals("D")){
            System.out.println("You can put the car in Snow, Sport, or Regular Type");
        }
        else if (mode.equals("N")) {
            System.out.println("You can put the car in car wash station.");
        }
        else if (mode.equals("R")) {
            System.out.println("You can only reverse the car and car will activate back camera.");
        }
        else {
            System.out.println(invalidMode);
        }

        //#3.


        Scanner numKey = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = numKey.nextInt();

        if (num % 15 == 0){
            System.out.println("Divisible by 15");
        }
        else {
            System.out.println(num % 15);
        }


        //#4


        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = name.next();

        String newName = userName.replace("a", "A");
        String upperCaseName = userName.toUpperCase();

        if (userName.length() > 8) {
            System.out.println(newName);
        }

        else {
            System.out.println(upperCaseName);
        }


        //#5

        int[] numbers = {1, 2, 3, 4 ,6};
        int Sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        double Avg = Sum/5.0;
        System.out.println(Avg);

        if (Avg > 25.0) {
            System.out.println(numbers[0]);
            System.out.println(numbers[1]);
            System.out.println(numbers[2]);
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
        } else {
            //System.out.println("");
            System.out.println(numbers[4]);
            System.out.println(numbers[3]);
            System.out.println(numbers[2]);
            System.out.println(numbers[1]);
            System.out.println(numbers[0]);
        }

        //6.

        String item = "Apple";
        switch (item) {
            case "Milk":
            case "Eggs":
            case "Donuts":
                System.out.println("Aisle 8 ");
                break;

            case "French Fries":
            case "Frozen Pizza":
                System.out.println("Aisle 7");
                break;

            case "Candy":
                System.out.println("Aisle 3");
                break;

            case "Apple":
            case "Orange":
                System.out.println("Aisle 2");
                break;

            case "Diapers":
                System.out.println("Aisle 1");
                break;

            default:
                System.out.println("Out of Stock");



        }






















    }




}
