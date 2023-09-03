package DSA_Sheets.Arrays;

import java.util.Arrays;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k =3;
        int smallest=0;

        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            smallest = arr[k-1];
        }
        System.out.println(smallest);
    }
}
