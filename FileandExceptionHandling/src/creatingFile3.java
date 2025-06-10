import java.nio.file.Files;
import java.nio.file.Paths;

public class creatingFile3 {
    public static void main(String[] args) {
        String wittenfile="java.txt";
        try{
            Files.write(Paths.get("writtenfile"),"hello, this is the first written file".getBytes());
            System.out.println("File created and written to successfully");
        }
        catch (Exception e){
            System.out.println("Please Retry ");
        }
    }
}
