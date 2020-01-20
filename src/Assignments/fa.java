package Assignments;

public class fa {

    public static void main(String[] args) {


        int[] arr = {10,5,300,100}; //i = 0, i <= length - 1
        int arrSize = arr.length;

        int min = arr[0];
        int max = arr[1];
        int[] arr2 = new int[4];

        for (int i = 0; i <= arrSize - 1; i++){
            if(arr[i]>max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }
        int newMin = arr[2];
        int newMax = arr[3];

        for(int i = 0; i < arrSize - 1; i++){


            if(!(arr[i] == max) && !(arr[i] == min) && arr[i]>newMax){
                newMax = arr[i];
            }

            if(!(arr[i] == max) && !(arr[i] == min) && arr[i]<newMin){
                newMin = arr[i];
            }

        }
        arr2[0] = min;
        arr2[1] = newMin;
        arr[2] = newMax;
        arr2[3] = max;



        //set max
        //set min


    }
}
