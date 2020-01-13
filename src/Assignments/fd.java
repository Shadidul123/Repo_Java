package Assignments;

public class fd {

    public static void main(String[] args) {

        String myString = "reverse";
        int Stringlen = myString.length();
        String reversed = "";

        //reversed = reversed + myString.charAt(Stringlen - 1);

        for (int i = 0; i <= Stringlen-1; i++){
            reversed = reversed + myString.charAt(Stringlen -1 -i);
        }

        System.out.println(reversed);

        for (int i = 0; i <= Stringlen -1; i++) {
            System.out.println(myString.charAt(Stringlen-1-i));
        }


        int [] arr = {10,20,30,40}; // arr[0] + arr[1] +..+arr[arrLen-1]
        int arrLen = arr.length;

        int Sum = 0;
        for (int i = 0; i <= arrLen-1; i++){
            //System.out.println(arr[i]);
            Sum = Sum + arr[i];
        }

        System.out.println(Sum);


    }
}
