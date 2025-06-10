import java.nio.file.Files;
import java.nio.file.Paths;
public class writingToFile3 {
    public static void main(String[] args) throws Exception{
        String forwrite="testingforwriting.txt";
        String newcontent="Hello this file is written into manually by the third way";
        Files.write(Paths.get(forwrite),newcontent.getBytes());
        System.out.println("Content successfully inserted");
    }
}
