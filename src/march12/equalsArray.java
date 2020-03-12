package march12;

import java.util.Arrays;

public class equalsArray {
    public static void main(String[] args) {
        int [] a1={3,4,5};
        int [] a2={3,4,5};
        if(Arrays.equals(a1, a2)){
            System.out.println("Equal elements");
        }
        else
            System.out.println("not equal");
        if(a1==a2){
            System.out.println("same objects");
        }
        else
            System.out.println("not same");
    }
}
