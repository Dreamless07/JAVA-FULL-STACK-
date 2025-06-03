public class basicMultiDArray {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};//2D array declaration and definition
        System.out.println("The 2D array elements are");
        for(int i=0;i<matrix.length;i++){//for row
            for(int j=0;j<matrix.length;j++){//for coloumn
                System.out.print(+matrix[i][j]+" ");//for spacing in between
            }
            System.out.println();//for changing the line
        }
    }
}
