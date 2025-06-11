import java.io.FileInputStream;//inbuilt library
public class readFile2 {
    public static void main(String[] args) {
        String readstr ="testing.txt";
        int read2;
        try(FileInputStream inob =new FileInputStream(readstr)){
            while((read2= inob.read())!=-1){//read every char till end
                System.out.println(read2);//no typecasting just bcz it will print in asci value
            }
        }
        catch(Exception e){
            System.out.println(readstr);
        }
    }
}
