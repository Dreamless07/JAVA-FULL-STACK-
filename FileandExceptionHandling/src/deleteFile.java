import java.io.File;
public class deleteFile {
    public static void main(String[] args) {
        File file=new File("testingnew.abc");
        if(file.exists())
        {
            if(file.delete()){
                System.out.println("File deleted");
            }
            else{
                System.out.println("Unable to delete");
            }
        }
        else {
            System.out.println("No file present");
        }
    }
}
