import java.io.FileOutputStream;
public class creatingFile2 {
    public static void main(String[] args) {
        try(FileOutputStream binfile=new FileOutputStream("newimage.jpg")){
            System.out.println("Binary File created successfully");
        }
        catch (Exception e){
            System.out.println("Please Retry ");
        }
    }
}
