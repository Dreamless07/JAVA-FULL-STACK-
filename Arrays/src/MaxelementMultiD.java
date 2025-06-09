import java.util.Scanner;
public class MaxelementMultiD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] storeMatrix =new int[row][col];
        System.out.println("Enter the elements for the matrix:");
        for(int i=0;i<row;i++){//for row
            for(int j=0;j<col;j++){//for coloumn
                storeMatrix[i][j]=sc.nextInt();//input from user stored in i and j indexes in matrix
            }
        }
        int max=storeMatrix[0][0];
        for (int i=1;i<storeMatrix.length;i++){
            if(storeMatrix[i][i]>max){
                max=storeMatrix[i][i];
            }
        }
        System.out.println("The maximum element is: ");
        System.out.println(max);
    }
}
