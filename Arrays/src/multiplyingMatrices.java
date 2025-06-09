import java.util.Scanner;
public class multiplyingMatrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter rows and columns for Matrix A:");
        int rowA = sc.nextInt();
        int colA = sc.nextInt();
        System.out.println("Enter rows and columns for Matrix B:");
        int rowB = sc.nextInt();
        int colB = sc.nextInt();
        if (colA != rowB) {
            System.out.println("Matrix multiplication is not possible because Columns of A must be equal to rows of B.");
            return;
        }
        int[][] matrixA = new int[rowA][colA];
        int[][] matrixB = new int[rowB][colB];
        int[][] matrixC = new int[rowA][colB];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(matrixC[i][j] + " ");
            }
            System.out.println();
        }
    }
}