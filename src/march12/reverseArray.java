package march12;

public class reverseArray {
    public static void main(String[] args) {
      int [] numbers={10,9,8,7,6,5,4,3,2,1};
        System.out.println("Array before reverse: ");
        for(int number:numbers){
            System.out.print(number+" ");
        }
        for(int i=0; i<numbers.length/2; i++){
            int box=numbers[i];
            numbers[i]=numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]=box;
        }
        System.out.println();
        System.out.println("Array reversed: ");
        for(int val:numbers){
            System.out.print(val+" ");
        }
    }


}
