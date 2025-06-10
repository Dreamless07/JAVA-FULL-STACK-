import java.io.FileOutputStream;//inbuilt libraries
public class creatingFile2 {
    public static void main(String[] args) {
        try(FileOutputStream binfile=new FileOutputStream("newimage.jpg")){//create a file in 2nd way
            System.out.println("Binary File created successfully");
        }
        catch (Exception e){//in case of exception
            System.out.println("Please Retry ");
        }
    }
}
