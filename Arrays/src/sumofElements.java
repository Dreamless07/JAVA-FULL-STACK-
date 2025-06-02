public class sumofElements {
    public static void main(String[] args) {
        int a[]={1,7,7,8,4,5,9};//normal declaration and definition
        int sum=0;
        for(int i=0;i<a.length;i++) {
            sum = sum + a[i];
            System.out.println(sum);//print sum
        }
        int a2[]=new int[5];//instantanious declaration
        a2[0]=10;
        a2[1]=20;
        a2[2]=65;
        a2[3]=15;
        a2[4]=10;
        int sum2=0;
        for(int i=0;i<a2.length;i++){
            sum2 = sum2 + a2[i];
            System.out.println(sum2);//print sum
        }
    }
}
