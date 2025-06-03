import java.util.Scanner;
public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] transpose=new int[col][row];
        int[][] matrixnew=new int[row][col];
        System.out.println("Enter the elements for the First matrix:");
        for(int i=0;i<row;i++){//for row
            for(int j=0;j<col;j++){//for coloumn
                matrixnew[i][j]=sc.nextInt();//input from user stored in i and j indexes in matrix
            }
        }
        for(int i=0;i<row;i++) {//for row
            for(int j = 0; j < col; j++) {//for coloumn
                transpose[j][i] = matrixnew[i][j];//transpose logic
            }
        }
        System.out.println("The transpose of the given matrix is: ");
        for(int i=0;i<col;i++) {//iterate col first then rows
            for(int j = 0; j < row; j++) {
                System.out.print(transpose[i][j]+" ");//print
            }
            System.out.println();
        }
    }
}
