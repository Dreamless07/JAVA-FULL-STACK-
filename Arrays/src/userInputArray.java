import java.util.Scanner;
public class userInputArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n =sc.nextInt();
        int newarray[]=new int[n];
        System.out.println("Enter the array elements: ");
        for (int i=0;i<newarray.length;i++){
            newarray[i]=sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i=0;i<newarray.length;i++){
            System.out.println(newarray[i]);
        }
    }
}
