package march12;

import java.util.Arrays;

public class compareArrays {
    public static void main(String[] args) {
        int []arr1={44,56,89};
        int [] arr2={44,56,89};
       //for(int i=0; i<arr1.length; i++){
         if(Arrays.equals(arr1,arr2)){
           // if(arr1[0]==arr2[0]&&arr1[1]==arr2[1]&&arr1[2]==arr2[2]){
            System.out.println("Same");
        }
        else {
            System.out.println("not the same");
        }
    }
}
