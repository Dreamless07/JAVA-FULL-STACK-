import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class readFile3 {
    public static void main(String[] args) {
        String newread="testing.txt";
        try{
            List<String> readlines= Files.readAllLines(Paths.get(newread));
            for(String line:readlines)
            {
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("try again");
        }

    }

}
