package Newstuff;

public class functions {

    public String reversal(String original){
        String reversal = "";
        int strLen = original.length();
        for (int i = 0; i< strLen; i ++){
            reversal = reversal + original.charAt(strLen -1 -i);
        }
        return reversal;
    }

    public int[] Reversal(int[] Grades){
        int arrayLength = Grades.length;
        int[] Reverse = new int[arrayLength];
        for(int i = 0; i<= arrayLength -1; i++){
            Reverse[i] = Grades[arrayLength-1-i];
        }
        return Reverse;
    }

    public int sumOfElements(int[] digits){
        int digLen = digits.length;
        int Sum = 0;
        for(int i =0; i<= digLen -1; i++){
            Sum = Sum + digits[i];
        }
        return Sum;
    }

    public double Avg(int[] num){
        double Sum = 0;
        int numLen = num.length;
        int i;
        for(i=0; i<= numLen -1; i++){
            Sum = Sum + num[i];
        }
        double avg = Sum/numLen;
        return  avg;
    }
    public int maxNumberFinder(int[] digits){
        int digLen = digits.length;
        int max = digits[0];
        int i;
        for(i = 1; i<=digLen-1;i++){
            if(digits[i]>max)
                max = digits[i];
        }
        return max;
    }

    public int minFinder(int[] digits){
        int digLen = digits.length;
        int min = digits[0];
        for(int i = 1; i<= digLen-1;i++){
            if(digits[i]<min)
                min = digits[i];
        }
        return min;
    }
    public String abbRord(String word){
        String abbr = "";
        String[] eng = word.split(" ");
        for(String c:eng){
            abbr = abbr + c.charAt(0);
        }
        return abbr;

    }

    public int addUpTo(int num){
        int Sum = 0;
        for(int i = 1; i<=num; i++){
            Sum = Sum + i;
        }
        return Sum;
    }





}
