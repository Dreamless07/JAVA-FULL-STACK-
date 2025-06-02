import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size =sc.nextInt();
        int array[]=new int[size];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The reverse of the array is: ");
        for (int i=size-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}
