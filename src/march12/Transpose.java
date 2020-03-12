package march12;

public class Transpose {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int length=matrix.length;
        int length1=matrix[0].length;
        System.out.println(length);
        System.out.println(length1);
        for(int row[] :matrix){
            for(int num:row){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
        System.out.println("transpose of matrix : ");
        if(matrix.length>0){
            for(int i=0; i<matrix[0].length; i++){
                for(int j=0; j<matrix.length;j++){
                    System.out.print(matrix[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}
