import java.util.Scanner;
public class countOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size =sc.nextInt();
        int array[]=new int[size];
        int even=0, odd=0;
        System.out.println("Enter the array elements: ");
        for (int i=0;i<array.length;i++) {
            array[i] = sc.nextInt();
            if (array[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The number of even elements are "+even+" and number of odd are "+odd);
    }
}
