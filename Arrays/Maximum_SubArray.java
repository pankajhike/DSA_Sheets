package DSA_Sheets.Arrays;

public class Maximum_SubArray {
    public static int maxSubArray(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i< arr.length; i++){
            currentSum += arr[i];
            maxSum = Math.max(currentSum,maxSum);
            if(currentSum < 0){
                currentSum=0;
         }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
//        int  arr[] = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));

    }
}
