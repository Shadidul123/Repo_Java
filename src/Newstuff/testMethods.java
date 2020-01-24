package Newstuff;

import java.util.Scanner;

public class testMethods {

    //example 3
    public static int getPoints(int driverSpeed) {

        int speedLimit = 70;
        int points = 0;
        int aboveSpeedLimit = driverSpeed - speedLimit;

        if (driverSpeed > speedLimit) {
            points = aboveSpeedLimit / 5;
            Math.floor(points);
            if (points > 12) {
                System.out.println("Suspended license");
            }
        }

        return(points);
    }

    public static void main(String[] args) {

        //#1
        int[] num = {1, 3, 5, 5, 2, 7};
        int arrayLen = num.length;
        //find max value                   ///num[i] = 6
        int maxVal = num[0];

        for (int i = 0; i <= arrayLen - 1; i++) {
            if (num[i] > num[0]) {
                maxVal = num[i];
            }
        }
        int z = 0;
        do {
            for (int i = 0; i <= arrayLen - 1; i++) {
                for (int x = 1; x < maxVal; x++) {
                    if (num[i] != x) {
                        System.out.println(x);
                    }
                }
            }
        } while (z > z);
    }

        //example 2

        public static int[] removeElement(int[] arr1, int x){
            // frequence = repeititon

            int frequency = 0;
            boolean exists = false;

            for(int i =0; i<=arr1.length-1; i++){
                if(x==arr1[i]){
                    frequency++;
                    exists=true;
                }
            }

            if(!exists){
                return arr1;
            }

            //array2

            int[] array2 = new int[arr1.length-frequency];
            int a = 0;


            for (int i = 0; i< arr1.length; i++){
                if(x != arr1[i]){
                    array2[a] = arr1[i];
                    a++;
                }
            }
            return array2;
        }









}

