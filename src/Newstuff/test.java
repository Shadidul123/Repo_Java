package Newstuff;

import java.util.Scanner;

public class test {
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
            for (int i = 0; i <= arrayLen-1; i++) {
                for (int x = 1; x < maxVal; x++) {
                    if (num[i] != x) {
                        System.out.println(x);
                    }
                }
            }
        } while(z>z);

        //example 3
        int speedLimit = 70;
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter driver's speed: ");
        int driverSpeed = scanner.nextInt();
        int aboveSpeedLimit = driverSpeed - speedLimit;

        if (driverSpeed > speedLimit) {
            points = aboveSpeedLimit / 5;
            Math.floor(points);
            if (points > 12) {
                System.out.println("Suspended license");
            }
        }

        System.out.println("points: " + points);

        //example2

        int[] array1 = {1, 2, 2, 2, 3, 4, 4,4, 1,500,6, 6};
        int lengthArray = array1.length;


        for (int i = 0; i <= lengthArray - 1; i++) {                 //do it once just to get the repeating elements
            do {
                for (int j = i + 1; j <= lengthArray - 1; j++) {
                    if (array1[i] == array1[j]) {
                        System.out.println(array1[j]);

                    }
                }

            } while (i > i);
                                          //make condition false so it just runs once
        }




        //  75,80,85,90,95,100,105,110,115,120,125,130
        //  # of points = multiple of 5
        //  75(speed) - 70(speed limits) = 5
        //       (5  /5 = 1 points
        //  80(givespeed) - 70(speed limit) = 10
        //  10/5 = 2 points


    }
}
