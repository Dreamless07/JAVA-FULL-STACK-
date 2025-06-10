import java.nio.file.Files;
import java.nio.file.Paths;//inbuilt methods

public class creatingFile3 {
    public static void main(String[] args) {
        String wittenfile="java.txt";//create file
        try{
            Files.write(Paths.get("writtenfile"),"hello, this is the first written file".getBytes());//3rd way creation and writing into file
            System.out.println("File created and written to successfully");
        }
        catch (Exception e){
            System.out.println("Please Retry ");//in case of exception
        }
    }
}
