import java.io.File;//inbuilt libraries
public class creatingFile {
    public static void main(String[] args) throws Exception{
        String a="testingforwriting.txt";//new file
        File newfile=new File(a);//file object
        if(newfile.createNewFile()){//if file created then
            System.out.println("File created successfully");
        }
        else {
            System.out.println("Please Retry ");//else
        }
    }
}
