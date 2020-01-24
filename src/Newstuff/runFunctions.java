package Newstuff;

public class runFunctions {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 10, 15};
        int halfArray = array1.length / 4;
        int array1size = array1.length;
        int[] newArray = new int[array1.length];
        int maxIndex = 0;


        for (int i = 0; i <= array1size - 1; i++) {

            int minValue = array1[0];
            int maxValue = array1[0];
            for (int c = 1; c <= array1size - 1; c++) {
                if (array1[c] < minValue)
                    minValue = array1[c];
                if (array1[c] > maxValue)
                    maxValue = array1[c];
            }

            newArray = new int[array1size];
            newArray[i] = minValue;  //newArray[0] = min    newArray[length -1 -0] = max
            newArray[array1size - 1 - i] = maxValue;

            if (array1[i] == maxValue)
                    maxIndex = i;

                System.out.println("maxindex: " + maxIndex);


            }

        for (int c : newArray){
            System.out.println(c);
        }


        }


    }




        //for(int c:newArray){
            //System.out.println(c);






