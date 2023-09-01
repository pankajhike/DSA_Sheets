package DSA_Sheets.Arrays;

import java.util.Arrays;

public class Chocolate_Distribution_Problem {
    public static int minChocolateDifference(int[] chocolates, int m){
        int minDifference = Integer.MAX_VALUE;
        Arrays.sort(chocolates);
        for (int i=0; i+m-1<chocolates.length; i++){
            int difference = chocolates[i+m-1]-chocolates[i];
             if(difference<minDifference){
                 minDifference=difference;
             }
        }
        return minDifference;
    }

    public static void main(String[] args) {
    int chocolates[] = {7, 3, 2, 4, 9, 12, 56};
    int m =5;
       int  minDifference = minChocolateDifference(chocolates,m);
        System.out.println(minDifference);
    }
}
