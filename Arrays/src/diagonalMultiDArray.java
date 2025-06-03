public class diagonalMultiDArray {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};//2D array declaration and definition
        System.out.println("The 2D array elements left diagonal are:");
        for (int i = 0; i < matrix.length; i++) {//for row
            System.out.print(+matrix[i][i] + " ");//for left diagonal
        }
        System.out.println();//for changing the line

        System.out.println("The 2D array elements of right diagonal are:");
        for (int i = 0; i < matrix.length; i++) {//for row
             int j = 2 - i;//runs only once for each value of i
            System.out.print(+matrix[i][j] + " ");//for right diagonal
        }

            /*                 OR
            System.out.println("The 2D array elements of right are:");
            for (int i = 0; i <array.length; i++) {
                System.out.print(+matrix[i][matrix.length-1-i]);
            }
             */
    }
}
