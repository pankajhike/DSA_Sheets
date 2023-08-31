package DSA_Sheets.Arrays;

public class Maximum_Element_Array {
    public static void main(String[] args) {
        int max =0;
        int arr[]={1,5,7,8,4,6,42,7};
        for (int i=0; i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max + " ");
    }
}
