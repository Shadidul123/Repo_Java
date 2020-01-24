package Newstuff;

public class test1 {
    public static void main(String[] args) {

       //reverse String
        String sample = "sample";
        String reverse = "";

        int strLen = sample.length();

        for (int i = 0; i <= strLen - 1; i++) {
            reverse = reverse + sample.charAt(strLen - 1 - i);

        }
        System.out.println(reverse);


        //reverse array

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = new int[4];

        int arraySize = array1.length;

        for (int i = 0; i <= arraySize - 1; i++) {
            array2[i] = array1[arraySize-1-i];

        }

        int[] digs = {0,1,2,3};
        int Sum = 0;
        int digSize = digs.length;
        for(int i = 0; i<= digSize-1;i++){
            Sum = Sum + digs[i];
        }

        //sort an array from lowest to highest

        int[] numbers = {100,2,200,4};

        int numbersLength = numbers.length;
        for (int i = 0; i<= numbersLength-1; i++){
            for (int j = i+1; j<= numbersLength-1; j++){
                if(numbers[i]>numbers[j]){
                    int bigVal = numbers[i];
                    int smallVal = numbers[j];
                    numbers[i] = smallVal;
                    numbers[j] = bigVal;
                }
            }
            System.out.println(numbers);


        }

        //find avg
        int[] u = {1,2,3,5};
        int sum = 0;
        int length = u.length;
        for(int i =0; i<= length-1; i++ ){
            sum = sum + u[i];
        }
        int avg = sum/length;

        //find max//same as min
        int[] x = {100,10,1000};
        int sizeArr = x.length;
        int max = x[0];
        for (int i = 0; i<=sizeArr-1;i++){
            if(x[i]>max){
                max = x[i];
            }
        }

        // abbreviate string

        String name = "World Wrestling Entertainment";
        String[] names = name.split(" ");
        String abr = "";
        for(String nm: names){
            abr = abr + nm.charAt(0);

        }
        System.out.println(abr);

        //2 arrays match higest grade w student

        String[] students = {"Max","Ruby", "Charles", "Jake", "Lily"};
        int[] grades = {90,25,100,90,40};
        //find max
        int gradeSize = grades.length;
        int studentSize = students.length;
        int maxGrade = grades[0];
        for(int i = 0; i<= gradeSize-1;i++){
            if(grades[i]>maxGrade){
                maxGrade = grades[i];

            }
        }
        //find index at which max occurs;
        int maxIndex = 0;
        for (int i = 0; i<=gradeSize-1; i++){
            if(grades[i]== maxGrade){
                maxIndex = i;
            }
        }
        System.out.println(students[maxIndex]);



        //add up t given #

        }












    }

