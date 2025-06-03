import java.util.Scanner;
public class additionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();//var for row and col
        int[][] matrix1=new int[row][col];
        int[][] matrix2=new int[row][col];
        int[][] matrix3=new int[row][col];//create 3 matrices,last for storing result
        //get elements for first matrix
        System.out.println("Enter the elements for the First matrix:");
        for(int i=0;i<matrix1.length;i++){//for row
            for(int j=0;j<matrix1.length;j++){//for coloumn
                matrix1[i][j]=sc.nextInt();//input from user stored in i and j indexes in matrix
            }
        }
        //get elements for second matrix
        System.out.println("Enter the elements for the Second matrix:");
        for(int i=0;i<matrix2.length;i++){//for row
            for(int j=0;j<matrix2.length;j++){//for coloumn
                matrix2[i][j]=sc.nextInt();//input from user stored in i and j indexes in matrix
            }
        }
        //add both and store in third matrix
        System.out.println("The result of the 2 matrices is :");
        for(int i=0;i<matrix1.length;i++){//for row
            for(int j=0;j<matrix2.length;j++){//for coloumn
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];//add and store in matrix 3
            }
        }
        //print the third matrix
        for(int i=0;i<matrix1.length;i++){//for row
            for(int j=0;j<matrix2.length;j++){//for coloumn
                System.out.print(matrix3[i][j]+" ");//print every element with spaces
            }
            System.out.println();//change line after every row completion
        }
    }
}
/*
                                    OPTIMIZED CODE WITH 2 NESTED LOOPS
import java.util.Scanner;

public class AdditionOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] result  = new int[row][col];

        // Input for both matrices and addition in one go
        System.out.println("Enter elements for Matrix 1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for Matrix 2 and get sum:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt();
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " "); // print sum directly
            }
            System.out.println(); // new line after each row
        }
    }
}
 */
