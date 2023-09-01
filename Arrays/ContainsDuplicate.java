package DSA_Sheets.Arrays;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,3,3,4,3,2,4,2};
//        int arr[] = {1,2,3,4,5,6};
        System.out.println(containsDuplicate(arr));

    }
}
