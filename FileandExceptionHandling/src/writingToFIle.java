import java.io.File;
import java.io.FileWriter;//inbuilt io and write libraries for methods used

public class writingToFIle {
    public static void main(String[] args) throws Exception{
        String writenew="testing.txt";//existing file
        File fileobj=new File(writenew);//file object
        FileWriter obj1=new FileWriter(fileobj);//writing object from existing file object
        obj1.write("This is a new file which is for testing writing methods");//print what you want in file
        System.out.println("Text added successfully!");
        obj1.close();//close the file
    }
}
