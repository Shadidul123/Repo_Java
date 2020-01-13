package Assignments;

public class newhw {


    public static void stringReversal(String sample){
        //#1
        int strLen = sample.length();
        String reversed = "";
        for (int i = 0; i <= strLen - 1; i++) {
            reversed = reversed + sample.charAt(strLen - 1 - i);
        }
        System.out.println(reversed);
    }

    //#2 ///how would specify array data type?
    public static void arrayReverse(int[] Num){
        int lengthArray = Num.length;
        int[] reversal = new int[lengthArray];
        for (int i = 0; i <= lengthArray - 1; i++) {
            reversal[i] = Num[lengthArray - 1 - i];
        }
        System.out.println(reversal);

    }

    //#3
    public static void sumArray(int[] testScores){
        int Sum = 0;
        int length = testScores.length;
        for (int i = 0; i <= length - 1; i++) {
            Sum = Sum + testScores[i];
        }
        System.out.println(Sum);

    }

    //#4 not sure how to proceed;

    //#5
    public static void Average(int[] freq){
        int total = 0;
        int freqLength = freq.length;
        for (int i = 0; i <= freqLength - 1; i++) {
            total = total + freq[i];
        }
        double add = total;
        double Average = add / freqLength;
        System.out.println(Average);

    }

    //#6
    public static void maxValue(int[] nz ){
        int nzLen = nz.length;

        int max = nz[0];

        for (int i = 1; i <= nzLen - 1; i++) {
            if (nz[i] > max) {
                max = nz[i];
            }
        }
        System.out.println("Max value of: " + max);
    }

    //#7

    public static void minVal(int[] digits ){
        int min = digits[0];
        int digLen = digits.length;
        int n;
        for(n =1; n<digLen; n++){
            if(digits[n]<min){
                min = digits[n];
            }
        }
        System.out.println("Minimum value of: "+ min);

    }

    //#8
    public static String abbreviate(String r){
        String [] w = r.split(" ");
        String abbr = "";
        for (String c:w){
            abbr = abbr + c.charAt(0);
        }
        return abbr;

    }
    //#10
    public static void smartestKid(String[] kids, int[] grades){
        //find max grade
        int maxGrade = grades[0];
        int kidLen = kids.length;
        int gradesLen = grades.length;
        for (int i = 1; i <= kidLen - 1; i++){
            if(grades[i]>maxGrade){
                maxGrade = grades[i];
            }
        }
        //find index of value maxGrade
        int index = 0;
        for (int x = 0; x <gradesLen; x++){
            if(grades[x] == maxGrade){
                index = x;

            }
        }

        //whatever index it is match same index to string array
        System.out.println(kids[index]);

    }

    //#11
    public static int addUpTo(int x){
        //addUpto(5x) = 5+4+3+2+1
        int sum = 0;
        for (int i = 0; i <= x; i++){
            sum = sum + (5-i);
        }

        return sum;

    }

    public static void main(String[] args) {
        //#1
        stringReversal("MAD");

        //#2
        int[] numbers = {1,2,3,4};
        arrayReverse(numbers);

        //#3
        int[] G = {100,90,80};
        sumArray(G);

        //#4not sure

        //#5
        int[] X = {133, 209, 300, 400, 500};
        Average(X);

        //#6
        int[] px = {10,20,5,500,200,10};
        maxValue(px);

        //#7

        int [] drx = {10,20,-1,-100,400};
        minVal(drx);


        //#8

        String r = "Good Night Everyone";
        abbreviate(r);
        System.out.println(abbreviate(r));


        //#10
        String[] names = {"Josh", "Amy", "Tree","Duke"};
        int[] Numbers = {25,100,45,95};
        smartestKid(names, Numbers);

        //#11
        addUpTo(5);
        System.out.println(addUpTo(5));








    }
}