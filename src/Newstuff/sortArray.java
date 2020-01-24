package Newstuff;

public class sortArray {
    public static void main(String[] args) {

        int[] num = {3,1,2};
        int n = num.length;                        //  3, 1, 2


        for(int i = 0; i <n; i++){
            for(int j = i+1; j<n; j++ ){
                if(num[i]<num[j]){         // 100(i), 10(j),    num array
                    int smallVal = num[i];
                    int bigVal = num[j];
                    num[i] = bigVal;
                    num[j] = smallVal;

                }
            }

        }
        for(int c:num){
            System.out.println(c);
        }


    }


}
