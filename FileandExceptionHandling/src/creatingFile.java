import java.io.File;
public class creatingFile {
    public static void main(String[] args) throws Exception{
        String a="testingnew.abc";
        File newfile=new File(a);
        if(newfile.createNewFile()){
            System.out.println("File created successfully");
        }
        else {
            System.out.println("Please Retry ");
        }
    }
}
