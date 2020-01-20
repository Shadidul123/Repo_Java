package Assignments;

public class add {

    public static void main(String[] args) {

        double[] total = {23.44, 15.24, 34.98,20.86,31.44,50.27,16.25,18.47,29.49,21.01,25.0, 32.37, 63.49,22.53,36.45,29.89,20.02,15.29,24.01,12.0,22.14,27.92,12.0,20.92,24.05,13.25,30.24,17.69,10.63,15.8,23.36,15.51,45.26,45.30,34.26,26.70,32.68,41.86};
        double sum = 0;
        int totalSize = total.length;
        for (int i =0; i <= totalSize - 1;i++){
            sum = sum + total[i];
        }
        System.out.println(sum);
    }
}
