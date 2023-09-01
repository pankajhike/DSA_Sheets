package DSA_Sheets.Arrays;

public class Minimum_Array {
    public static void main(String[] args) {
        int arr[]={5,3,8,2,6,1,-1};
        int min= arr[0];
        for (int i=0; i< arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
